package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами*/


public class Number_6 {
	public static void main(String[] args) {

		int n = enterFromConsole();
		
		if (n > 0 && n < 2.0 * 10e6) {
			
			int[] a = new int[n];
			int sumOfSimple = 0;

			fillArray(a);

			printArray(a);

			for (int i = 2; i < a.length; i++) { // 0 и 1 не являются простыми числами
				if (isSimple(i)) {
					sumOfSimple += a[i];
				}
			}
			
			System.out.println(sumOfSimple);

		} else if (n > 100) {

			System.out.println("Введенный размер массива слишком велик!");

		} else {

			System.out.println("Размер массива для данной задачи должен быть больше 1!");
		}
	}

	public static boolean isSimple(int i) {
		for (int j = 2; j < i; j++) {

			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static void fillArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = 1 + (int) (Math.random() * 200);
		}
	}

	public static void printArray(int[] a) {

		System.out.println("Исходный массив:");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "; ");
		}
		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое положительное число, большее 1: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое положительное число, большее 1!: ");

		}
		return sc.nextInt();
	}

}