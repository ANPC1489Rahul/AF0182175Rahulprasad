package rahul_loops;

public class Nested_Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{2,7,9},{6,7,4},{5,1,3}};
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
