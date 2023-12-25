package javaInheritance;

public class MountainBike extends Bicycle
{
	
	private int seatHeight;

	public MountainBike(int startHeight,  int startSpeed, int startGear) 
	{
		super(startSpeed, startGear);	
		this.setSeatHeight(startHeight); 
	}
	
	public void setHeight(int newHeight)
	{
		this.setSeatHeight(newHeight);
	}

	/**
	 * @return the seatHeight
	 */
	public int getSeatHeight() {
		return seatHeight;
	}

	/**
	 * @param seatHeight the seatHeight to set
	 */
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	@Override
	public void setGear(int gear) 
	{
		this.gear = gear+2;
	}
	@Override
	public void applyBrake (int decrement)
	{
		speed -= decrement-5;
	}
	@Override
	public void speedUp (int increment)
	{
		speed += increment+10;
	}

}
