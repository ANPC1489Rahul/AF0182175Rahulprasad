package rahul.polymorphism.MethodOverriding;

public class MountainBike extends Bicycle {
	
	
	public int seatHeight;
	
	public MountainBike(int startHeight, int startSpeed, int startGear) {
		// TODO Auto-generated method stub
		super(startSpeed, startGear);
		seatHeight=startHeight;
	}
	
	public void seatHeight(int newValue) {
		seatHeight = newValue;
	}
	
	
	public void setGear(int newValue) {
		gear = newValue+2;
	}
	
	public void applyBrake(int decrement) {
		speed = speed-decrement-10;
	}
	
	public void speedUp(int increment) {
		speed = speed + increment+10;
	}
	
}
