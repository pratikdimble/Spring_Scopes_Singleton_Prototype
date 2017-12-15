package com.pratik.entity;

public class person {

	private int perId;
	private String perName;
	public int getPerId() {
		return perId;
	}
	public void setPerId(int perId) {
		this.perId = perId;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	@Override
	public String toString() {
		return "person [perId=" + perId + ", perName=" + perName + "]";
	}
	
}
