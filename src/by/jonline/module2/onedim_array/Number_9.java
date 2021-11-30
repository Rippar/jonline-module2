package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*� ������� ����� ����� � ����������� ��������� n ����� �������� ����� ������������� �����. ���� ����� ����� ���������, �� ���������� ���������� �� ���*/

public class Number_9 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 1 && n <= 100) { // ����. ������ ������� ����� ��� �������� �������������

			int[] a = new int[n];
			int min = Integer.MAX_VALUE;

			fillArray(a);

			printArray(a);

			System.out.println("���������� �� �������� ����� ������������� �����: " + findMinOfMostFreqNum(a));

		} else if (n > 100) {
			System.out.println("��������� ������ ������� ������� �����!");

		} else {
			System.out.println("������ ������� ��� ������ ������ ������ ���� ������ 1!");

		}

	}

	public static int findMinOfMostFreqNum(int[] a) {

		int[] freq = new int[a.length];

		for (int i = 0; i < a.length - 1; i++) { // ������� ���������� ������������� �������� ������� ��������

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					freq[i]++;
				}
			}
		}

		int max = Integer.MIN_VALUE;
		int mostFreqValue = 0;

		for (int i = 0; i < freq.length; i++) { // ����� �������� ����� �������������� �������� � ��� ��������
			if (freq[i] > max) {
				max = freq[i];
				mostFreqValue = a[i];
			}
		}

		int count = 0;

		for (int i = 0; i < freq.length; i++) { // ����������� ���������� �������� ����� ������������� ���������
			if (freq[i] == max) {
				count++;
			}
		}

		if (count > 1) { // ���� �������� ����� ������������� ��������� ���������, �� ���� ����� ��� ���,
							// �������� �������� ����������

			int[] positions = new int[count];
			for (int i = 0, j = 0; i < a.length; i++) {
				if (freq[i] == max) {
					positions[j] = a[i];
					j++;
				}
			}

			int min = Integer.MAX_VALUE;
			for (int i = 0; i < positions.length; i++) {
				if (positions[i] < min) {
					min = positions[i];
				}
			}
			return min;

		} else { // ���� �������� ����� ������������� ������� ����, �� ���������� ��� ��������

			return mostFreqValue;
		}
	}

	public static void fillArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = -10 + (int) (Math.random() * 10);
		}
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("������� ������ ������� (�� 2 �� 100): ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� ������������� ����� (�� 2 �� 100)!: ");

		}
		return sc.nextInt();
	}

}