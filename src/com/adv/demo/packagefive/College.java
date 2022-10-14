package com.adv.demo.packagefive;

public class College {

	private int collegeCode;
	private String collegeName;
	private int foundedYear;
	private String founderName;
	private String principalName;
	private int noOfBuses;

	public College() {
	}

	public College(int code, String clgName, int foundyear, String FoundName, String principalName, int noBuses) {
		this.collegeCode = code;
		this.collegeName = clgName;
		this.foundedYear = foundyear;
		this.founderName = FoundName;
		this.principalName = principalName;
		this.noOfBuses = noBuses;
	}

	public College(int foundyear, int noBuses, String clgName, String FoundName, String principalName) {
		this.collegeName = clgName;
		this.foundedYear = foundyear;
		this.founderName = FoundName;
		this.principalName = principalName;
		this.noOfBuses = noBuses;
	}

	public College(int code, String clgName, int foundyear, String principalName, int noBuses, String FoundName) {
		this.collegeCode = code;
		this.collegeName = clgName;
		this.foundedYear = foundyear;
		this.founderName = FoundName;
		this.principalName = principalName;
		this.noOfBuses = noBuses;
	}

	public College(int code, int foundyear, int noBuses) {
		this.collegeCode = code;
		this.foundedYear = foundyear;
		this.noOfBuses = noBuses;
	}

	public College(String clgName, String FoundName) {
		this.collegeName = clgName;
		this.founderName = FoundName;
	}

	public College(String FoundName, String principalName, int noBuses) {
		this.founderName = FoundName;
		this.principalName = principalName;
		this.noOfBuses = noBuses;
	}

	public College(String clgName, int foundyear, String FoundName, int code, String principalName, int noBuses) {
		this.collegeCode = code;
		this.collegeName = clgName;
		this.foundedYear = foundyear;
		this.founderName = FoundName;
		this.principalName = principalName;
		this.noOfBuses = noBuses;
	}

	public College(int code, String clgName, int foundyear, String FoundName) {
		this.collegeCode = code;
		this.collegeName = clgName;
		this.foundedYear = foundyear;
		this.founderName = FoundName;
	}

	public College(int code, String clgName, String FoundName, String principalName, int noBuses) {
		this.collegeCode = code;
		this.collegeName = clgName;
		this.founderName = FoundName;
		this.principalName = principalName;
		this.noOfBuses = noBuses;
	}

	public College(int foundyear, String FoundName, int bus) {
		this.foundedYear = foundyear;
		this.founderName = FoundName;
	}

	public College(String clgName, String FoundName, String principalName, int code, int foundyear, int noBuses) {

	}

	public College(String clgName, String FoundName, String principalName) {
		this.collegeName = clgName;
	}

	public College(int code, String clgName) {
		this.collegeCode = code;
		this.collegeName = clgName;
	}

	public College(int code, int foundyear, String FoundName) {
		this.collegeCode = code;
		this.foundedYear = foundyear;
		this.founderName = FoundName;
	}

	public College(int code) {
		this.collegeCode = code;
	}

	public College(String clgName, int code) {
	}

	public int getCollegeCode() {
		return collegeCode;
	}

	public void setCollegeCode(int code) {
		this.collegeCode = code;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String name) {
		this.collegeName = name;
	}

	public int getFoundedYear() {
		return foundedYear;
	}

	public void setFoundedYear(int year) {
		this.foundedYear = year;
	}

	public String getFounderName() {
		return founderName;
	}

	public void setFounderName(String name) {
		this.founderName = name;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String name) {
		this.principalName = name;
	}

	public int getNoOfBuses() {
		return noOfBuses;
	}

	public void setNoOfBuses(int bus) {
		this.noOfBuses = bus;
	}

}
