package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class College {
private List<String> cname;
private Set<String> department;
private Map<Integer,String> course;
public List<String> getCname() {
	return cname;
}
public void setCname(List<String> cname) {
	this.cname = cname;
}
public Set<String> getDepartment() {
	return department;
}
public void setDepartment(Set<String> department) {
	this.department = department;
}
public Map<Integer, String> getCourse() {
	return course;
}
public void setCourse(Map<Integer, String> course) {
	this.course = course;
}
}