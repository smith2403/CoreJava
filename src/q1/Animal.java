package q1;

class Animals {
	public void makeSound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animals {
	@Override
	public void makeSound() {
		System.out.println("Dog Barks!");
	}
}

public class Animal {
	public static void main(String[] args) {
		Animals a = new Dog();
		a.makeSound();

	}
}
