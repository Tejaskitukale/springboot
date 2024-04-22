package com.model;

public class User {
private int uid;
private String uname;
private String password;

public User(int uid, String uname, String password) {
	this.uid=uid;
	this.uname=uname;
	this.password=password;
	
}

public int getUid() {
	return uid;
}

public String getUname() {
	return uname;
}

public String getPassword() {
	return password;
}
}
