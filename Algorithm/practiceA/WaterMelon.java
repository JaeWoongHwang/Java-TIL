package practiceA;

import java.util.Scanner;

public class WaterMelon {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String waterMelon1 = "��";
		String waterMelon2 = "��";
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(waterMelon1);
			} else if (i % 2 == 0) {
				System.out.print(waterMelon2);
			}

		}

	}

}
