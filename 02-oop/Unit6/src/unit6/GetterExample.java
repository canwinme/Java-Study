package unit6;

public class GetterExample {

	public static void main(String[] args) {
		Gettersetter myCar = new Gettersetter();
		myCar.setSpeed(-50);
		System.out.println("현재 속도" + myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("현재 속도"+ myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도:"+myCar.getSpeed());
	}

}
