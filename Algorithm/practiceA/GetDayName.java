package practiceA;

public class GetDayName {
	public String getDayName(int a, int b) {

		// 28�� - 2��
		// 30�� - 4, 6, 9, 11��
		// 31�� - 1, 3, 5, 7, 8, 10, 12��
		int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int sum = 0;
		int date = 0;
		String answer = "";
		for (int i = 0; i < a - 1; i++) {
			sum += month[i];

		}
		date = (sum + b) % 7;

		switch (date) {
		case 0:
			answer = "THU";
			break;
		case 1:
			answer = "FRI";
			break;
		case 2:
			answer = "SAT";
			break;
		case 3:
			answer = "SUN";
			break;
		case 4:
			answer = "MON";
			break;
		case 5:
			answer = "TUE";
			break;
		case 6:
			answer = "WED";
			break;
		}

		return answer;
	}

	public static void main(String[] args) {
		GetDayName test = new GetDayName();
		int a = 5, b = 24;
		System.out.println(test.getDayName(a, b));
	}

}
