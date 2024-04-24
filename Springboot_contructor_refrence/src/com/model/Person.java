package com.model;

public class Person {
private int pid;
private String pname;
private String paddress;
private Contacts contactts;
public Person(int pid, String pname, String paddress,Contacts contactts) {
	this.pid=pid;
	this.pname=pname;
	this.paddress=paddress;
	this.contactts=contactts;
}
public int getPid() {
	return pid;
}
public String getPname() {
	return pname;
}
public String getPaddress() {
	return paddress;
}
public Contacts getContact() {
	return contactts;
}
}
