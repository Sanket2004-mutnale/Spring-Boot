package com.SpringBoot.Springbootapplication2;

public class Student {
	
	private String Name;
	private int rollno;
	private float marks;
	
	public Student(String Name, int rollno, float marks) {
		this.Name=Name;
		this.rollno=rollno;
		this.marks=marks;
		
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void displayStuDetails() {
		System.out.println("Name:-"+Name);
		System.out.println("Roll No:-"+rollno);
		System.out.println("Marks:- "+marks);
	}
	

}
