package by.jonline.module2.onedim_array_sorting;

import java.util.Scanner;

/*���������� �������. ���� ������������������ ����� a1, a2, .... an. ��������� ����������� �������� ���,
 * ����� ��� ���� ����������� �� ��������. ��� ����� � �������, ������� � �������, ���������� ���������� ������� � 
 * �������� �� ������ �����. � ������ - �� ����� �����������. �����, ������� �� �������, ��� ��������� �����������. 
 * �������� �������� ���������� �������.
 * */

public class Number_3 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n >= 2 && n <= 100) {

			double[] a = new double[n];

			fillArray(a);

			printArray(a);

			for (int i = 0; i < a.length; i++) {

				double max = -Double.MAX_VALUE;
				int positionOfMax = 0;
				double tmp;

				for (int j = i; j < a.length; j++) {

					if (a[j] > max) {
						max = a[j];
						positionOfMax = j;
					}
				}

				tmp = a[i];
				a[i] = a[positionOfMax];
				a[positionOfMax] = tmp;

			}

			printArray(a);

		} else {
			System.out.println("������ ������� ������ ���� �������� �� 2 �� 100!");
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

		System.out.println("������� ����� ����� �� 2 �� 100: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� ����� �� 2 �� 100!: ");

		}
		return sc.nextInt();
	}

}