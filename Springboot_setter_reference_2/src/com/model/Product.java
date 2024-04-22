package com.model;

public class Product {
private int pid;
private String pname;
private String category;
private double price;

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Supplier getSup() {
	return sup;
}

public void setSup(Supplier sup) {
	this.sup = sup;
}

private Supplier sup;
}
