import java.util.Scanner;

public class AbbreviateName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbbreviateName obj1=new AbbreviateName();
		obj1.takeName();
	}
	public void takeName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		String name=sc.nextLine();
		String arrname[]=name.split(" ");
		int lengthofArray=arrname.length-1;
		
		for(int i=0;i<arrname.length;i++)
		{
			if(i<arrname.length-1)
			{
			String temp=arrname[i];
			System.out.println(temp.charAt(0));
			}
			else if(i==lengthofArray)
			{
				System.out.println(arrname[i]);
			}
		}
	}

}
