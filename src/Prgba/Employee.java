package Prgba;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
	int empid;
	String empname;
	int empno;
	public  Employee(int empid,String empame,int empno) {
		this.empid=empid;
		this.empname=empame;
		this.empno=empno;
	}
	public void getEmployeeDetals() {
	System.out.println("Employee Details:");
	System.out.println("Employee Id :"+empid);
	System.out.println("Employee Name: "+empname);
	System.out.println("Employee Numbr:"+empno);
	}
}
class Test {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Employee e=new Employee(111,"mahesh",66);
		oos.writeObject(e);
		
	}
}
