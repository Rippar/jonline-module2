package by.jonline.module2.onedim_array_sorting;

import java.util.Arrays;
import java.util.Scanner;

/*���������� ���������. ���� ������������������ ����� a1, a2, .... an. ��������� ����������� ����� � ������� �����������. 
�������� ��� ��������� �������. �����  a1, a2, .... ai - ������������� ������������������, �.� a1<=a2<=..<=an. 
������� ��������� ����� ai+1 � ����������� � ������������������ ���, ����� ����� ������������������ ���� ���� ������������. 
������� ������������ �� ��� ���, ���� ��� �������� �� i+1 �� n �� ����� ���������. ����������: ����� ��������� ���������� �������� 
� ��������������� ����� ����������� � ������� ��������� ������. �������� ����� �������� � ���� ��������� �������.
*/

public class Number_5 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n >= 2 && n <= 100) {

			double[] a = new double[n];

			fillArray(a);

			printArray(a);

			for (int i = 0; i < a.length; i++) {
				double current = a[i];

				int low = binarySearch(a, i);

				for (int j = i; j > low; j--) {

					a[j] = a[j - 1];

				}
				a[low] = current;

			}

			printArray(a);

		} else {
			System.out.println("������ ������� ������ ���� �������� �� 2 �� 100!");
		}

	}

	public static int binarySearch(double[] a, int i) {

		int lo = 0;
		int hi = i;
		int mid;

		double key = a[i];

		while (lo < hi) {
			mid = lo + (hi - lo) / 2;

			if (key < a[mid]) {
				hi = mid;

			} else {
				lo = mid + 1;
			}
		}

		return lo;
	}

	public static void fillArray(double[] a) {
		for (int i = 0; i < a.length; i++) {

			a[i] = -100 + Math.random() * 200;

		}
	}

	public static void printArray(double[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.printf("%9.3f", a[i]);
		}

		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("������� ����� ����� �� 2 �� 100: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� ����� �� 2 �� 100!: ");

		}
		return sc.nextInt();
	}

}