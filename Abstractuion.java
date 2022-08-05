import java.util.Scanner;
class Bank
{
	public String Name="myBank";
	public String IFSC="myBank123";
	
	public void bankDetail()
	{
		System.out.println("Bank_Name: "+Name+" "+"Bank_IFSC code: "+IFSC);
		
	}
	abstract void deposite();
	abstract void Withdraw();
	abstract void CheckBal();
}
class bankService extends Bank
{
	private double bal=5000;
	private int pwd;
	public double money;
	
	public void Deposite()
	{
		System.out.println("Enter password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1234)
		{
			System.out.println("Enter Deposite Amount: ");
			money=s.nextDouble();
			bal=bal+money;
			System.out.println("Deposited Money: "+ money);
			System.out.println("Total Balance: +bal");
		}
		else
		{
			System.out.println("Incorrect Password");
		}
	}
	public void withdraw()
	{
		System.out.println("Enter Password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1234)
		{
			System.out.println("Enter Withdraw Amount: ");
			money=s.nextDouble();
			bal=bal-money;
			System.out.println("Withdraw Money: "+money);
			System.out.println("Total Balance: "+bal);
		}
		else
		{
			System.out.println("Incorrect Password");
		}
	}
	public void CheckBal()
	{
		System.out.println("Enter password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1234)
		{
			System.out.println("Total Balance: "+bal);
		}
		else
		{
			System.out.println("Incorrect Password...");
		}
	}
}

class Customers {
	public static void main(String[] args) {
		
		bankService=new bankService();
		b.bankDetail();
		
		int ch;
		System.out.println("1.Deposite: ");
		System.out.println("2.Withdraw: ");
		System.out.println("3.Checkbalance: ");
		
		System.out.println("\nEnter your choice: ");
		Scanner s2=new Scanner(System.in);
		ch=s2.nextInt();
		
		switch(ch)
		{
		    case 1: b.Deposite(1000);
		    break;
		    case 2: b.withdraw(2000);
		    break;
		    case 3: b. CheckBal();
		    break;
		    default: System.out.println("Invalid Choice");
		}
		
	}

}

output: Bank_Name: myBank Bank_IFSC Code: MyBank1234
1.Deposite:
2.Withdraw:
3.CheckBalance:

Enter your choice:1
Enter Password:1234
Enter Deposite Amount:2000
Deposited Money: 2000.0
Total BalanceL: 7000.0  
