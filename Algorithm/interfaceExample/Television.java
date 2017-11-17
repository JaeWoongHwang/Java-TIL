package interfaceExample;

public class Television implements RemoteControl {
	// Field
	private int volume;

	// turnOn() �߻�޼ҵ��� ��ü�޼ҵ�
	public void turnOn() {
		System.out.println("Turn on the TV");
	}

	// turnOff() �߻�޼ҵ��� ��ü�޼ҵ�
	public void turnOff() {
		System.out.println("Turn off the TV");
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
		System.out.println("Current TV volume " + volume);
	}

}
