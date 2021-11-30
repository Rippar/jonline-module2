package by.jonline.module2.decomposition;

import java.util.Locale;
import java.util.Scanner;

/*���� ����� X, Y, Z, T - ����� ������ ����������������. �������� ����� (������) ���������� ��� �������, 
���� ���� ����� ��������� ������ X � Y - ������.*/

public class Number_9 {
	public static void main(String[] args) {

		double x = enterFromConsole();
		double y = enterFromConsole();
		double z = enterFromConsole();
		double t = enterFromConsole();

		if (x > 0 && y > 0 && z > 0 && t > 0) {

			double s = quadrangleSquare(x, y, z, t);

			if (s != s || (Math.abs(x - y) > z + t)) { // �������� �� NaN, � ����� �� ���������� �����������
														// ����������������

				System.out.println("������ �� ������� ������ ������, ���������������� � ������ ��������� �� ����������. "
								+ "���������� ������ ������ �������� ������.");

			} else {
				System.out.printf("������� ������� ����������������: %4.3f", s);
			}

		} else {
			System.out.println("������� ���������������� ������ ���� ������ 0!");
		}

	}

	public static double quadrangleSquare(double x, double y, double z, double t) {

		double d;
		double s1;
		double s2;
		double s;

		d = Math.sqrt(x * x + y * y); // ����� ����� ���������� ������������ xyd

		s1 = triangleSquare(x, y, d);
		s2 = triangleSquare(z, t, d);

		s = s1 + s2;

		return s;

	}

	public static double triangleSquare(double a, double b, double c) { // ����� ���������� ������� ������������ �����
																		// ������������
		double p;
		double s;

		p = (a + b + c) / 2.0;

		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return s;

	}

	public static double enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH); // ������������, ����� ������� � ������� ������������ ����� ����� ����� (��
										// ��������� ���� ����� �������)

		System.out.println("������� ����� ������� ����������������: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("����� ������ ������������ ������������� �����!");
		}

		return sc.nextDouble();

	}

}
