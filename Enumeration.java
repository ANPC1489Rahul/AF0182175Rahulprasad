import java.util.Scanner;

public class Food_items {
	
	enum food
	{
		Manchurian(100),Dhosa(80),Noodles(150),SpringRoll(130),GarlicBread(60);
		int item;
		food(int item)
		{
			this.item=item;
		}
		public int food_accept()
		{
			return item;
		}

	}

	public static void main(String[] args) 
	{   
	           
	         System.out.println("Enter the item name here : ");
	         Scanner sc=new Scanner(System.in);
	         String choice;
	         choice=sc.next();
	         try {
	        	 System.out.println("The price of "+choice+" : "+food.valueOf(choice).food_accept());
	         }
	         catch(Exception e)
	         {
	        	 System.out.println("Please Choose correct item here ");
	         }
	
	}

}


output:
Enter the item name here :                            
idli                                                   
Please Choose correct item here                                                        
                     
           
					 OR
										
Enter the item name here : 	
Dhosa
The price of Dhosa : 80

