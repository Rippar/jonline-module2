package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*ƒаны целые числа a1, a2,..., an. ¬ывести на печать только те числа, дл€ которых ai>i.*/

public class Number_5 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 1 && n < 100) { // макс. размер задан дл€ удобства представлени€

			int[] a = new int[n];

			fillArray(a);

			printArray(a);

			System.out.print("„исла, дл€ которых ai>i: ");
			for (int i = 0; i < a.length; i++) {
				if (a[i] > i) {

					System.out.print(a[i] + "; ");
				}
			}

		} else if (n > 100) {

			System.out.println("¬веденный размер массива слишком велик!");

		} else {

			System.out.println("–азмер массива дл€ данной задачи должен быть больше 1!");
		}
	}

	public static void fillArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = -100 + (int) (Math.random() * 200);
		}
	}

	public static void printArray(int[] a) {

		System.out.println("»сходный массив:");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "; ");
		}
		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите целое положительное число, большее 1: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Ќужно ввести целое положительное число, большее 1!: ");

		}
		return sc.nextInt();
	}
}