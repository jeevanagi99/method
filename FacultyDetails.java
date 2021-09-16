package com.X_workz.methods;

public class FacultyDetails {
public static int SalaryOfFaculty(int subject,int salary) {
	int Salary=subject*salary;
	return salary;
}
public static void main(String args[]) {
	int subject=4;
	int salary=40000;
	int totalsalary;
	totalsalary=FacultyDetails.SalaryOfFaculty(subject,salary);
	System.out.println(totalsalary);
}
}
