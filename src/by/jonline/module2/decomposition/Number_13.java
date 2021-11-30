package by.jonline.module2.decomposition;

import java.util.Scanner;

/*��� ������� ����� ���������� "����������", ���� ��� ���������� ���� �� ����� �� 2 (��������, 41 � 43). ����� � ���������� ��� ���� 
 "���������" �� ������� [n, 2n], ��� n - �������� ����������� �����, ������� 2. ��� ������� ������ ������������ ������������.*/

public class Number_13 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 2 && n <= 10000) { // ����. ������ ����� ��� �������� �������������

			twinsDigits(n);

		} else {
			System.out.println("��������� ����� ������ ���� ������ 2, �� �� ������ 10000!");
		}

	}

	public static void twinsDigits(int n) {

		for (int i = n; i <= 2 * n - 2; i++) {

			if (i % 2 == 0) { // ��������� ��� ������ ����� �� ��������
				continue;
			}

			if (isSimple(i) && isSimple(i + 2)) {
				System.out.println(i + ", " + (i + 2));
			}
		}
	}

	public static boolean isSimple(int n) {

		boolean flag = true;

		for (int factor = 2; factor <= n / factor; factor++) {

			if (n % factor == 0) {

				flag = false;
				break;
			}
		}

		return flag;

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
