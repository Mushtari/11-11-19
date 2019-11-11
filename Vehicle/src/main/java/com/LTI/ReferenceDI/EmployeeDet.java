package com.LTI.ReferenceDI;

public class EmployeeDet{

	Department d;
	public Department getDepartment(){
		return d;
	}
	public void setDepartment(Department d)
	{
		this.d=d;
	}
	public void move() {
		d.salary();
		
	}

}
