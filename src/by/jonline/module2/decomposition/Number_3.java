package by.jonline.module2.decomposition;

import java.util.Locale;
import java.util.Scanner;

/*��������� ������� ����������� �������������� �� �������� �, ��������� ����� ���������� ������� ������������*/

public class Number_3 {
	public static void main(String[] args) {

		double a = enterFromConsole();

		if (a > 0) {

			double s;
			s = 6 * triangleSquare(a);
			System.out.printf("������� ����������� �������������� �� �������� %.3f = %4.3f", a, s);

		} else {
			System.out.println("������� �������������� ������ ���� ������ 0!");
		}

	}

	public static double triangleSquare(double a) {
		double s;
		s = Math.sqrt(3) * a * a / 4;
		return s;
	}

	public static double enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH); // ������������, ����� ������� � ������� ������������ ����� ����� ����� (��
										// ��������� ���� ����� �������)

		System.out.println("������� ������������� �����: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("����� ������ ������������� �����!: ");

		}
		return sc.nextDouble();
	}

}
