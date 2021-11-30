package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*Отсортировать строки матрицы по возрастанию и убыванию значений элементов*/

public class Number_12 {
	public static void main(String[] args) {

		int n = enterFromConsole(); // длина матрицы
		int w = enterFromConsole(); // ширина матрицы

		if (n > 1 && w > 1 && n <= 100 && w <= 100) { // макс. размер задан для удобства представления

			double[][] a = new double[n][w];

			fillArray(a);

			System.out.println("Исходный массив:");
			printArray(a);

			sortByLineAscending(a);
			System.out.println("Отсортированный массив в порядке возрастания по строкам:");
			printArray(a);

			sortByLineDecreasing(a);
			System.out.println("Отсортированный массив в порядке убывания по строкам:");
			printArray(a);

		} else if (n > 100 || w > 100) {
			System.out.println("Введенные размеры матрицы слишком велики!");

		} else {
			System.out.println("Размер матрицы для данной задачи должен быть больше 1 х 1!");
		}
	}

	public static void sortByLineAscending(double[][] a) { // сортировка в порядке возрастания по строкам
		boolean isSorted = false;

		for (int i = 0; i < a.length; i++) {
			isSorted = false;

			while (!isSorted) {
				isSorted = true;

				for (int j = 0; j < a[i].length - 1; j++) {

					if (a[i][j] > a[i][j + 1]) {

						double tmp;
						isSorted = false;

						tmp = a[i][j + 1];
						a[i][j + 1] = a[i][j];
						a[i][j] = tmp;
					}
				}
			}
		}
	}

	public static void sortByLineDecreasing(double[][] a) { // сортировка в порядке убывания по строкам
		boolean isSorted;

		for (int i = 0; i < a.length; i++) {
			isSorted = false;

			while (!isSorted) {
				isSorted = true;

				for (int j = 0; j < a[i].length - 1; j++) {

					if (a[i][j] < a[i][j + 1]) {

						double tmp;
						isSorted = false;

						tmp = a[i][j + 1];
						a[i][j + 1] = a[i][j];
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
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое положительное число: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое положительное число!: ");

		}
		return sc.nextInt();
	}
}
