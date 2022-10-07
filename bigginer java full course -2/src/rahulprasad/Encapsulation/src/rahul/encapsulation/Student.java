package rahul.encapsulation;

public class Student {
	
	private String name;
	private int age;
	private String address;
	
	public Student(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return ("Student name is " + this.getName() + ", age is: " + this.getAge() +" and address is: "+ this.getAddress());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student rahul=new Student("Rahul", 22, "Bhayandar East, Mumbai");
		
		System.out.println(rahul.getName());
		System.out.println(rahul.getAge());
		System.out.println(rahul.getAddress());
	}

}