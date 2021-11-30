package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*������������� ������ ������� �� ����������� � �������� �������� ���������*/

public class Number_12 {
	public static void main(String[] args) {

		int n = enterFromConsole(); // ����� �������
		int w = enterFromConsole(); // ������ �������

		if (n > 1 && w > 1 && n <= 100 && w <= 100) { // ����. ������ ����� ��� �������� �������������

			double[][] a = new double[n][w];

			fillArray(a);

			System.out.println("�������� ������:");
			printArray(a);

			sortByLineAscending(a);
			System.out.println("��������������� ������ � ������� ����������� �� �������:");
			printArray(a);

			sortByLineDecreasing(a);
			System.out.println("��������������� ������ � ������� �������� �� �������:");
			printArray(a);

		} else if (n > 100 || w > 100) {
			System.out.println("��������� ������� ������� ������� ������!");

		} else {
			System.out.println("������ ������� ��� ������ ������ ������ ���� ������ 1 � 1!");
		}
	}

	public static void sortByLineAscending(double[][] a) { // ���������� � ������� ����������� �� �������
		boolean isSorted = false;

		for (int i = 0; i < a.length; i++) {
			isSorted = false;

			while (!isSorted) {
				isSorted = true;

				for (int j = 0; j < a[i].length - 1; j++) {

					if (a[i][j] > a[i][j + 1]) {

						double tmp;
						isSorted = false;

						tmp = a[i][j + 1];
						a[i][j + 1] = a[i][j];
						a[i][j] = tmp;
					}
				}
			}
		}
	}

	public static void sortByLineDecreasing(double[][] a) { // ���������� � ������� �������� �� �������
		boolean isSorted;

		for (int i = 0; i < a.length; i++) {
			isSorted = false;

			while (!isSorted) {
				isSorted = true;

				for (int j = 0; j < a[i].length - 1; j++) {

					if (a[i][j] < a[i][j + 1]) {

						double tmp;
						isSorted = false;

						tmp = a[i][j + 1];
						a[i][j + 1] = a[i][j];
						a[i][j] = tmp;
					}
				}
			}
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

		System.out.println("������� ����� ������������� �����: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� ������������� �����!: ");

		}
		return sc.nextInt();
	}
}
