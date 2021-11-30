package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
  
	1  2   3  .. n
	n n-1 n-2 .. 1
	1  2   3  .. n
	n n-1 n-2 .. 1
	.  .   . .   .
	.  .   .   . . 
	n n-1 n-2 .. 1 
	
*/

public class Number_4 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 1 && n % 2 == 0 && n <= 100) {

			int[][] a = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {

					if (i % 2 == 0) {
						a[i][j] = j + 1;

					} else {
						a[i][j] = n - j;
					}
				}
			}

			printArray(a);

		} else if (n > 100) {
			System.out.println("Введенный размер матрицы слишком велик!");

		} else {
			System.out.println("Размер матрицы должен быть представлен четным положительным числом!");
		}
	}

	public static void printArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.printf("%4d", a[i][j]);
			}

			System.out.println();
		}
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите четное число: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести четное число!: ");

		}
		return sc.nextInt();
	}

}