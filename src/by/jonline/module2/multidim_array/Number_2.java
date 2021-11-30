package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*���� ���������� �������. ������� �� ����� ��������, ������� �� ���������*/

public class Number_2 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 1 && n <= 100) { // ����. ������ ����� ��� �������� �������������

			double[][] a = new double[n][n];

			fillArray(a);
			printArray(a);

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {

					if (i == j) {
						System.out.printf("%9.3f", a[i][j]);
					} else {
						System.out.printf("%9s", "");
					}
				}
				System.out.println();
			}

		} else if (n > 100) {
			System.out.println("��������� ������� ������� ������� ������!");

		} else {
			System.out.println("������ ������� ��� ������ ������ ������ ���� ������ 1 � 1 !");

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
		System.out.println("�������� �������:");

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

		System.out.println("������� ������������� �����, ������� 1: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ������������� �����, ������� 1!: ");

		}
		return sc.nextInt();
	}
}