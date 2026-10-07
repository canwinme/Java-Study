package unit8;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		
		rc = new Audio();
		rc.turnOn();
		
		System.out.println("최대볼륨: " + RemoteControl.MAX_VOLUME);
		System.out.println("최소볼륨: "+ RemoteControl.MIN_VOLUME);
	}

}
