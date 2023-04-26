package com.company;

class Person
{
	int id;
	String name;

	Person(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}

class Emp extends Person
{
	float salary;

	Emp(int id, String name, float salary)
	{
		super(id, name);// reusing parent constructor
		this.salary = salary;
	}
}
class Emp1 extends Emp 
	{
		float incentative;

		Emp1(int id, String name, float salary, float incentative)
		{
			super(id, name, salary);// reusing parent constructor
			this.incentative = incentative;
		}

		void display() 
		{
			System.out.println(id + " " + name + " " + salary + " " + incentative);
		}
	}

class Super
{
 public static void main(String[] args)
{  
Emp1 e1=new Emp1(1,"Subhas",45000f, 10000f);  
e1.display();   

}
}