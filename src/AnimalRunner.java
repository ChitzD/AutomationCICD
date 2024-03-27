
abstract class Animal {
	abstract void bark();
}

	class Dog extends Animal {
		@Override
		public void bark() {
			System.out.println("bhow bhow");
		}
	}

	class Cat extends Animal {
		@Override
		public void bark() {
			System.out.println("Meow Meow");
		}
	}

	public class AnimalRunner {
		public static void main(String[] args) {
			Dog dog = new Dog();
			Cat cat = new Cat();
			Animal[] animal = { new Dog(), new Cat() };
			for (Animal anim : animal) {
				anim.bark();
			}
		}
	}

