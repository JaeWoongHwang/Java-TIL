package interfaceExample;

public class ActionExample {

	public static void main(String[] args) {
		// �͸��� ��ü
		// �͸��� ��ü�� �ҽ������� ������ �ʰ� ������ü�� ����� ���
		// �������̽� ���� = new �������̽�() { �������̽��� ����� �߻�޼ҵ��� ��ü�޼ҵ� ����}
		Action action = new Action() {
			public void work() {
				System.out.println("���縦 �մϴ�");
			}
		};
		action.work();
	}

}
