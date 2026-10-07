package unit8;

public class StaticExample {

	public static void main(String[] args) {
		
		StaticMethod sm;
		
		sm = new Tele();
		sm.turnON();
		sm.setVolume(5);
		
		sm.setMute(true);
		sm.setMute(false);
		
		System.out.println();
		
		StaticMethod.changeBattery();
	}

}
