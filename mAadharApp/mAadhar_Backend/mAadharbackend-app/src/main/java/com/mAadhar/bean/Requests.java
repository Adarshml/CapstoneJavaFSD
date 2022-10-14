package com.mAadhar.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class Requests {

	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(columnDefinition = "CHAR(32)")
	@Id
	private String adharid;
	private String emailid;
	private String name;
	private int age;
	private String address;
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAdharid() {
		return adharid;
	}
	public void setAdharid(String adharid) {
		this.adharid = adharid;
	}
	@Override
	public String toString() {
		return "Requests [adharid=" + adharid + ", emailid=" + emailid + ", name=" + name + ", age=" + age
				+ ", address=" + address + "]";
	}
	
	
}
