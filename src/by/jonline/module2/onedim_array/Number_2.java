package by.jonline.module2.onedim_array;

import java.util.Locale;
import java.util.Scanner;

/*ƒана последовательность действительных чисел a1, a2,..., an. «аменить все ее члены, большие данного Z, этим числом. ѕодсчитать количество замен.*/

public class Number_2 {
	public static void main(String[] args) {

		double n = enterFromConsole();

		if (n > 0 && n % 1 == 0) { // макс. размер задан дл€ удобства представлени€

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

			System.out.println(" оличество замен элементов на z: " + count);

		} else if (n > 100) {

			System.out.println("¬веденный размер массива слишком велик!");

		} else if (n % 1 != 0) {

			System.out.println("–азмер массива должен быть представлен целым числом!");

		} else {

			System.out.println("–азмер массива дл€ данной задачи должен быть больше 0!");

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
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH); // используетс€, чтобы вводить в консоль вещественные числа через точку (по умолчанию ввод через зап€тую)

		System.out.println("¬ведите размер массива, затем число Z");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Ќужно ввести число!: ");

		}
		return sc.nextDouble();
	}
}
