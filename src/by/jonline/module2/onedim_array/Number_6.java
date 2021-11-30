package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*������ ������������������ N ������������(?) �����. ��������� ����� �����, ���������� ������ ������� �������� �������� �������*/
/*��������, ������ � �������, ��� ��� ������������ ����� �� ����� ���� ��������*/

public class Number_6 {
	public static void main(String[] args) {

		int n = enterFromConsole();
		
		if (n > 0 && n < 2.0 * 10e6) {
			
			int[] a = new int[n];
			int sumOfSimple = 0;

			fillArray(a);

			printArray(a);

			for (int i = 2; i < a.length; i++) { // 0 � 1 �� �������� �������� �������
				if (isSimple(i)) {
					sumOfSimple += a[i];
				}
			}

		} else if (n > 100) {

			System.out.println("��������� ������ ������� ������� �����!");

		} else {

			System.out.println("������ ������� ��� ������ ������ ������ ���� ������ 1!");
		}
	}

	public static boolean isSimple(int a) {
		for (int i = 2; i < a; i++) {

			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void fillArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = 1 + (int) (Math.random() * 200);
		}
	}

	public static void printArray(int[] a) {

		System.out.println("�������� ������:");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "; ");
		}
		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("������� ����� ������������� �����, ������� 1: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� ������������� �����, ������� 1!: ");

		}
		return sc.nextInt();
	}

}