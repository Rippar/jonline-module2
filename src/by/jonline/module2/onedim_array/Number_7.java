package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*���� �������������� ����� a1, a2,..., an. ����� max(a1 + a2, a2 + a3, ..., an + an+1) */

public class Number_7 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 1 && n <= 100) { // ����. ������ ����� ��� �������� �������������
			
			double max = -Double.MAX_VALUE;

			double[] a = new double[n];

			fillArray(a);

			printArray(a);

			for (int i = 0; i < a.length - 1; i++) { 
				if (a[i] + a[i + 1] > max) {
					max = a[i] + a[i + 1];
				}
			}

			System.out.println("������������ ��������: " + max);

		} else if (n > 100) {
			System.out.println("��������� ������ ������� ������� �����!");

		} else {
			System.out.println("������ ������� ��� ������ ������ ������ ���� ������ 1!");

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

		System.out.println("������� ������ ������� (�� 2 �� 100): ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� ������������� ����� (�� 2 �� 100)!: ");

		}
		return sc.nextInt();
	}
}