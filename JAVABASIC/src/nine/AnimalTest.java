package nine;

import java.lang.reflect.Field;

import test.Animal;

public class AnimalTest {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.run();
		d.swim();
		d.jump();
	}
}

class Dog implements Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Dog run");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Dog swim");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Dog jump");
	}
	
}