package rahul.polymorphism;

public class MethodOverloadingDemo {
	
	public int multiply(int x, int y) 
	{
		return(x * y);
	}
	public int multiply(int x, int y, int z) 
	{
		return(x * y * z);
	}
	public double multiply(double x, double y) 
	{
		return(x * y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		System.out.println(demo.multiply(10, 30));
		System.out.println(demo.multiply(10, 30, 50));
		System.out.println(demo.multiply(10.5, 30.5));
	}
	
}