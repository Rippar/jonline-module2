package by.jonline.module2.decomposition;

import java.util.Scanner;

/*�������� ����� (������) ��� ���������� ����������� ������ �������� � ����������� ������ �������� ���� ����������� �����*/

public class Number_1 {
	public static void main(String[] args) {

		int a = enterFromConsole();
		int b = enterFromConsole();

		if (a > 0 && b > 0) {

			System.out.println("���������� ����� �������� ��� ������ �����: " + gcd(a, b));
			System.out.println("���������� ����� ������� ��� ������ �����: " + lcm(a, b));

		} else {
			System.out.println("��������� ����� ������ ���� ��������������!");
		}

	}

	public static int gcd(int a, int b) { // ����� ���

		if (b == 0) {
			return a;

		} else {
			return gcd(b, a % b);
		}
	}

	public static int lcm(int a, int b) { // ����� ���
		return a * (b / gcd(a, b));
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("������� ����������� �����: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����������� �����!: ");

		}
		return sc.nextInt();
	}

}
