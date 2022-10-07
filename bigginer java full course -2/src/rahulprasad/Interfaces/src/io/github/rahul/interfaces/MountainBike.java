package io.github.rahul.interfaces;

class MountainBike implements Bicycle {
	
	private int seatHeight;
	private int gear;
	private int speed;

	
	public MountainBike(int startHeight,int startSpeed,int startGear) {
		
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
	 * @param seatHeight
	 */
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
	/**
	 * 
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	
	/**
	 * @param speed
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
		this.gear=gear;
	}
	
}
