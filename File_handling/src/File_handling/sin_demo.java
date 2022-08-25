package File_handling;

public class sin_demo 
{
	private static sin_demo s1=null;
	
	private sin_demo()
	{
		System.out.println("The private Constructor");
	}
	
	public static sin_demo met_ins()
	{
		if(s1==null)
		{
			s1=new sin_demo();
			
		}
		return s1;
	}

}
