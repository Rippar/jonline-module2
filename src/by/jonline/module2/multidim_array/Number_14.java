package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*������������ ��������� ������� m x n, ��������� �� ����� � ������, ������ � ������ ������� ����� ������ ����� ������ �������*/

public class Number_14 {
	public static void main(String[] args) {

		int m = enterFromConsole(); // ����� �������
		int n = enterFromConsole(); // ������ �������

		if ((m > 1 && n > 1 && m <= 100 && n <= 100) && (n - m <= 1)) { // ����. ������ ����� ��� �������� �������������

			int[][] a = new int[m][n];

			for (int j = 0; j < a[0].length; j++) {
				for (int i = 0; i < j; i++) {
					a[i][j]++;
				}
			}

			printArray(a);

		} else if (m > 100 || n > 100) {
			System.out.println("��������� ������� ������� ������� ������!");

		} else if (n - m > 1) {
			System.out.println("�� ������� ������, ������ ������� �� ����� ��������� � ����� ����� ��� �� �������!");

		} else {
			System.out.println("������ ������� ��� ������ ������ ������ ���� ������ 1 � 1!");
		}
	}

	public static void printArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.printf("%4d", a[i][j]);
			}

			System.out.println();
		}
		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"������� ����� � ������ ������� (������ ������� �� ������ ��������� � ����� ����� ��� �� �������): ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� ������������� �����!: ");

		}
		return sc.nextInt();
	}

}
