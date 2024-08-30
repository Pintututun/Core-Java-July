package classnotes_of_CollectionsFramework;

import java.util.ArrayList;
import java.util.Date;

 class Student 
{
  private Integer studentRoll;
  private String studentName;
  private Double studentFees;
  private Date dateOfAdmission; //HAS-A Relation
  
  
public Student(Integer studentRoll, String studentName, Double studentFees, Date dateOfAdmission) {
	super();
	this.studentRoll = studentRoll;
	this.studentName = studentName;
	this.studentFees = studentFees;
	this.dateOfAdmission = dateOfAdmission;
}


@Override
public String toString() {
	return "Student [studentRoll=" + studentRoll + ", studentName=" + studentName + ", studentFees=" + studentFees
			+ ", dateOfAdmission=" + dateOfAdmission + "]";
}


public Integer getStudentRoll() {
	return studentRoll;
}


public void setStudentRoll(Integer studentRoll) {
	this.studentRoll = studentRoll;
}


public String getStudentName() {
	return studentName;
}


public void setStudentName(String studentName) {
	this.studentName = studentName;
}


public Double getStudentFees() {
	return studentFees;
}


public void setStudentFees(Double studentFees) {
	this.studentFees = studentFees;
}


public Date getDateOfAdmission() {
	return dateOfAdmission;
}


public void setDateOfAdmission(Date dateOfAdmission) {
	this.dateOfAdmission = dateOfAdmission;
}
  
}
public class ArrayListDemo1 {
	public static void main(String[] args) 
	{
		ArrayList<Student> al = new ArrayList<>();
		Date d = new Date();
		al.add(new Student(101, "Virat", 12000.78, d));
		al.add(new Student(102, "Dhoni", 13000.78, d));
		al.add(new Student(103, "Rohit", 14000.78, d));
		al.add(new Student(104, "Rahul", 15000.78, d));
		
		al.forEach(st -> System.out.println(st));
		
	}
}
