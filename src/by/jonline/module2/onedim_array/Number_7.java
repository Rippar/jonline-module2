package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*Даны действительные числа a1, a2,..., an. Найти max(a1 + a2, a2 + a3, ..., an + an+1) */

public class Number_7 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 1 && n <= 100) { // макс. размер задан для удобства представления
			
			double max = -Double.MAX_VALUE;

			double[] a = new double[n];

			fillArray(a);

			printArray(a);

			for (int i = 0; i < a.length - 1; i++) { 
				if (a[i] + a[i + 1] > max) {
					max = a[i] + a[i + 1];
				}
			}

			System.out.println("Максимальное значение: " + max);

		} else if (n > 100) {
			System.out.println("Введенный размер массива слишком велик!");

		} else {
			System.out.println("Размер массива для данной задачи должен быть больше 1!");

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

		System.out.println("Введите размер массива (от 2 до 100): ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое положительное число (от 2 до 100)!: ");

		}
		return sc.nextInt();
	}
}