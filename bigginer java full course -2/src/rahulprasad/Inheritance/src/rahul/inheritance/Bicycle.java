package rahul.inheritance;

class Bicycle {
	
	protected int Gear;
	protected int Speed;
	
	public Bicycle(int startSpeed, int startGear) {
		Gear=startGear;
		Speed=startSpeed;
	}

	public void setGear(int newValue) {
		Speed = newValue;
	}
	
	public void applyBrake(int decrement) {
		Speed -= decrement;
	}

	public void speedUp(int increment) {
		Speed += increment;
	}

}
