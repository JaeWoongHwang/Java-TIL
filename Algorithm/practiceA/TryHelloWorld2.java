package practiceA;

import java.util.Arrays;

public class TryHelloWorld2 {

	public int getMinSum(int[] A, int[] B) {
		int answer = 0;
		// �迭�� ����
		Arrays.sort(A);
		Arrays.sort(B);
		// �� �迭���� ���� �� ū���� ���ϱ�
		// ù �迭�� i ���� ���� �ι�° �迭�� length -i -1�� ����

		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[B.length - i - 1];

		}

		return answer;

	}

	public static void main(String[] args) {
		TryHelloWorld2 test = new TryHelloWorld2();
		int[] A = { 1, 2 };
		int[] B = { 3, 4 };
		System.out.println(test.getMinSum(A, B));
	}

}
