package samsung;

import java.util.Scanner;

public class RobotCleaner {

	public static void main(String[] args) {
		// Variable Definition
		int n = 0;
		int m = 0;
		int r = 0;
		int c = 0;
		int d = 0;
		int count = 0;
		boolean run = true;
		Scanner scan = new Scanner(System.in);

		// Inputting Value
		for (int i = 0; i < 1;) {
			System.out.print("Input 'N' value : ");
			n = scan.nextInt();
			System.out.print("Input 'M' value : ");
			m = scan.nextInt();
			System.out.print("Input 'R' value : ");
			r = scan.nextInt();
			System.out.print("Input 'C' value : ");
			c = scan.nextInt();
			System.out.print("Input 'D' value : ");
			d = scan.nextInt();
			break;

		}
		// Array Definition
		int[][] area = new int[n][m];
		// Inputting value to array
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				area[i][j] = scan.nextInt();
			}
		}
		// Check the Array
		// for (int i = 0; i < n; i++) {
		// for (int j = 0; j < m; j++) {
		// System.out.print(area[i][j]);
		// }
		// System.out.println();
		// }

		// for���� area��ŭ ����. ���� �� ó�� ��ġ�� loca��ġ.
		// �Է¹��� d�� ������ area�� �ε����� ����
		// 0�̸� i�� ���� - / 1�̸� j�� ���� + / 2�� i�� ���� + / 3�̸� j�� ���� -

		// Ž�����⵵ for���� �����鼭 �ٲ���� ������ ó���� ������ ����
		// �۵� �� ó�� ������ j�� -1 �ε����� ���� 0���� 1���� �Ǻ��ϴ� ��
		// if(1) - 0�̸� �̵�(�ε����� ���� ��Ŵ) + count����
		// else if(2)-1�̸� Ž�� ������ �ٲ�(����) + �ٽ� ���� for������
		// if(3)-��� ���⿡�� �̿��� �ε��� ���� 1�̸� �ٶ󺸴� ������ ������ä(�� ����) �ε��� -1�� �ϰ� �ٽ� ����
		// for������
		// if(4)-�� ���� ��� 1�ϰ�� + �������� ���� �ε����� 1�ΰ�� break;

		int spot = 0;
		// Number of cases
		switch (d) {
		case 0:
			for (int i = r; i < area.length; i++) {
				for (int j = c; j < area[0].length; j--) {
					spot = area[r][c];
					if (area[r][c - j] == 0) {
						spot = area[r][c - j];
						count++;
					} else if (area[r][c - j] != 0) {
						d++;
						continue;
					}
				}
			}
		case 1:
		case 2:
		case 3:

		}

	}

}
