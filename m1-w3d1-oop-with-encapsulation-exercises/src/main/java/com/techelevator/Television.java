package com.techelevator;

public class Television {

boolean isOn = false;
int currentChannel = 3;
int currentVolume = 2;

public Television(){ } //Putting it there for good habit 


public boolean isOn() {
	
	return this.isOn;
}

public int getCurrentChannel() {
	
	
	return this.currentChannel;
}


public int getCurrentVolume() {
	
	return this.currentVolume;
	
}


public void turnOff() {
	
	this.isOn = false;
	
}


public void turnOn() {
	
	if(!isOn)
	{
		this.isOn = true;
		this.currentChannel = 3;
		this.currentVolume = 2;
}
	
}

public void changeChannel(int newChannel) {
	
if (isOn && newChannel <= 18 && newChannel >=3) { this.currentChannel = newChannel; }

}


public void channelUp() {
	
if(isOn) {
		
		if(this.currentChannel >= 3 && this.currentChannel < 18) { this.currentChannel++; }
		else { this.currentChannel = 3;  }
	}


}

public void channelDown() {
	
	if(isOn) {
		
		if(this.currentChannel > 3 && this.currentChannel <= 18) { this.currentChannel--; }
		else { this.currentChannel = 18;  }
	}

}

public void raiseVolume() {
	
	if(isOn && currentVolume < 10) {this.currentVolume++;}  //it gives me an error if I do it the other way
	
	
}

public void lowerVolume() {
	
	if(isOn && this.currentVolume > 0) { this.currentVolume--; }

	}



}