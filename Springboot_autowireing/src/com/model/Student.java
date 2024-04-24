package com.model;

public class Student {
private int rollno;
private String name;
private double marks;

private Address adr;

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getMarks() {
	return marks;
}

public void setMarks(double marks) {
	this.marks = marks;
}

public Address getAdr() {
	return adr;
}

public void setAdr(Address adr) {
	this.adr = adr;
}
}
