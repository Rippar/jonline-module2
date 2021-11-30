package by.jonline.module2.onedim_array_sorting;

import java.util.Scanner;

/*
Сортировка обменами. Дана последовательность чисел a1, a2, .... an. Требуется переставить числа в порядке возрастания. 
Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1, то делается перестановка. Так продолжается до тех пор,
пока все элементы не станут расположены в порядке возрастания. Составить алгоритм сортировки, подсчитывая при этом количество перестановок.
*/

public class Number_4 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n >= 2 && n <= 100) {

			double[] a = new double[n];

			fillArray(a);

			printArray(a);

			int count = 0;
			boolean isSorted = false;

			while (!isSorted) {
				isSorted = true;

				for (int i = 0; i < a.length - 1; i++) {
					double tmp;

					if (a[i] > a[i + 1]) {
						isSorted = false;
						
						tmp = a[i];
						a[i] = a[i + 1];
						a[i + 1] = tmp;
						
						count++;
					}
				}
			}

			printArray(a);

			System.out.println("количество перестановок: " + count);

		} else {
			System.out.println("Размер массива должен быть размером от 2 до 100!");
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
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое число от 2 до 100: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое число от 2 до 100!: ");

		}
		return sc.nextInt();
	}

}