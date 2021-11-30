package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*� ��c����� ������� �������� ������� ��� ����� �������, �.�. ��� �������� ������ ������� ��������� �� ��������������� �� ������� �������, � ��� �������� ����������� � ������. ������ �������� ������ ������������ � ����������*/

public class Number_8 {
	public static void main(String[] args) {

		int n = enterFromConsole(); // ����� �������
		int w = enterFromConsole(); // ������ �������
		int k = enterFromConsole(); // k-� �������
		int p = enterFromConsole(); // p-� �������

		if ((n > 1 && w > 1 && n <= 100 && w <= 100) && (k >= 0 && p >= 0 && k < w && p < w)) {

			double[][] a = new double[n][w];

			fillArray(a);
			printArray(a);

			double tmp = 0;

			for (int i = 0; i < a.length; i++) {

				tmp = a[i][k];
				a[i][k] = a[i][p];
				a[i][p] = tmp;

			}

			printArray(a);

		} else if (n > 100 || k > 100) {
			System.out.println("��������� ������� ������� ������� ������!");

		} else if (k >= w || p >= w) {
			System.out.println("k � p ������ ����������� ����� ������������ ������� ������ �������!");

		} else {
			System.out.println(
					"������ ������� ��� ������ ������ ������ ���� ������ 1 � 1, � k � p ������ ����������� ����� ������������ ������� ������ �������!");

		}

	}

	public static void fillArray(double[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				a[i][j] = -100 + Math.random() * 200;
			}
		}
	}

	public static void printArray(double[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.printf("%9.3f", a[i][j]);
			}

			System.out.println();
		}
		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("������� ��������������� ����� �����: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ��������������� ����� �����!: ");

		}
		return sc.nextInt();
	}
}