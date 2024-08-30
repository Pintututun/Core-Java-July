package serialization_deserialization_OnArrayList;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class Student implements Serializable {
private Integer studentId;
private String studentName;
private Double studentFees;
private Date dateOfAdmission;
public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentFees = studentFees;
	this.dateOfAdmission = dateOfAdmission;
}
public static Student getStudentObject()
{
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the student id:");
 Integer id=sc.nextInt();sc.nextLine();
 System.out.print("Enter the student name:");
 String name=sc.nextLine();
 System.out.print("Enter the student fees:");
 Double fees=sc.nextDouble();
 Date dateOfAdmission=new Date();
 return new Student(id, name, fees, dateOfAdmission);
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
			+ ", dateOfAdmission=" + dateOfAdmission + "]";
}


}


