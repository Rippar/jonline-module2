package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали*/

public class Number_2 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 1 && n <= 100) { // макс. размер задан для удобства представления

			double[][] a = new double[n][n];

			fillArray(a);
			printArray(a);

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {

					if (i == j) {
						System.out.printf("%9.3f", a[i][j]);
					} else {
						System.out.printf("%9s", "");
					}
				}
				System.out.println();
			}

		} else if (n > 100) {
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
		System.out.println("�������� �������:");

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