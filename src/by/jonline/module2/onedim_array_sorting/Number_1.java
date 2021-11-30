package by.jonline.module2.onedim_array_sorting;

import java.util.Scanner;

/*Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один массив, 
включив второй массив между k-м и (k+1)-м элементами первого, при этом не используя дополнительный массив*/

public class Number_1 {
	public static void main(String[] args) {

		int n = enterFromConsole(); // размер первого массива
		int l = enterFromConsole(); // размер второго массива
		int k = enterFromConsole(); // число k

		if ((n > 1 && l > 0) && (n <= 100 && l <= 100) && (k < n - 1 && k >= 0)) {

			double[] a = new double[n];
			double[] b = new double[l];
			double[] c = new double[n + l];

			fillArray(a);
			fillArray(b);

			printArray(a);
			printArray(b);

			for (int i = 0; i < c.length; i++) {

				if (i <= k) {
					c[i] = a[i];
					continue;
					
				} else if (i == k + 1) {

					for (int j = 0; j < b.length; j++, i++) {
						c[i] = b[j];
					}
				}

				for (int j = k + 1; j < a.length; j++) {
					c[i] = a[j];
				}

			}

			printArray(c);

		} else if (k >= n - 1 || k < 0) {
			System.out.println("k должно быть между k-м и (k+1)м элементом первого массива");

		} else {
			System.out.println("Размеры массивов должны быть больше 0, но не больше 100");
		}
	}

	public static void fillArray(double[] a) {
		for (int i = 0; i < a.length; i++) {

			a[i] = -100 + Math.random() * 100;

		}
	}

	public static void printArray(double[] a) {

		for (int i = 0; i < a.length; i++) {

			System.out.printf("%9.3f", a[i]);
		}

		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое неотрицательное число:  ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое неотрицательное число!: ");

		}
		return sc.nextInt();
	}

}