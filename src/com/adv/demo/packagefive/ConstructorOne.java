package com.adv.demo.packagefive;

public class ConstructorOne {
	private String name;
	private int regNo;
	private String course;
	private String dept;

	public ConstructorOne() {
//		this(10, "Anbu","msc", "cs");
		System.out.println("Default constructor");
	}

	public ConstructorOne(int regno) {
		this.regNo = regno;
	}

	public ConstructorOne(int regno, String course, String dept) {
		this(regno);
		this.course = course;
		this.dept = dept;
	}

	public ConstructorOne(int regno, String name, String course, String dept) {
		this(regno, course, dept);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public static ConstructorOne getInstance() {
		ConstructorOne co1=new ConstructorOne();
		return co1;
	}

}
