package by.jonline.module2.decomposition;

import java.util.Scanner;

/*����� ������ D. ���������� ��������� �����: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
���������. ��������� ����� (������) ��� ���������� ����� ���� ��������������� ������������� ��������� ������� 
� �������� �� k �� m.*/

public class Number_8 {
	public static void main(String[] args) { 

		int n = enterFromConsole();
		int k = enterFromConsole();

		if (n > 2 && n <= 100 && k >= 0 && k <= n - 3) { 

			double[] d = new double[n];

			fillArray(d);
			printArray(d);

			double sum = sumOfThreeElements(d, k);

			System.out.printf("C���� ���� ��������������� ������������� ��������� �������, ������� � " + k
					+ "�� ��������: %4.3f",sum);

		} else {
			System.out.println("������ ������� ��� ������ ������ ������ ���� ������ 2, �� �� ����� 100, "
					+ "� k ������ ��������� ������ ������������������ ���� ��������� �������!");
		}

	}

	public static double sumOfThreeElements(double[] d, int k) {

		double sum = 0;

		for (int i = k; i < k + 3; i++) {
			sum += d[i];
		}

		return sum;
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

		System.out.println("������� ����� �����, ������� 2: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� �����, ������� 2!");
		}

		return sc.nextInt();

	}

}