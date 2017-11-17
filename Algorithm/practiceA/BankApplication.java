package practiceA;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ���  | 5. ����");
			System.out.println("-------------------------------------------------------");
			System.out.print("����>");

			int selectNo = scan.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			}
		}
		System.out.println("���α׷� ����");
	}

	private static void createAccount() {
		System.out.println("[���»���]");
		System.out.print("���¹�ȣ : ");
		String ano = scan.next();
		System.out.print("������ : ");
		String owner = scan.next();
		System.out.print("�ʱ��Աݾ� : ");
		int balance = scan.nextInt();

		Account account = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;
			}
		}

	}

	private static void accountList() {
		System.out.println("[���¸��]");

		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (accountArray[i] != null) {
				System.out.print(account.getAno());
				System.out.print("    ");
				System.out.print(account.getOwner());
				System.out.print("    ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}

	private static void deposit() {
		System.out.println("[����]");
		System.out.print("���¹�ȣ : ");
		String ano = scan.next();
		System.out.print("���ݾ� : ");
		int money = scan.nextInt();

		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("���¸� ã�� ���߽��ϴ�.");
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("������ �ԱݵǾ����ϴ�.");
	}

	private static void withdraw() {
		System.out.println("[���]");
		System.out.print("���¹�ȣ : ");
		String ano = scan.next();
		System.out.print("��ݾ� : ");
		int money = scan.nextInt();

		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("���¸� ã�� ���߽��ϴ�.");
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("������ ��ݵǾ����ϴ�.");
	}

	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String dbano = accountArray[i].getAno();
				if (dbano.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}

		return account;
	}

}
