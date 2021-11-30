package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*ƒана последовательность целых чисел a1, a2,..., an. ќбразовать новую последовательность, выбросив из исходной те члены, которые равны min(a1, a2,..., an)*/

public class Number_8 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 1 && n <= 100) { // макс. размер задан дл€ удобства представлени€

			int[] a = new int[n];

			fillArray(a);

			printArray(a);

			int[] b = deleteMin(a);

			printArray(b);

		} else if (n > 100) {
			System.out.println("¬веденный размер массива слишком велик!");

		} else {
			System.out.println("–азмер массива дл€ данной задачи должен быть больше 1!");

		}

	}

	public static int[] deleteMin(int[] a) {
		int min = Integer.MAX_VALUE;
		int count = 0;

		for (int i = 0; i < a.length; i++) { // поиск мин. значени€
			if (a[i] < min) {
				min = a[i];
			}
		}

		for (int i = 0; i < a.length; i++) { // определение кол-ва мин. значений в массиве
			if (a[i] == min) {
				count++;
			}
		}

		int[] b = new int[a.length - count]; //создание нового массива с исключением мин. значений предыдущего массива

		for (int i = 0, j = 0; i < a.length; i++) {

			if (a[i] == min) {
				continue;
			}

			b[j] = a[i];

			j++;
		}

		return b;
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
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите размер массива (от 2 до 100): ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Ќужно ввести целое положительное число (от 2 до 100)!: ");

		}
		return sc.nextInt();
	}

}