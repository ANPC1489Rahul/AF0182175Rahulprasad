interface vehicle
{
	String Name="TVS";
	void start()
	void stop()
	default void color()
	{
		System.out.println("TVS color is Green");
	}
	
	static void speed()
	{
		System.out.println("TVS speed is 100km/hr");
	}
}
class Customer implements vehicle
{
	@override
	public void start()
	{
		System.out.println("Start(): insrt key & press start button "+Name);
	}

	@override
	public void stop()
	{
		System.out.println("Stop(): exit key");
	}
	
	public static void main(String[] args) {
		
		Customer c=new Customer();
		d.start(); c.stop();
		vehicle.speed();

	}

}

output: Start(): insrt key & press start button TVS
Stop(): exit key
TVS color is Green
TVS speed is 100km/hr

