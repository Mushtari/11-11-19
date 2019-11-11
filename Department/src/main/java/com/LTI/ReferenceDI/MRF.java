package com.LTI.ReferenceDI;

public class MRF implements Wheel{
	
	
	Wheel w;
	public void rotate(){
		System.out.println("Rotate");
	}
	public void setWheel(Wheel w)
	{
		this.w=w;
	}
	

}
