package demo1;

import demo1.Prac1;

public class Prac2 
{
	public static void main(String[] args)
	{
		Prac1 ob = new Prac1("ACTIVE"); // passing the argument to the constructor
		Prac1 ob1 = new Prac1("UNACTIVE"); // passing the argument to the constructor
		System.out.println("Display Output Here..");
		ob.start(); // calling the run method
		ob1.start(); // calling the run method
	}
}

----------------------------------------------------------------------------------------------------
package demo1;

import demo1.Prac2;

public class Prac1 extends Prac2
{ 
	String str; // global variable
	public Prac1(String string) {
		// TODO Auto-generated constructor stub
	}

	void Thread_Infinity(String s) // constructor taking a parameter
	{
		str = s;
	}
  
  public void run() // run method calling by the another class
	{
		
		for (;;) // infinity loop
		{
			    System.out.println((Thread.currentThread()).getName()+" "+"Message: "+str); // printing the message
	            System.out.println((Thread.currentThread()).getName()+" "+"Priority:  "+(Thread.currentThread()).getPriority()); // printing the priority here
	             
	            try
	            {
	                Thread.sleep(1000); // sleeping the thread for 1 sec
	            }
	            catch(Exception e)
	            { 
	                System.out.println(e);
	            }
	    }
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

	

}
