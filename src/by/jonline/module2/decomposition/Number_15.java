package by.jonline.module2.decomposition;

import java.util.Scanner;

/*����� ��� ����������� n-������� �����, ����� � ������� �������� ������ ������������ ������������������ (��������, 1234, 5789).
��� ������� ������ ������������ ������������.*/

public class Number_15 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 1 && n < 10) {

			int start = (int) (Math.pow(10, n - 1));
			int end = (int) (Math.pow(10, n));

			for (int i = start; i < end; i++) {

				if (isStrictlyIncreasing(i)) {

					System.out.println(i);
				}
			}

		} else {
			System.out.println("����������� ����� ��� ������ ������ ������ ���� ������ 1, �� �� ������ 9!");
		}

	}

	public static boolean isStrictlyIncreasing(int a) {

		boolean flag = false;

		while (a / 10 != 0) {

			flag = true;

			int tmp = a % 10;

			a /= 10;

			if (a % 10 >= tmp) {

				flag = false;

				break;
			}
		}

		return flag;

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