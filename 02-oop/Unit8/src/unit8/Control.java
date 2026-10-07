package unit8;

public interface Control {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	void turnON();
	void turnOFF();
	void setVolume(int volume);
}
