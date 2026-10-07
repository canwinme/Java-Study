package unit9;

public class Home {
	private RemoteControl rc = new RemoteControl() {
		public void turnON() {
			System.out.println("TVON");
		}
		public void turnOFF() {
			System.out.println("TVOFF");
		}	

	};
	public void use1() {
		rc.turnON();
		rc.turnOFF();
	}
	
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			public void turnON() {
				System.out.println("Aircon ON");
			}
			public void turnOFF() {
				System.out.println("Aircon OFF");
			}
		};
		rc.turnON();
		rc.turnOFF();
	}
	public void use3(RemoteControl rc)
	{
		rc.turnON();
		rc.turnOFF();
	}
}
