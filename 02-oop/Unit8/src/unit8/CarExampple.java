package unit8;

public class CarExampple {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();

		myCar.run();
	}

}
