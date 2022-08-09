import java.util.Scanner;

public class unboxing_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo_auto();
	}
	public static void demo_auto()
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		Integer i2=sc.nextInt();
		Integer i1=num;
		
		System.out.println("The value of object is ="+i1);
	}

}

output:
Enter a number
34
55
The value of object is =34

