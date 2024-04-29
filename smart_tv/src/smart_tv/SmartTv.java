package smart_tv;

public class SmartTv {
	boolean state = false;
	int chanel = 0;
	int volume = 0;
	
	public void turnOn() {
		this.state = !state;
	}
	public void turnOff() {
		this.state = state;
	}

}
