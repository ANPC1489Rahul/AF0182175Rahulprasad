package rahul.inheritance;

class MountainBike extends Bicycle {

	public int seatHeight;
	
	public MountainBike(int StartHeight,int StartSpeed,int StartGear) {
		super(StartSpeed,StartGear);
		this.seatHeight=StartHeight;		
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

}
