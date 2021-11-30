package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*������� ���������� ������� ������� � �������� ��� �������� �������� �� ����*/

public class Number_15 {
	public static void main(String[] args) {

		int n = enterFromConsole(); // ����� �������
		int w = enterFromConsole(); // ������ �������

		if (n > 1 && w > 1 && n <= 100 && w <= 100) { // ����. ������ ����� ��� �������� �������������

			int[][] a = new int[n][w];

			fillArray(a);
			printArray(a);

			int maxValue = findMax(a);

			System.out.println("���������� ������� �������� �������: " + maxValue + "\n");

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {

					if (a[i][j] % 2 != 0) {
						a[i][j] = maxValue;
					}
				}
			}

			printArray(a);

		} else if (n > 100 || w > 100) {
			System.out.println("��������� ������� ������� ������� ������!");

		} else {
			System.out.println("������ ������� ��� ������ ������ ������ ���� ������ 1 � 1!");
		}
	}

	public static int findMax(int[][] a) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		return max;
	}

	public static void fillArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				a[i][j] = -100 + (int) (Math.random() * 200);
			}
		}
	}

	public static void printArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.printf("%4d", a[i][j]);
			}

			System.out.println();
		}
		System.out.println();
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
