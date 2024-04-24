package com.model;

public class Contacts {
private String sim;
private long contact;

public Contacts(String sim, long contact) {
	this.sim=sim;
    this.contact=contact;
}

public String getSim() {
	return sim;
}

public long getContact() {
	return contact;
}
}