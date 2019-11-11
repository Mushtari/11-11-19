package com.LTI.ReferenceDI;

public class Car{

	Wheel w;
	public Wheel getWheel(){
		return w;
	}
	public void setWheel(Wheel w)
	{
		this.w=w;
	}
	public void move() {
		w.rotate();
		
	}

}
