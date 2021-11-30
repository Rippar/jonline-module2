package by.jonline.module2.onedim_array_sorting;

import java.util.Scanner;

/*������ ��� ���������� ������� � ��������� ����������� ��������� � ����������� ����� k. ���������� �� � ���� ������, 
 ������� ������ ������ ����� k-� � (k+1)-� ���������� �������, ��� ���� �� ��������� �������������� ������*/

public class Number_1 {
	public static void main(String[] args) {

		int n = enterFromConsole(); // ������ ������� �������
		int l = enterFromConsole(); // ������ ������� �������
		int k = enterFromConsole(); // ����� k

		if ((n > 1 && l > 0) && (n <= 100 && l <= 100) && (k < n - 1 && k >= 0)) {

			double[] a = new double[n];
			double[] b = new double[l];
			double[] c = new double[n + l];

			fillArray(a);
			fillArray(b);

			printArray(a);
			printArray(b);

			for (int i = 0; i < c.length; i++) {

				if (i <= k) {
					c[i] = a[i];
					continue;
					
				} else if (i == k + 1) {

					for (int j = 0; j < b.length; j++, i++) {
						c[i] = b[j];
					}
				}

				for (int j = k + 1; j < a.length; j++) {
					c[i] = a[j];
				}

			}

			printArray(c);

		} else if (k >= n - 1 || k < 0) {
			System.out.println("k ������ ���� ����� k-� � (k+1)� ��������� ������� �������");

		} else {
			System.out.println("������� �������� ������ ���� ������ 0, �� �� ������ 100");
		}
	}

	public static void fillArray(double[] a) {
		for (int i = 0; i < a.length; i++) {

			a[i] = -100 + Math.random() * 100;

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

		System.out.println("������� ����� ��������������� �����: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� ��������������� �����!: ");

		}
		return sc.nextInt();
	}

}