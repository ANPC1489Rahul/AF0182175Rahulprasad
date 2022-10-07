package rahul.conrolflow_statement.java;

public class if_else if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testscore=76;
		char grade;
		
		if(testscore >= 90) {
			grade = 'A';
		}
		else if(testscore >=80) {
			grade = 'B';
		}
		else if(testscore >= 70) {
			grade = 'c';
		}
		else if(testscore >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("Grade = " + grade);
		
	}

}
