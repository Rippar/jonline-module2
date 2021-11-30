package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*ƒана матрица. ¬ывести k-ю строку и p-й столбец матрицы*/

public class Number_3 {
	public static void main(String[] args) {

		int n = enterFromConsole(); // длина матрицы
		int w = enterFromConsole(); // ширина матрицы
		int k = enterFromConsole(); // k-€ строка
		int p = enterFromConsole(); // p-й столбец

		if ((n > 1 && w > 1 && n <= 100 && w <= 100) && (k >= 0 && p >= 0 && k < n && p < w)) { 
			
			double[][] a = new double[n][w];

			fillArray(a);
			printArray(a);

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if (i == k || j == p) {
						System.out.printf("%9.3f", a[i][j]);

					} else {
						System.out.printf("%9s", "");
					}
				}
				System.out.println();
			}

		} else if (n > 100 || k > 100) {
			System.out.println("¬веденные размеры матрицы слишком велики!");

		} else if (k >= n || p >= w) {
			System.out.println("k и p должны предствл€ть собой существующие строку и столбец данной матрицы!");

		} else {
			System.out.println(
					"–азмер матрицы дл€ данной задачи должен быть больше 1 х 1, а k и p должны предствл€ть собой существующие строку и столбец данной матрицы!");

		}

	}

	public static void fillArray(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = -100 + Math.random() * 200;
			}
		}
	}

	public static void printArray(double[][] a) {
		System.out.println("»сходна€ матрица:");

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

		System.out.println("¬ведите неотрицательное целое число: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Ќужно ввести неотрицательное целое число!: ");

		}
		return sc.nextInt();
	}

}