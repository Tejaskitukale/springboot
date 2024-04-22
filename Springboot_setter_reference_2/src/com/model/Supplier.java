package com.model;

import java.util.List;

public class Supplier {
private int sid; 
private String sname;
List <String> contacts;

private Address adr;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public List<String> getContacts() {
	return contacts;
}
public void setContacts(List<String> contacts) {
	this.contacts = contacts;
}
public Address getAdr() {
	return adr;
}
public void setAdr(Address adr) {
	this.adr = adr;
}
}
