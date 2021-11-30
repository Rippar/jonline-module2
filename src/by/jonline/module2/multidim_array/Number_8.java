package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*В чиcловой матрице поменять местами два любых столбца, т.е. все элементы одного столбца поставить на соответствующие им позиции другого, а его элементы переместить в первых. Номера столбцов вводит пользователь с клавиатуры*/

public class Number_8 {
	public static void main(String[] args) {

		int n = enterFromConsole(); // длина матрицы
		int w = enterFromConsole(); // ширина матрицы
		int k = enterFromConsole(); // k-й столбец
		int p = enterFromConsole(); // p-й столбец

		if ((n > 1 && w > 1 && n <= 100 && w <= 100) && (k >= 0 && p >= 0 && k < w && p < w)) {

			double[][] a = new double[n][w];

			fillArray(a);
			printArray(a);

			double tmp = 0;

			for (int i = 0; i < a.length; i++) {

				tmp = a[i][k];
				a[i][k] = a[i][p];
				a[i][p] = tmp;

			}

			printArray(a);

		} else if (n > 100 || k > 100) {
			System.out.println("Введенные размеры матрицы слишком велики!");

		} else if (k >= w || p >= w) {
			System.out.println("k и p должны предствлять собой существующие столбцы данной матрицы!");

		} else {
			System.out.println(
					"Размер матрицы для данной задачи должен быть больше 1 х 1, а k и p должны предствлять собой существующие столбцы данной матрицы!");

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

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.printf("%9.3f", a[i][j]);
			}

			System.out.println();
		}
		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите неотрицательное целое число: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести неотрицательное целое число!: ");

		}
		return sc.nextInt();
	}
}