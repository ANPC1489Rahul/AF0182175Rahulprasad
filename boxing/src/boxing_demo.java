import java.util.Scanner;

public class boxing_demo {

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
		
		Integer i1=new Integer(num);
		
		System.out.println("The value of object is ="+i1);
	}

}
