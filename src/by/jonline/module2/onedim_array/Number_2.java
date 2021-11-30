package by.jonline.module2.onedim_array;

import java.util.Locale;
import java.util.Scanner;

/*���� ������������������ �������������� ����� a1, a2,..., an. �������� ��� �� �����, ������� ������� Z, ���� ������. ���������� ���������� �����.*/

public class Number_2 {
	public static void main(String[] args) {

		double n = enterFromConsole();

		if (n > 0 && n % 1 == 0) { // ����. ������ ����� ��� �������� �������������

			int count = 0;
			int length = (int) n;
			double z = enterFromConsole();
			
			double[] a = new double[length];

			fillArray(a);

			printArray(a);

			for (int i = 0; i < a.length; i++) {
				if (a[i] > z) {
					a[i] = z;
					count++;
				}
			}

			printArray(a);

			System.out.println("���������� ����� ��������� �� z: " + count);

		} else if (n > 100) {

			System.out.println("��������� ������ ������� ������� �����!");

		} else if (n % 1 != 0) {

			System.out.println("������ ������� ������ ���� ����������� ����� ������!");

		} else {

			System.out.println("������ ������� ��� ������ ������ ������ ���� ������ 0!");

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

	public static double enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH); // ������������, ����� ������� � ������� ������������ ����� ����� ����� (�� ��������� ���� ����� �������)

		System.out.println("������� ������ �������, ����� ����� Z");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("����� ������ �����!: ");

		}
		return sc.nextDouble();
	}
}
