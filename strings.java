
import java.util.Scanner;
public class String_demo {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First string");
			String s1=sc.next();
			System.out.println("Enter second string");
			String s2=sc.next();
			int res;
			res=s1.compareTo(s2);
			System.out.println("The res value is="+res);
			if(res==0)
			{
				System.out.println("The string 1 is equal to s2");
			}
			else
			{
				System.out.println("It is not equal");
			}

		}

}

output:
Enter First string
abc
Enter second string
xy
The res value is=-23
It is not equal

------------------------------------------------------

import java.util.Scanner;
public class string_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=sc.nextLine();
		String[] s3=s1.split("a ");
		for(String s4:s3)
		{
			System.out.println(s4);
		}

	}	

}

output:
Enter First string
rahul raju rohit
Enter second string
The res value is=-2
It is not equal

----------------------------------------------------------------

import java.util.Scanner;
public class String_Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=sc.nextLine();
		System.out.println("Replace"+s1.replace('a', 'p'));
	}

}

output:
Enter first string
rahul
Replacerphul

---------------------------------------------------------------------

import java.util.Scanner;
public class string_method_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=sc.nextLine();
		boolean res1=s1.contains("ab");
		System.out.println("The result of contains method="+res1);

	}

}

output:
nter first string
abht
The result of contains method=true

  
 ---------------------------------------------------------------
  
  import java.util.Scanner;
public class string_location {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=sc.nextLine();
		int res;
		res=s1.indexOf('i',3);
		
		System.out.println("The location of i:"+res);

	}

}

output:
Enter first string
pitiyy
The location of i:3

----------------------------------------------------------------
  
  import java.util.Scanner;
public class string_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=sc.nextLine();
    System.out.println("Enter second string");
		String s2=sc.next();
		String s3=s2.concat(s1);
		System.out.println("name="+s3);
		String demo22="Hello"+23+56+"ab"+67+99;
		String demo33="23"+56+67+"a";
		System.out.println("val="+demo22+" and demo 33="+demo33);
  }
  
}
	
output:
Enter first string
fds
Enter second string
ds
name=dsfds
val=Hello2356ab6799 and demo 33=235667a


