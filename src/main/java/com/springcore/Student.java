package com.springcore;

public class Student {

	private String studentName;
	private int id;
	private String address;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", id=" + id + ", address=" + address + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, int id, String address) {
		super();
		this.studentName = studentName;
		this.id = id;
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
