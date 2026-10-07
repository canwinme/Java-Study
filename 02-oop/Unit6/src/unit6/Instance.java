package unit6;

public class Instance {
	int speed;
	
	void run() {
		System.out.println(speed + "달려");
	}
	
	static void simulate() {
		Instance myCar = new Instance();
		
		myCar.speed = 200;
		myCar.run();
	}
	public static void main(String[] args)
	{
		simulate();
		
		Instance myCar = new Instance();
		myCar.speed = 60;
		myCar.run();
	}
}
