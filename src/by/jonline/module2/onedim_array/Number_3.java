package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*��� ������ �������������� �����, ����������� �������� N. ����������, ������� � ��� �������������, ������������� � ������� ���������.*/

public class Number_3 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 0 && n < 100) { // ����. ������ ����� ��� �������� �������������

			int sumPositive = 0;
			int sumNegative = 0;
			int sumZero = 0;

			double[] a = new double[n];

			fillArray(a);

			printArray(a);

			for (int i = 0; i < a.length; i++) {
				
				if (a[i] > 0) {
					sumPositive++;

				} else if (a[i] < 0) {
					sumNegative++;

				} else {
					sumZero++;
				}
			}

			System.out.println("\n ����� ������������� ���������: " + sumPositive + "\n ����� ������������� ���������: "
					+ sumNegative + "\n ����� ���������, ������ 0: " + sumZero);

		} else if (n > 100) {

			System.out.println("��������� ������ ������� ������� �����!");

		} else {

			System.out.println("������ ������� ��� ������ ������ ������ ���� ������ 0!");

		}
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

		System.out.println("������� ����� ������������� �����: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� ������������� �����!: ");

		}
		return sc.nextInt();
	}
}