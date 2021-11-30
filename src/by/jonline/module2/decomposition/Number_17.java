package by.jonline.module2.decomposition;

import java.util.Scanner;

/*�� ��������� ����� ����� ����� ��� ����. �� ���������� ����� ����� ����� ��� ���� � �.�. ������� ����� �������� ����
����������, ����� ��������� ����? ��� ������� ������ ������������ ������������.*/

public class Number_17 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n >= 0 && n <= 100000) {

			System.out.println(subtraction(n, 0));

		} else if (n < 0) {
			System.out.println("������ �� ������� ������, ����� ������ ���� ������ 0!");

		} else {
			System.out.println("������ ����� ������� �������! �������� ������ ������������.");
		}

	}

	public static int subtraction(int a, int count) {

		if (a == 0) {
			
			return count;

		} else {

			return subtraction(a - sumOfDigits(a), count + 1);
		}
	}

	public static int sumOfDigits(int a) {

		int sum = 0;

		while (a / 10 != 0) {

			sum += a % 10;
			
			a /= 10;
		}

		sum += a % 10;

		return sum;
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("������� ����� ������������� �����: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� ������������� �����!");
		}

		return sc.nextInt();

	}

}
