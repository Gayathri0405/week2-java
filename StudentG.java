package pack2;

import pack2.StudentG;

public class StudentG {
	String name, city;
	int age;
	static int m;
	void printData() {
	System.out.println("Student name = "+name);
	System.out.println("Student city = "+city);
	System.out.println("Student age = "+age);
	}
	}
	class Stest {
	public static void main(String args[])
	{
	StudentG s1=new StudentG();
	StudentG s2=new StudentG();
	s1.name="Nikith";
	s1.city="Rajahmundry";
	s1.age=22;
	s2.name="Meghana";
	s2.city="Mumbai";
	s2.age=21;
	s2.printData();
	s1.printData();
	s1.m=20;
	s2.m=22;
	StudentG.m=27;
	System.out.println("s1.m = "+s1.m);
	System.out.println("s2.m = "+s2.m);
	System.out.println("Student.m ="+StudentG.m);
}
	}
	
