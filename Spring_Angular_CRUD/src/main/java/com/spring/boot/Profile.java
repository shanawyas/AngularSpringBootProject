package com.spring.boot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(unique = true)
private String userCode;
private String userName;
private String fatherName;
private String motherName;
private String contact;
private String address;
private String imagePath;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getUserCode() {
	return userCode;
}
public void setUserCode(String userCode) {
	this.userCode = userCode;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getFatherName() {
	return fatherName;
}
public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}
public String getMotherName() {
	return motherName;
}
public void setMotherName(String motherName) {
	this.motherName = motherName;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getImagePath() {
	return imagePath;
}
public void setImagePath(String imagePath) {
	this.imagePath = imagePath;
}
@Override
public String toString() {
	return "Profile [id=" + id + ", userCode=" + userCode + ", userName=" + userName + ", fatherName=" + fatherName
			+ ", motherName=" + motherName + ", contact=" + contact + ", address=" + address + ", imagePath="
			+ imagePath + "]";
}

}
