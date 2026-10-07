package unit6;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		myCar.run();
		yourCar.run();
		myCar.setGas(5);
		
		if(myCar.isLeftGas())
		{
			System.out.println("출발합니다");
	
			myCar.run();
		}

		System.out.println("가스 주입 바람");
	}

}
