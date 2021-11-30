package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*Даны действительные числа a1, a2,..., an. Поменять местами наибольший и наименьший элементы*/

public class Number_4 {
	public static void main(String[] args) {
		
		int n = enterFromConsole();
			
		if (n > 1 && n < 100) { // макс. размер задан для удобства представления
			
			double max = -Double.MAX_VALUE;
			double min = Double.MAX_VALUE;

			int maxPosition = 0;
			int minPosition = 0;

			double[] a = new double[n];

			fillArray(a);

			printArray(a);

			for (int i = 0; i < a.length; i++) {
				
				if (a[i] > max) {
					max = a[i];
					maxPosition = i;
				}
				
				if (a[i] < min) {
					min = a[i];
					minPosition = i;
				}
			}

			double tmp = a[maxPosition];
			
			a[maxPosition] = a[minPosition];
			a[minPosition] = tmp;

			printArray(a);
			
		} else if (n > 100) {

			System.out.println("Введенный размер массива слишком велик!");

		} else {

			System.out.println("Размер массива для данной задачи должен быть больше 1!");
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

		System.out.println("Введите целое положительное число, которое больше 1: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое положительное число, которое больше 1!: ");

		}
		return sc.nextInt();
	}
}