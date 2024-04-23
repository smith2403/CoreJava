package q1;

interface Animal1 {
	void makeSound();

	void eat();
}

class Dog1 implements Animal1 {
	@Override
	public void makeSound() {
		System.out.println("Barks");
	}

	@Override
	public void eat() {
		System.out.println("Dogs eat bones");
	}
}

public class Main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 animal = new Dog1();
		animal.eat();
		animal.makeSound();
	}

}
