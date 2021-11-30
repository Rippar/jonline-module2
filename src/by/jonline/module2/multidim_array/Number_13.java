package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов*/

public class Number_13 {
	public static void main(String[] args) {

		int n = enterFromConsole(); 
		int w = enterFromConsole(); 

		if (n > 1 && w > 1 && n <= 100 && w <= 100) { // макс. размер задан для удобства представления

			double[][] a = new double[n][w];

			fillArray(a);

			System.out.println("Исходный массив:");
			printArray(a);

			sortByColumnAscending(a);
			System.out.println("Отсортированный массив в порядке возрастания по столбцам:");
			printArray(a);

			sortByColumnDecreasing(a);
			System.out.println("Отсортированный массив в порядке убывания по столбцам:");
			printArray(a);

		} else if (n > 100 || w > 100) {
			System.out.println("Введенные размеры матрицы слишком велики!");

		} else {
			System.out.println("Размер матрицы для данной задачи должен быть больше 1 х 1!");
		}
	}

	public static void sortByColumnAscending(double[][] a) { 
		boolean isSorted;

		for (int j = 0; j < a[0].length; j++) {
			isSorted = false;

			while (!isSorted) {
				isSorted = true;

				for (int i = 0; i < a.length - 1; i++) {

					if (a[i][j] > a[i + 1][j]) {
						double tmp;
						isSorted = false;

						tmp = a[i + 1][j];
						a[i + 1][j] = a[i][j];
						a[i][j] = tmp;
					}
				}
			}
		}
	}

	public static void sortByColumnDecreasing(double[][] a) {
		boolean isSorted = false;

		for (int j = 0; j < a[0].length; j++) {
			isSorted = false;

			while (!isSorted) {
				isSorted = true;

				for (int i = 0; i < a.length - 1; i++) {

					if (a[i][j] < a[i + 1][j]) {

						double tmp;
						isSorted = false;

						tmp = a[i + 1][j];
						a[i + 1][j] = a[i][j];
						a[i][j] = tmp;
					}
				}
			}
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

		System.out.println("Введите целое положительное число: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое положительное число!: ");

		}
		return sc.nextInt();
	}
}
