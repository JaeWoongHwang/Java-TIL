package bookExercise;

public class CarProject {
	// Field
	Tire frontLeftTire = new Tire("�� ����", 6);
	Tire frontRightTire = new Tire("�� ������", 6);
	Tire backLeftTire = new Tire("�� ����", 6);
	Tire backRightTire = new Tire("�� ������", 6);

	// Constructor

	// Method
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�]");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		;
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		;
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		;
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		;
		return 0;
	}

	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
