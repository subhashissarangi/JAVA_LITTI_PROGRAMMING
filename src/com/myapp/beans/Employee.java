package com.myapp.beans;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int age;
	private char sex;
	private Date dob;
	private Address homeAddress;
	private Address resAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getResAddress() {
		return resAddress;
	}

	public void setResAddress(Address resAddress) {
		this.resAddress = resAddress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((homeAddress == null) ? 0 : homeAddress.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((resAddress == null) ? 0 : resAddress.hashCode());
		result = prime * result + sex;
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
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (homeAddress == null) {
			if (other.homeAddress != null)
				return false;
		} else if (!homeAddress.equals(other.homeAddress))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (resAddress == null) {
			if (other.resAddress != null)
				return false;
		} else if (!resAddress.equals(other.resAddress))
			return false;
		if (sex != other.sex)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", dob=" + dob
				+ ", homeAddress=" + homeAddress + ", resAddress=" + resAddress + "]";
	}

}
