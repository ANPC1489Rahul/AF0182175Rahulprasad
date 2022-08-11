package demo1;

public class Main1
{
	// main method that create the object or another classes and calls the method
		public static void main(String[] args) {
			Fibo ob = new Fibo(); // FIbonacci_Series object creation
			Reverse ob1 = new Reverse(); // Reverse_no class object creation
			ob.start(); // calls run method
			ob1.start(); // calls run method

}
--------------------------------------------------------------------------------------------------------------------------
package demo1;

import java.util.Scanner;

public class Fibo extends Thread
{
	
		//global variable declaration  
		Scanner sc = new Scanner(System.in);
	    int n1, n2,n3,i,j ,temp=0;
		int[] arr = new int[10];
		public void run()
		{
	        
	        // taking the two values from user
	        System.out.print("Please enter the two value for Fibonacci Series : ");
	        n1 = sc.nextInt();
	        n2 = sc.nextInt();
	        System.out.println(" Your starting value is : "+n1+"   Your Ending value is : "+n2);  // starting value or last value
	               
	        
	        for(int i=2 ; i<10; ++i) // loop run for 10 times only
	        {
	            // adding the stating value and last value
	            n3 = n1+n2;
	            try {
	            	sleep(1000); // sleeping the thread for 1 sec
	            }catch(Exception e) {
	            	System.out.println(e);
	            }
	            System.out.print(" "+n3);
	            // interchange value
	            n1 = n2;
	            n2 = n3;
	        }
		}

}

--------------------------------------------------------------------------------------------------------------------------------------

package demo1;

public class Reverse extends Fibo 
{
	// run method
		public void run() { 
			try{
				sleep(10000); // sleeping run method for 10 sec
			}catch(Exception e)
			{
				System.out.println(e);
			}
				
			System.out.print("Enter the 10 Values here : "); // taking a 10 values from user
			for(i=0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt(); // taking value from user in to loop form
			}
			 for(i=0; i<arr.length; i++) // checking the value 
		        {
		            for(j=i+1; j<arr.length; j++) // which value is greater than 
		            {
		                if(arr[i]<arr[j]) // checking greater value here
		                {
		                   temp = arr[i]; // interchange the value
		                   arr[i] = arr[j];
		                   arr[j] = temp; 
		                }
		            }
		        }
		        
		        // breaking the line
		        System.out.println();
		        for (int i = 0; i < arr.length; i++) // printing the values from decrement order 
		         {   
		        	 System.out.print(arr[i] + " ");
		        		                
		         }  
		}
}
