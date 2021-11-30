package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*Даны целые числа a1, a2,..., an. Вывести на печать только те числа, для которых ai>i.*/

public class Number_5 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 1 && n < 100) { // макс. размер задан для удобства представления

			int[] a = new int[n];

			fillArray(a);

			printArray(a);

			System.out.print("Числа, для которых ai>i: ");
			for (int i = 0; i < a.length; i++) {
				if (a[i] > i) {

					System.out.print(a[i] + "; ");
				}
			}

		} else if (n > 100) {

			System.out.println("Введенный размер массива слишком велик!");

		} else {

			System.out.println("Размер массива для данной задачи должен быть больше 1!");
		}
	}

	public static void fillArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = -100 + (int) (Math.random() * 200);
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