package by.jonline.module2.onedim_array;

import java.util.Locale;
import java.util.Scanner;

/*Дана последовательность действительных чисел a1, a2,..., an. Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.*/

public class Number_2 {
	public static void main(String[] args) {

		double n = enterFromConsole();

		if (n > 0 && n % 1 == 0) { // макс. размер задан для удобства представления

			int count = 0;
			int length = (int) n;
			double z = enterFromConsole();
			
			double[] a = new double[length];

			fillArray(a);

			printArray(a);

			for (int i = 0; i < a.length; i++) {
				if (a[i] > z) {
					a[i] = z;
					count++;
				}
			}

			printArray(a);

			System.out.println("Количество замен элементов на z: " + count);

		} else if (n > 100) {

			System.out.println("Введенный размер массива слишком велик!");

		} else if (n % 1 != 0) {

			System.out.println("Размер массива должен быть представлен целым числом!");

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

	public static double enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH); // используется, чтобы вводить в консоль вещественные числа через точку (по умолчанию ввод через запятую)

		System.out.println("Введите размер массива, затем число Z");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Нужно ввести число!: ");

		}
		return sc.nextDouble();
	}
}
