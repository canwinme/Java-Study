package unit8;

public class Tele implements StaticMethod {
	private int volume;
	
	public void turnON() {
		System.out.println("TV ON");
	}
	public void turnOFF() {
		System.out.println("TV OFF");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl2.MAX_VOLUME)
		{
			this.volume= RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("오디오 볼륨: "+volume);
	}
	private int memoryvolume;
	
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryvolume = this.volume;
			System.out.println("무음 처리");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("무음 해제");
			setVolume(this.memoryvolume);
		}
	}
}
