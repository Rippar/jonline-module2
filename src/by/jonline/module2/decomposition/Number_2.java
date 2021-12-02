package by.jonline.module2.decomposition;

import java.util.Scanner;

/*Написать метод (методы) для нахождения наибольшего общего делителя четырех натуральных чисел*/

public class Number_2 {
	public static void main(String[] args) {

		int a = enterFromConsole();
		int b = enterFromConsole();
		int c = enterFromConsole();
		int d = enterFromConsole();

		if (a > 0 && b > 0 && c > 0 && d > 0) {

			System.out.println("Наибольший общий делитель для данных чисел:  " + gcd(gcd(a, b), gcd(c, d)));

		} else {
			System.out.println("Введенные числа должны быть положительными!");
		}
	}

	public static int gcd(int a, int b) { 

		if (b == 0) {
			return a;

		} else {
			return gcd(b, a % b);
		}
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите натуральное число: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести натуральное число!: ");

		}
		return sc.nextInt();
	}

}
