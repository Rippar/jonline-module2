package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*������ ������� ��������������� �����. ��������� ����� ��������� � ������ �������. ����������, ����� ������� �������� ������������ �����.*/

public class Number_9 {
	public static void main(String[] args) {
		
		int n = enterFromConsole(); // ����� �������
		int w = enterFromConsole(); // ������ �������

		if (n > 1 && w > 1 && n <= 100 && w <= 100) {

			double[][] a = new double[n][w];

			fillArray(a);
			printArray(a);
			
			double maxSum=-Double.MAX_VALUE;
			int column = 0;
			
			for (int j = 0; j<a[0].length; j++) {
				
				double sum=0;
				
				for (int i = 0; i < a.length; i++) {
					
					sum+=a[i][j];
				}
				
				if (sum>maxSum) {
					
					maxSum=sum;
					column = j;
				}
			}
			
			System.out.printf(column+"� ������� ������� �������� ������������ �����: %4.3f", maxSum);

		} else if (n > 100 || w > 100) {
			System.out.println("��������� ������� ������� ������� ������!");

		} else {
			System.out.println("������ ������� ��� ������ ������ ������ ���� ������ 1 � 1!");
		}

	}

	public static void fillArray(double[][] a) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				a[i][j] = Math.random() * 200;
			}
		}
	}

	public static void printArray(double[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.printf("%9.3f", a[i][j]);
			}

			System.out.println();
		}
		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("������� ������������� ����� �����: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ������������� ����� �����!: ");

		}
		return sc.nextInt();
	}
}

