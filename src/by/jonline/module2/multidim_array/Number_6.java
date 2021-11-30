package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*������������ ���������� ������� ������� n �� ��������� ������� (n - ������):

	 1  1  1  ... 1  1  1
	 0  1  1  ... 1  1  0
	 0  0  1  ... 1  0  0
	 .  .  . .    .  .  .
	 .  .  .   .  .  .  .
	 .  .  .      .  .  .	 
	 0  1  1  ... 1  1  0
	 1  1  1  ... 1  1  1 

*/

public class Number_6 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 1 && n % 2 == 0 && n <= 100) { // ����. ������ ����� ��� �������� �������������

			int[][] a = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {

					if (i < n / 2) {
						
						if (j < i || j >= n - i) {
							continue;
							
						} else {
							a[i][j] = 1;
						}

					} else {

						if (j < n - i - 1 || j > i) {
							continue;

						} else {
							a[i][j] = 1;
						}
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