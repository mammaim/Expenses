package com.shareExpense;

public class GroupBean {
private String name;
private int mobileNmunber;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMobileNmunber() {
	return mobileNmunber;
}
public void setMobileNmunber(int mobileNmunber) {
	this.mobileNmunber = mobileNmunber;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + mobileNmunber;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	GroupBean other = (GroupBean) obj;
	if (mobileNmunber != other.mobileNmunber)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

}
