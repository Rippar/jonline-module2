package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*���� ����� ����� a1, a2,..., an. ������� �� ������ ������ �� �����, ��� ������� ai>i.*/

public class Number_5 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 1 && n < 100) { // ����. ������ ����� ��� �������� �������������

			int[] a = new int[n];

			fillArray(a);

			printArray(a);

			System.out.print("�����, ��� ������� ai>i: ");
			for (int i = 0; i < a.length; i++) {
				if (a[i] > i) {

					System.out.print(a[i] + "; ");
				}
			}

		} else if (n > 100) {

			System.out.println("��������� ������ ������� ������� �����!");

		} else {

			System.out.println("������ ������� ��� ������ ������ ������ ���� ������ 1!");
		}
	}

	public static void fillArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = -100 + (int) (Math.random() * 200);
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