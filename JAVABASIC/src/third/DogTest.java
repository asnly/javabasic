package third;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		dog.setName("spot");
		dog.setSays("Ruff!");
		dog.display();
		Dog dog1=new Dog();
		dog1.setName("Scruffy");
		dog1.setSays("Wurf!");
		dog1.display();
		Dog dog3=new Dog();
		dog3.setName("Butch");
		dog3.setSays("Hello");
		dog3.display();
		System.out.println("spot == butch: " + (dog == dog3));
		System.out.println("spot.equals(butch): " + dog.equals(dog3));
		System.out.println("butch.equals(spot): " + dog3.equals(dog));
		System.out.println("Now assign: spot = butch");
		dog=dog3;
		System.out.println("again");
		System.out.println("spot == butch: " + (dog == dog3));
		System.out.println("spot.equals(butch): " + dog.equals(dog3));
		System.out.println("butch.equals(spot): " + dog3.equals(dog));
		System.out.println("Now assign: spot = butch");
		System.out.println("Spot");
		System.out.println(dog.getName());
		System.out.println(dog.getSays());
		System.out.println("Butch");
		System.out.println(dog3.getName());
		System.out.println(dog3.getSays());
	}

}

class Dog{
	private String name;
	private String says;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSays() {
		return says;
	}
	public void setSays(String says) {
		this.says = says;
	}
	void display(){
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", says=" + says + "]";
	}
}