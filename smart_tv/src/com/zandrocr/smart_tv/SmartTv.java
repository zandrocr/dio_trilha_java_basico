package com.zandrocr.smart_tv;

public class SmartTv {
	boolean state = false;
	int channel = 0;
	int volume = 0;
	
	public void turn(String trun) {
		if(trun == "turn on") {
			state = true;
		}
		if(trun == "trun off") {
			state = false;
		}		
	}
	
	public void changeVolume(int newVolume) {
		volume = newVolume;
	}
	
	public void changeChannel(int newChannel) {
		channel = newChannel;
	}

}
