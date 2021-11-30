package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.*/

public class Number_3 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 0 && n < 100) { // макс. размер задан для удобства представления

			int sumPositive = 0;
			int sumNegative = 0;
			int sumZero = 0;

			double[] a = new double[n];

			fillArray(a);

			printArray(a);

			for (int i = 0; i < a.length; i++) {
				
				if (a[i] > 0) {
					sumPositive++;

				} else if (a[i] < 0) {
					sumNegative++;

				} else {
					sumZero++;
				}
			}

			System.out.println("\n Сумма положительных элементов: " + sumPositive + "\n Сумма отрицательных элементов: "
					+ sumNegative + "\n Сумма элементов, равных 0: " + sumZero);

		} else if (n > 100) {

			System.out.println("Введенный размер массива слишком велик!");

		} else {

			System.out.println("Размер массива для данной задачи должен быть больше 0!");

		}
	}

	public static void fillArray(double[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = -100 + Math.random() * 200;
		}
	}

	public static void printArray(double[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%9.3f", a[i]);
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