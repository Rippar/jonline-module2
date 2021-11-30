package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*���� �������������� ����� a1, a2,..., an. �������� ������� ���������� � ���������� ��������*/

public class Number_4 {
	public static void main(String[] args) {
		
		int n = enterFromConsole();
			
		if (n > 1 && n < 100) { // ����. ������ ����� ��� �������� �������������
			
			double max = -Double.MAX_VALUE;
			double min = Double.MAX_VALUE;

			int maxPosition = 0;
			int minPosition = 0;

			double[] a = new double[n];

			fillArray(a);

			printArray(a);

			for (int i = 0; i < a.length; i++) {
				
				if (a[i] > max) {
					max = a[i];
					maxPosition = i;
				}
				
				if (a[i] < min) {
					min = a[i];
					minPosition = i;
				}
			}

			double tmp = a[maxPosition];
			
			a[maxPosition] = a[minPosition];
			a[minPosition] = tmp;

			printArray(a);
			
		} else if (n > 100) {

			System.out.println("��������� ������ ������� ������� �����!");

		} else {

			System.out.println("������ ������� ��� ������ ������ ������ ���� ������ 1!");
		}
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

		System.out.println("������� ����� ������������� �����, ������� ������ 1: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� ������������� �����, ������� ������ 1!: ");

		}
		return sc.nextInt();
	}
}