package by.jonline.module2.decomposition;

import java.util.Scanner;

/*Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
Пояснение. Составить метод (методы) для вычисления суммы трех последовательно расположенных элементов массива 
с номерами от k до m.*/

public class Number_8 {
	public static void main(String[] args) { 

		int n = enterFromConsole();
		int k = enterFromConsole();

		if (n > 2 && n <= 100 && k >= 0 && k <= n - 3) { 

			double[] d = new double[n];

			fillArray(d);
			printArray(d);

			double sum = sumOfThreeElements(d, k);

			System.out.printf("Cумма трех последовательно расположенных элементов массива, начиная с " + k
					+ "го элемента: %4.3f",sum);

		} else {
			System.out.println("Размер массива для данной задачи должен быть больше 2, но не более 100, "
					+ "а k должно указывать начало последовательности трех элементов массива!");
		}

	}

	public static double sumOfThreeElements(double[] d, int k) {

		double sum = 0;

		for (int i = k; i < k + 3; i++) {
			sum += d[i];
		}

		return sum;
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

		System.out.println("Введите целое число, большее 2: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое число, большее 2!");
		}

		return sc.nextInt();

	}

}