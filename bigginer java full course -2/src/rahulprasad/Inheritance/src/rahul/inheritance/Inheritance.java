package rahul.inheritance;

class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mountainBike=new MountainBike(20, 10, 1);
		System.out.println("Gear is: " + mountainBike.Gear);
		System.out.println("Seat height is: " + mountainBike.seatHeight);
		System.out.println("Bike speed is: " + mountainBike.Speed);
		
		mountainBike.applyBrake(6);
		System.out.println("Bike speed after applaying break is: " + mountainBike.Speed);
	}

}
