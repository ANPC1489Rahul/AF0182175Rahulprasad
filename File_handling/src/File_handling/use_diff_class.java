package File_handling;

public class use_diff_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		use_diff_class obj=new use_diff_class();
		use_diff_class obj1=new use_diff_class();
		use_diff_class obj2=new use_diff_class();
		System.out.println("The ab1="+obj.hashCode());
		System.out.println("The ab1="+obj1.hashCode());
		System.out.println("The ab1="+obj2.hashCode());
		sin_demo ab1=sin_demo.met_ins();
		sin_demo ab2=sin_demo.met_ins();
		sin_demo ab3=sin_demo.met_ins();
		System.out.println("The ab1="+ab1.hashCode());
		System.out.println("The ab1="+ab2.hashCode());
		System.out.println("The ab1="+ab3.hashCode());

	}

}
