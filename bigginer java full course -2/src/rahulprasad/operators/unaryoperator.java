package rahulprasad.operators;

public class unaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = +1;
		
		//result is now 1
		System.out.println(result);
		
		result--;
		//result is now 0
		System.out.println(result);
		
		result++;
		//result is now 1
		System.out.println(result);
		
		result= -result;
		//result is now -1
		System.out.println(result);
		
		boolean success=false;
		//false
		System.out.println(success);
		//true
		System.out.println(!success);
	}

}
