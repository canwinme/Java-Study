package unit7;

public class Smartphone extends Phone{
	public boolean wifi;
	public Smartphone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
	public void internet() {
		System.out.println("인터넷 연결");
	}
	
}
