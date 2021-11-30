package by.jonline.module2.decomposition;

/*���� ����������� ����� N. �������� ����� (������) ��� ������������ �������, ���������� �������� �������� ����� ����� N.*/

import java.util.Scanner;

public class Number_10 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 0) {

			int[] a = digitsToArray(n);

			printArray(a);

		} else {
			System.out.println("����� ������ ����� ������������� �����!");
		}
	}

	public static int[] digitsToArray(int n) {

		int count = 1;
		int k = n;

		while (k / 10 != 0) {

			k /= 10;
			count++;
		}

		int[] digits = new int[count];

		for (int i = count - 1; i >= 0; i--) {

			digits[i] = n % 10;
			n /= 10;
		}

		return digits;
	}

	public static void printArray(int[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.printf("%2d", a[i]);
		}

		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("������� ����� ������������� �����: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� ������������� �����!");
		}

		return sc.nextInt();

	}

}
