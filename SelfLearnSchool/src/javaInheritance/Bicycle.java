package javaInheritance;

public class Bicycle 
{
	protected int gear;
	protected int speed;
	
	public Bicycle (int startSpeed, int startGear) 
	{
		setGear(startGear);
		setSpeed(startSpeed);
	}

	/**
	 * @return the gear
	 */
	public int getGear() {
		return gear;
	}

	/**
	 * @param gear the gear to set
	 */
	public void setGear(int gear) {
		this.gear = gear;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void applyBrake (int decrement)
	{
		speed -=decrement;
	}
	public void speedUp(int increment) 
	{
		speed += increment;
	}
}
