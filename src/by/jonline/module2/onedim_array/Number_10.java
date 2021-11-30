package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание: дополнительный массив не использовать*/

public class Number_10 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 1 && n <= 100) {

			int[] a = new int[n];

			fillArray(a);

			printArray(a);

			deleteFromArray(a);

			printArray(a);

		} else if (n > 100) {
			System.out.println("Введенный размер массива слишком велик!");

		} else {
			System.out.println("Размер массива для данной задачи должен быть больше 1!");

		}
	}

	public static void deleteFromArray(int[] a) {

		for (int i = 0; i <= a.length / 2; i++) {

			if (a.length == 2) {
				a[i + 1] = 0;
				break;
			}

			for (int j = i + 1; j < a.length - i - 1; j++) { 
				// заменяем каждый второй элемент следущим, сдвигаясь на + 1
				// элемент дальше при каждой итерации (i) и заменяя
				// (последний элемент - i) значением 0

				if (j % 2 != 0 && i % 2 == 0) {
					a[j] = a[j + 1];
				}

				if (j % 2 == 0 && i % 2 != 0) {
					a[j] = a[j + 1];
				}

				if (j == a.length - i - 2) {
					a[j + 1] = 0;

					if (a.length % 2 == 0) {
						a[j] = 0;
					}
				}
			}
		}
	}

	public static void fillArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = -100 + (int) (Math.random() * 200);
		}
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите размер массива (от 2 до 100): ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое положительное число (от 2 до 100)!: ");

		}
		return sc.nextInt();
	}
}