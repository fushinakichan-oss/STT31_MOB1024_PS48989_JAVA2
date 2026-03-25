package Bai4_Lab3;

import Bai4_Lab3.EnumStudentType.StudentType;

public class Student {
	String id;
	String name;
	Bai4_Lab3.EnumStudentType.StudentType type;
	double gpa;
	
	public Student(String id, String name, StudentType type, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.gpa = gpa;
	}
	
	public Student() {
		super();
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Bai4_Lab3.EnumStudentType.StudentType getType() {
		return type;
	}
	
	public void setType(Bai4_Lab3.EnumStudentType.StudentType type) {
		this.type = type;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", type=" + type + ", gpa=" + gpa + "]";
	}
	

}
