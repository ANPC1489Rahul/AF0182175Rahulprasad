abstract class animal
{
	void legs()
	{
		System.out.println("all animals have 4 legs");
	}
	abstract void sound();
	abstract void eat();
}
class Dog extends animal
{
	@override
	void sound()
	{
		System.out.println("Bow Bow.....");
	}
	void eat()
	{
		System.out.println("meat eating");
	}
}
class Cow extends animal
{
	@override
	void sound()
	{
		System.out.println("Ooooo Ooooo.....");
	}
	void eat()
	{
		System.out.println("Grass eating");
	}
	
}
class absclass {

	public static void main(String[] args) {
		Dog d=new Dog();
		Cow c=new Cow();
		
		d.sound(); d.eat(); d.legs();
		d.sound(); d.eat(); d.legs();


	}

}

output:Bow Bow.....
  meat eating
  all animals have 4 legs
  Ooooo Ooooo.....
  Grass eating
  all animals have 4 legs
  
  
