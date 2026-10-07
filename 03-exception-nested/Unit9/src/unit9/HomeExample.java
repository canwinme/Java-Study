package unit9;

public class HomeExample {

	public static void main(String[] args) {
		Home home = new Home();
		
		home.use1();
		home.use2();
		
		home.use3(new RemoteControl() {
			public void turnON() {
				System.out.println("난방ON");
			}
			public void turnOFF() {
				System.out.println("난방OFF");
			}
		});

	}

}
