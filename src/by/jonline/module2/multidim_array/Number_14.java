package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца*/

public class Number_14 {
	public static void main(String[] args) {

		int m = enterFromConsole(); // длина матрицы
		int n = enterFromConsole(); // ширина матрицы


		if ((m > 1 && n > 1 && m <= 100 && n <= 100) && (n - m <= 1)) { // макс. размер задан для удобства представления

			int[][] a = new int[m][n];

			for (int j = 0; j < a[0].length; j++) {
				for (int i = 0; i < j; i++) {
					a[i][j]++;
				}
			}

			printArray(a);

		} else if (m > 100 || n > 100) {
			System.out.println("Введенные размеры матрицы слишком велики!");

		} else if (n - m > 1) {
			System.out.println("По условию задачи, ширина матрицы не может превышать её длину более чем на единицу!");

		} else {
			System.out.println("Размер матрицы для данной задачи должен быть больше 1 х 1!");
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
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Введите длину и ширину матрицы (ширина матрицы не должна превышать её длину более чем на единицу): ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое положительное число!: ");

		}
		return sc.nextInt();
	}

}
