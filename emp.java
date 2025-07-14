package com;
class Empdetails{
	int empid;
	String empname;
	float empsalary;
	String empdesig;
	String empdept;
	boolean empstatus;
	void cal(float a) {
		empsalary=a;
		empsalary=empsalary+a;
		System.out.println(empsalary);
		
		
	}
	void Insert(int i,String b,float c,String d,String e,boolean f) {
		empid=i;
		empname=b;
		empsalary=c;
		empdesig=d;
		empdept=e;
		empstatus=f;
	}
	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsalary);
		System.out.println(empdesig);
		System.out.println(empdept);
		System.out.println(empstatus);
		
	}
	}
public class emp {
	public static void main(String[]args) {
		Empdetails p1= new Empdetails();
		p1.Insert(101, "pooja", 30000.85f, "softwaredevp", "IT", true);
		p1.display();
		p1.cal(23.78f);
		p1.cal(22.12f);
		p1.cal(24.78f);
		p1.cal(25.78f);
	}

}
