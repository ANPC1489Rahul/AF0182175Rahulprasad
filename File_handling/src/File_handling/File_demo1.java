package File_handling;

import java.io.*;
import java.util.Scanner;

public class File_demo1 {

	public static void main(String[] args) throws IOException {
		//Create_file();
		Write_demo();
		//Read_demo();
		
		
	}
	public static void Write_demo() throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a file name: ");
		String file=sc.nextLine();
		FileWriter writer=new FileWriter(file+".txt");
		System.out.println("Enter what you want to write ");
		String str=sc.nextLine();
		writer.write(str);
		writer.close();
		System.out.println("write done");
		
	}

	public static void Read_demo() {
		
		try 
		{
			System.out.println("file data is: ");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a file name: ");
			String file=sc1.nextLine();
			File f=new File(file+".txt");
			Scanner sc=new Scanner(f);
			long size=f.length();
			int i;
			for(i=0; i<size; i++)
			{
				String st=sc.next();
				System.out.println(st);
				
			}
			
			
		}
		
		catch(Exception e) {
			
			System.out.println(" ");
		}
		
		
	}
	
	public static void Create_file() throws IOException{
		
		File f=new File("third.txt");
		f.createNewFile();
		System.out.println("file created");
	}
	
}
