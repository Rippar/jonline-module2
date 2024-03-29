package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего*/

public class Number_1 {
	public static void main(String[] args) {

		int n = enterFromConsole();
		int k = enterFromConsole();

		if (n > 1 && k > 1 && n <= 100 && k <= 100) { // макс. размер задан для удобства представления

			double[][] a = new double[n][k];

			fillArray(a);
			printArray(a);

			int l = a.length;
			for (int i = 0; i < l; i++) {

				for (int j = 0; j < a[i].length; j++) {

					if (j % 2 != 0 && a[0][j] > a[l - 1][j]) {
						System.out.printf("%9.3f", a[i][j]);

					} else {

						continue;
					}
				}
				System.out.println();
			}

		} else if (n > 100 || k > 100) {
			System.out.println("Введенные размеры матрицы слишком велики!");

		} else {
			System.out.println("Размер матрицы для данной задачи должен быть больше 1 х 1 !");

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
		System.out.println("Исходная матрица:");

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

		System.out.println("Введите положительное число, большее 1: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести положительное число, большее 1!: ");

		}
		return sc.nextInt();
	}
}