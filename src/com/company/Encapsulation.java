package com.company;

class A {
	private int id; 
private int salary;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.setId(68);
		a.setSalary(50000);
System.out.println(a.getId());
System.out.println(a.getSalary());

	}
	
}
