


interface Flyable {
	void fly();
	}

class Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("with wings");
	}
}

class Aeroplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("with fuel");
	}

}

public class FlyableRunner {
	public static void main(String[] args) {
		Bird bird = new Bird();
		Aeroplane aeroplane = new Aeroplane();
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable object : flyingObjects) {
			object.fly();
		}
	}
}
