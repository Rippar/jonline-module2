package by.jonline.module2.decomposition;

import java.util.Scanner;

/*���� ����������� ����� K � N. �������� ����� (������) ������������ ������� A, ���������� �������� �������� �����,
����� ���� ������� ����� K � ������� �� ������ N.*/

public class Number_12 {
	public static void main(String[] args) {

		int k = enterFromConsole();
		int n = enterFromConsole();

		if (k > 0 && n > 0 && n <= 10000) {

			int[] a = createArray(k, n);

			printArray(a);

		} else if (n > 10000) {
			System.out.println("��� �������� �������������, N �� ������ ��������� �������� 10000");

		} else {
			System.out.println("��������� ����� ������ ���� ������������!");
		}

	}

	public static int[] createArray(int k, int n) {

		int count = 0;
		int[] sourse = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			sourse[i] = i;
		}

		for (int i = 0; i <= n; i++) { // ����� ���-�� �����, ����� ���� ������� = k

			if (sumOfDigits(sourse[i]) == k) {
				count++;
			}
		}

		int[] result = new int[count];

		for (int i = 0, j = 0; i <= n; i++) {

			if (sumOfDigits(sourse[i]) == k) {

				result[j] = sourse[i];
				j++;
			}
		}

		return result;
	}

	public static int sumOfDigits(int a) {

		int sum = 0;

		while (a / 10 != 0) {

			sum += a % 10;
			a /= 10;
		}

		sum += a % 10;

		return sum;
	}

	public static void printArray(int[] a) {

		if (a.length == 0) {
			System.out.println("��� ����� ��� �����������");
		}

		for (int i = 0; i < a.length; i++) {

			System.out.printf("%6d", a[i]);
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
