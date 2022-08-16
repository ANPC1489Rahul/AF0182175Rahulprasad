
public class String_lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prog();
	}
	
	public static void prog() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter one line of sentence: ");
		String line=sc.nextLine();
		int count=0;
		String words[]=line.split(" ");
		for(String s:words) {
			System.out.println(s);
		}
		for(int i=0;i<words.length;i++) {
			
			for(int j=i;j<words.length;j++) {
				if(words[i].equals(words[j]))
					count++;
			}
		}
		System.out.println("number of repeated words "+count);
	}

}
