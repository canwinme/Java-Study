package unit8;

public class Telvi implements Control {
	
	private int volume;
	
	public void turnON() {
		System.out.println("TV ON");
	}
	
	public void turnOFF() {
		System.out.println("TV OFF");
	}	
	
	public void setVolume(int volume) 
		{
			if(volume>Control.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			}
			else if(volume<RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			}
			else {
				this.volume = volume;
			}
			System.out.println("현재볼륨: " + this.volume);
		}
	}


