package unit6;

public class Car {
	int gas;
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0)
		{
			System.out.println("가스 없음");
			return false;
		}
		System.out.println("가스 있음");
		return true;
	}
	
	
	void run()
	{
		this.setSpeed(100);
		System.out.println(this.model+"이모델이" + this.speed+"km만큼 달립니다." );
		
		while(true)
		{
			if(gas> 0) {
				System.out.println("작동중 gas잔량"+ gas);
				gas -= 1;
			}
			else {
				System.out.println("멈춤");
				return;
			}
		}
	}

}
