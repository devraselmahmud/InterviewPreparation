package solid_principles;

public interface Bike {

	public void turnOnEngine();

	public void accelerate();

}

class Motorcycle implements Bike {

	@Override
	public void turnOnEngine() {

		boolean turnOn = true;
		// rest of the codes

	}

	@Override
	public void accelerate() {

		int speed = 30;
		speed = speed + 10;
		// rest of the codes
	}

}

/*
 * Bicycle class will break the Liskov Substitution Principle By Narrowing down
 * parent class capabilities
 */
class Bicycle implements Bike {

	@Override
	public void turnOnEngine() {
		throw new AssertionError("There is no engine");

	}

	@Override
	public void accelerate() {

		int speed = 10;
		speed = speed + 2;
		// rest of the codes

	}

}
