package File_handling;

import java.io.*;
import java.util.Scanner;


public class File_de 
{
	public static void writeFile() throws IOException
	{
		FileWriter obj=new FileWriter("abc.txt");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String str=sc.nextLine();
		
		obj.write(str);
		obj.close();
		System.out.println("Done .:)");
	}
	

	public static void readFile() throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("The data of my file is: ");
		File f=new File("abc.txt");
		Scanner sc=new Scanner(f);
		while(sc.hasNext())
		{
			String st=sc.next();
			System.out.println(st);
		}

	}
	public static void main(String[] args) throws IOException 
	{
		writeFile();
		readFile();
		
	}

}
