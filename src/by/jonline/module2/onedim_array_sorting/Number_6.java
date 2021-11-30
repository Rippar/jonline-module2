package by.jonline.module2.onedim_array_sorting;

import java.util.Scanner;

/*Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается это следующим образом: 
сравниваются два соседних элемента ai и ai+1. Если ai < ai+1, то продвигаются на один элемент вперед. Если ai > ai+1, то 
производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.*/

public class Number_6 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n >= 2 && n <= 100) { //макс. размер задан для удобства представления

			double[] a = new double[n];

			fillArray(a);

			printArray(a);

			for (int i = 1; i < a.length;) {

				if (a[i - 1] <= a[i]) {
					i++;

				} else {

					double tmp = a[i];

					a[i] = a[i - 1];
					a[i - 1] = tmp;

					if (i == 1) {
						continue;
					}

					i--;
				}
			}

			printArray(a);

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
