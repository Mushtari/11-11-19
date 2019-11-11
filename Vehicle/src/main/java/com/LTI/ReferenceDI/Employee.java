package com.LTI.ReferenceDI;

public class Employee implements Department{
	
	
	Department d;
	public void salary(){
		System.out.println("Rotate");
	}
	public void setDepartment(Department d)
	{
		this.d=d;
	}
	

}
