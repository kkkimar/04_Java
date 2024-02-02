package edu.kh.oop.method;

public class Student {

	public static String schoolName = "KH 대학교";
	public static final int MAX_VALUE =100;
	public static final int MIN_VALUE =0;
	
	private String name;
	private String studentNumber;
	private char gender;
	private int java;
	private int html;
	
	
	/*기본 생성자 만드는 방법*/
	public Student () {
		
	}
	
	/*매개변수 생성자*/
	public Student(String name, String studentNumber, char gender) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.gender = gender;
		
	}
	
	/*메서드*/
	
	//setter
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public void setGender(char gener) {
		this.gender = gender;
	}
	
	public void setJava(int java) {
		this.java = java;
	}
	
	public void setHtml(int html) {
		this.html = html;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
