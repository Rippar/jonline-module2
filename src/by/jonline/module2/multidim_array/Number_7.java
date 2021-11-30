package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*Сформировать квадратную матрицу порядка N по правилу: 

    A[I, J] = sin((I^2 - J^2) / N);

и подсчитать количество положительных элементов в ней*/

public class Number_7 {
	public static void main(String[] args) { 
		
		int n = enterFromConsole();

		if (n > 1 && n <= 100) { // макс. размер задан для удобства представления
			
			double[][] a = new double[n][n];

			int count = 0;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {

					a[i][j] = Math.sin((i * i - j * j) / n);

					if (a[i][j] > 0) {
						count++;
					}
				}
			}

			printArray(a);

			System.out.println("Количество пожительных элементов в матрице: " + count);

		} else if (n > 100) {
			System.out.println("Введенный размер матрицы слишком велик!");

		} else {
			System.out.println("Размер матрицы для данной задачи должен быть больше 1 х 1!");
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

		System.out.println("Введите число, большее 1: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести число, большее 1!: ");

		}
		return sc.nextInt();
	}
}
