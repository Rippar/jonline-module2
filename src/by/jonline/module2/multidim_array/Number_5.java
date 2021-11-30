package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*������������ ���������� ������� ������� n �� ��������� ������� (n - ������):
 * 
	 1   1   1 ... 1   1   1
	 2   2   2 ... 2   2   0
	 3   3   3 ... 3   0   0
	 .   .   .     .   .   .
	 .   .   .  .  .   .   .
	 .   .   .     .   .   .	 
	n-1 n-1  0 ... 0   0   0
	 n   0   0 ... 0   0   0 
	 
*/

public class Number_5 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 1 && n % 2 == 0 && n <= 100) { // ����. ������ ����� ��� �������� �������������
			
			int[][] a = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {

					if (j > n - i - 1) {
						break;

					} else {
						a[i][j] = i + 1;
					}
				}
			}
			printArray(a);

		} else if (n > 100) {
			System.out.println("��������� ������ ������� ������� �����!");

		} else {
			System.out.println("������ ������� ������ ���� ����������� ������ ������������� ������!");
		}
	}

	public static void printArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.printf("%4d", a[i][j]);
			}

			System.out.println();
		}
		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("������� ������ �����: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ������ �����!: ");

		}
		return sc.nextInt();
	}

}