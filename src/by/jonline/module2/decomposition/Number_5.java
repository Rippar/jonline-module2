package by.jonline.module2.decomposition;

import java.util.Scanner;

/*��������� ���������, ������� � ������� A[N] ������� ������ �������� ����� (������� �� ������ �����,
������� ������ ������������� �������� �������, �� ������ ���� ������ ���������).*/

public class Number_5 {
	public static void main(String[] args) { 

		int n = enterFromConsole();

		if (n > 1 && n <= 100) { // ����. ������ ����� ��� �������� �������������

			double[] a = new double[n];

			fillArray(a);
			printArray(a);

			boolean flag = allTheSame(a);

			if (!flag) {
				System.out.printf("������ �� �������� ������� �������: %4.3f", findSecondMaxValue(a));

			} else {
				System.out.println("� ������� ��� �������� ���������!");
			}

		} else {
			System.out.println("������ ������� ��� ������ ������ ������ ���� ������ 1, �� �� ����� 100!");
		}
	}

	public static boolean allTheSame(double[] a) { // �������� �� ��, ��� �� ��� �������� � ������� ���������

		boolean flag = true;

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] != a[i + 1]) {

				flag = false;

				break;
			}
		}
		return flag;
	}

	public static double findSecondMaxValue(double[] a) {

		int len = a.length;

		for (int i = 0; i < len; i++) { // ��������������� ������ �� �����������

			double value = a[i];
			int j = i - 1;

			for (; j >= 0; j--) {

				if (a[j] > value) {
					a[j + 1] = a[j];

				} else {
					break;
				}

			}

			a[j + 1] = value;

		}

		double max = a[len - 1];
		double secondMax = a[len - 2];

		if (max == secondMax) { // ����� ������� �� �������� �������� �� ������, ���� � ������� ������� ��� �
								// ����� �������� � ������������ ���������

			for (int j = len - 1; j > 0; j--) {

				if (a[j] == a[j - 1]) {
					continue;
				}

				return a[j - 1];
			}
		}

		return secondMax;

	}

	public static void fillArray(double[] a) {
		for (int i = 0; i < a.length; i++) {

			a[i] = -100 + Math.random() * 200;

		}
	}

	public static void printArray(double[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.printf("%9.3f", a[i]);
		}

		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("������� ����� �����, ������� 1: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� �����, ������� 1!");
		}

		return sc.nextInt();

	}

}
