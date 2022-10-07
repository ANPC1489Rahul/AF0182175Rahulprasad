package rahul.MultipleInheritaceusingInterface;

class MountainBike extends TwoWheeler implements Bicycle, Vehicle {
	
	private int seatHeight;
	private int gear;
	private int speed;
	
	public MountainBike(int startHeight, int startSpeed, int startGear) {
		seatHeight=startHeight;
		speed=startSpeed;
		gear=startGear;
		
	}

	@Override
	public void applyBrake(int decrement) {
		speed=speed-decrement;
		
	}

	@Override
	public void speedUp(int increment) {
		speed=speed+increment;
		
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

	@Override
	public void canDrive() {
		// TODO Auto-generated method stub
		System.out.println("mountain bike can be driven");
		
	}
	

}
