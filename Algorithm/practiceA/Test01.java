package practiceA;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// ���� ����
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] first = new int[n + 1];
		int[] second = new int[n + 1];

		// �Է� ���� �迭�� ����
		for (int i = 1; i <= n; i++) {
			first[i] = scan.nextInt();
			second[i] = first[i];
		}
		// �迭 �� �� �ι� ° ū ���� ���
		Arrays.sort(first);
		System.out.println("�Է°� = " + n);
		System.out.println("�ι�°�� ū �� =" + first[n - 1]);

		for (int i = 1; i <= n; i++) {
			if (second[i] == first[n - 1]) {
				System.out.println("�ι�° ū ���� �ε��� =" + i);
			}
		}
	}

}
