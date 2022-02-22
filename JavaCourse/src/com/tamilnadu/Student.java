package com.tamilnadu;

public class Student extends College {
  public void studentName() {
	System.out.println("Mithun Sai");

}
  public void studentDept() {
	System.out.println("Mechanical");

}
  public void studentId() {
	System.out.println("AM-123456");
}
  
  public static void main(String[] args) {
	Student S = new Student();
	S.studentName();
	S.studentDept();
	S.studentId();
	S.collegeName();
	S.collegeCode();
	S.collegeRank();
	S.deptName();
	S.hostelName();
}
}
