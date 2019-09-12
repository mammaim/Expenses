package com.shareExpense;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TracClass {

	public static List<GroupBean> groupList = new ArrayList<>();
	public static Set<String> groupNameSet = new HashSet<>();
	public static Map<String, GroupBean> groupPersons = new HashMap<String, GroupBean>();

	public static void main(String[] args) {
		defaultGroups();
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		String group = null;
		do {

			System.out.println("Enter GroupName :");
			group = scanner.next();
			if (groupNameSet.contains(group)) {
				System.out.println("Group name is already exist,you can use same or create new");
				System.out.println("You want to create new ?");
				String reg = scanner.next();
				if (reg.equalsIgnoreCase("Y")) {
					flag = true;
				} else {
					flag = false;
				}

			} else {
				groupNameSet.add(group);
				flag = false;
			}
		} while (flag);
		System.out.println("Person Name :");
		String person = scanner.next();

		System.out.println("Enter Phonumber :");
		String phoneNo = scanner.next();

		GroupBean groupBean = new GroupBean();
		groupBean.setName(person);
		groupBean.setMobileNmunber(Integer.parseInt(phoneNo));
		AddGroup(group, groupBean);
		showGroups(groupNameSet);

	}

	private static void AddGroup(String group, GroupBean groupBean) {
		if (!groupList.isEmpty())
			for (GroupBean groupBean2 : groupList) {
				if (groupBean2.equals(groupBean)) {
					System.out.println("Already Person exist");
				} else {
					groupList.add(groupBean);
				}
			}
		groupPersons.put(group, groupBean);
	}

	private static void showGroups(Set<String> groupNameSet) {

		System.out.println("Groups are :");
		for (String group : groupNameSet) {
			System.out.println(group);
		}

	}

	private static void defaultGroups() {
		groupNameSet.add("Test1");
		groupNameSet.add("Test2");
		groupNameSet.add("Test3");
		for (int i = 0; i < 3; i++) {
			GroupBean groupBean = new GroupBean();
			groupBean.setName("XXX" + i);
			groupBean.setMobileNmunber(123 + i);
			groupList.add(groupBean);
		}

	}

}
