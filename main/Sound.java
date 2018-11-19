package main;

public class Sound {
	private double speed;
	private double interval;
	public Sound(double s, double i) { 
		speed = s; 
		interval = i; 
	}

	public Sound()
	{
		
	}

	public void set(double s, double i) { 
		speed = s; 
		interval = i; 
	}
	
	public double distance()
	{
		double dis = interval * speed;
		return dis;	
	}
}