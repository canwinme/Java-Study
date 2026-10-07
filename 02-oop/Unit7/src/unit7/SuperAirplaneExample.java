package unit7;

public class SuperAirplaneExample {

	public static void main(String[] args) {
		SuperAirplane sa = new SuperAirplane();
		
		sa.takeoff();
		sa.fly();
		sa.flymode= SuperAirplane.SUPERSONIC;
		sa.fly();
		sa.flymode = SuperAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
