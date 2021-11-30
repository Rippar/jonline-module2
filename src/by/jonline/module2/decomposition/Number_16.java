package by.jonline.module2.decomposition;

import java.util.Scanner;

/*�������� ���������, ������������ ����� n - ������� �����, ���������� ������ �������� �����. ���������� �����, 
������� ������ ���� � ��������� �����. ��� ������� ������ ������������ �����������.*/

public class Number_16 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 0 && n < 10) {

			int start = (int) (Math.pow(10, n - 1));
			int end = (int) (Math.pow(10, n));

			long sum = 0;
			int count;

			for (int i = start; i < end; i++) {

				if (isOnlyOddDigits(i)) {

					sum += i;
				}
			}

			System.out.println("����� " + n + "-������� �����, ���������� ������ �������� �����: " + sum);

			count = evenCount(sum);

			System.out.println("���������� ������ ���� � ������ �����: " + count);

		} else {
			System.out.println("����������� ����� ��� ������ ������ ������ ���� ������ 0, �� �� ������ 9!");
		}

	}

	public static boolean isOnlyOddDigits(int a) {

		boolean flag = true;

		while (a / 10 != 0) {

			int tmp = a % 10;

			if (tmp % 2 == 0) {

				flag = false;

				break;
			}

			a /= 10;
		}

		if (a / 10 == 0) {
			if (a % 2 == 0)

				flag = false;

		}

		return flag;

	}

	public static int evenCount(long a) {

		int count = 0;

		while (a / 10 != 0) {

			int tmp = (int) (a % 10);

			if (tmp % 2 == 0) {

				count++;
			}

			a /= 10;
		}

		if (a / 10 == 0) {

			if (a % 2 == 0) {

				count++;
			}

		}

		return count;
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("������� �������� ����������� ����� ��� �����������: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� ������������� �����!");
		}

		return sc.nextInt();

	}

}