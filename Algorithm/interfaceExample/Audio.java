package interfaceExample;

public class Audio implements RemoteControl {
	// Field
	private int volume;
	private boolean mute;

	// turnOn() �߻�޼ҵ��� ��ü�޼ҵ�
	public void turnOn() {
		System.out.println("Turn on the Audio");
	}

	// turnOff() �߻�޼ҵ��� ��ü�޼ҵ�
	public void turnOff() {
		System.out.println("Turn off the Audio");
	}

	// setVolume() �߻�޼ҵ��� ��ü�޼ҵ�
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Current Audio volume  " + volume);
	}
	@Override
	public void setMute(boolean mute){
		this.mute = mute;
		if(mute){
			System.out.println("Audio");
		} else {
			System.out.println("");
		}
	}
}
