package org.usfirst.frc.team2990.joshcontroller;

import edu.wpi.first.wpilibj.Joystick;

public class JoshControllor {
	
	public Joystick controllor;
	
	public JoshControllor()
	{
		controllor = new Joystick(3);
		//System.out.println(controllor.getType());
	}
	
	public boolean ButtonDown(int number) 
	{
		if (controllor.getRawButton(number) == true) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public double GetAxis(int axis)
	{
		return (controllor.getRawAxis(axis));
	}
	
}
