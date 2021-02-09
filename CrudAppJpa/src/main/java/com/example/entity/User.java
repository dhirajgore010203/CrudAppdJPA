package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private Integer rollNo;
	private String name;
	private String branch;
	private String college;
	private Integer mobile;
	private Address address;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer rollNo, String name, String branch, String college, Integer mobile, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
		this.college = college;
		this.mobile = mobile;
		this.address = address;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [rollNo=" + rollNo + ", name=" + name + ", branch=" + branch + ", college=" + college + ", mobile="
				+ mobile + ", address=" + address + "]";
	}
	
	
	
}
