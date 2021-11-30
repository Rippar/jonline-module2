package by.jonline.module2.onedim_array_sorting;

import java.util.Scanner;

/*���������� �����. ��� ������ n �������������� �����. ��������� ����������� ��� �� �����������. �������� ��� ��������� �������: 
������������ ��� �������� �������� ai � ai+1. ���� ai < ai+1, �� ������������ �� ���� ������� ������. ���� ai > ai+1, �� 
������������ ������������ � ���������� �� ���� ������� �����. ��������� �������� ���� ����������.*/

public class Number_6 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n >= 2 && n <= 100) { //����. ������ ����� ��� �������� �������������

			double[] a = new double[n];

			fillArray(a);

			printArray(a);

			for (int i = 1; i < a.length;) {

				if (a[i - 1] <= a[i]) {
					i++;

				} else {

					double tmp = a[i];

					a[i] = a[i - 1];
					a[i - 1] = tmp;

					if (i == 1) {
						continue;
					}

					i--;
				}
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
