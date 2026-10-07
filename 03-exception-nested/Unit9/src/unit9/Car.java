package unit9;

public class Car {
	private Tire tire1 = new Tire();
	
	private Tire tire2 = new Tire() {
		public void roll() {
			System.out.println("Tire 객체 1이 굴러감");
		}
	};
	
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		Tire tire = new Tire() {
			public void roll() {
				System.out.println("Tire 객체 2가 굴러감");
			}
		};
		tire.roll();
	}
	public void run3(Tire tire) {
		tire.roll();
	}

}
