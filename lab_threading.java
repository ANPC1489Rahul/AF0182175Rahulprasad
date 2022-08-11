package demo1;

public class Main
{
	public static void main(String[] args) // main method
	{
		Prob pc = new Prob(); // creating object of Problem class
		Producer p1 = new Producer(pc, 1); // creating object of Producer_class and passing the arguments to the constructor
		Consumer c1 = new Consumer(pc, 2);  // creating object of Consumer_class and passing the arguments to the constructor
	      c1.start(); // calling a run method
	      p1.start(); // calling a run method
	}
}
-----------------------------------------------------------------------------------------------------------------
package demo1;

public class Prob
{
	 int materials;  // global variables here
	    boolean available = false;
	    public synchronized int get() // synchronized method to get a true or false
	    {
	          while (available == false) // while loop for false condition
	          {
	                try
	                {
	                      wait(); // if false then problem will be wait
	                }
	                catch (InterruptedException ie) // catching the exception
	                {
	                }
	          }
	          available = false; // material not available
	          notifyAll();
	          return materials; //return a material to the method
	    }
	    public synchronized void put(int value) // synchronized method for true conditions
	    {
	          while (available == true) // while loop for true condition
	          {
	                try
	                {
	                      wait(); // wait the program
	                }
	                catch (InterruptedException ie) // catching the Interrupted Exception here
	                {
	                      ie.printStackTrace();
	                }
	          }
	          materials = value; // material available in a value
	          available = true; // material available here
	          notifyAll();
	    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

package demo1;

public class Producer extends Thread
{
     //use the thread class property.......
Prob  Shop;  //declared variable for using the class name.........
int number;           //declared varaible and data type......

public Producer(Prob pc, int i) {
	// TODO Auto-generated constructor stub
}
public void Producer_Class(Prob c, int number) //create construtor and taking a paramether
{
Shop = c;
this.number = number;	//use this keyword for use the same class variable
}
public void run()			//create run method.....
{
for (int i = 0; i < 10; i++)  //using  for loop....
{
   
   System.out.println("Produced value " + this.number+ " put: " + i);
   try						//use try block where exception show........
   {
  	
         sleep((int)(Math.random() * 100));	//sleep method of thread
   }
   catch (InterruptedException ie)		//catch block to handle the exception.....
   {
       System.out.println(ie);			//simply print the exception.......
   }
}
}

}
-------------------------------------------------------------------------------------------------------------------------------------------------------

package demo1;

public class Consumer extends Thread
{
	Prob Shop;	//declared variable for using the class name.........
    int num,value = 0,i;  //declared varaible and data type......
   
    public Consumer(Prob pc, int j) {
		// TODO Auto-generated constructor stub
	}
	//create construtor.............
    public void Consumer2(Prob c, int number)
    {
          Shop = c;
          this.num = number;//use this keyword for use the same class variable...........
    }
    public void run()//create run method......
    {
          for ( i = 0; i < 10; i++)//using the for loop
          {
                System.out.println("Consumed value " + this.num+ " got: " + value);//for print
          }
    }

}
