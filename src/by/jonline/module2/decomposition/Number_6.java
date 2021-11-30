package by.jonline.module2.decomposition;

import java.util.Scanner;

/*Написать метод (методы), проверяющий, являются ли данные три числа взаимно простыми*/

public class Number_6 {
	public static void main(String[] args) {
		
		int a = enterFromConsole();
		int b = enterFromConsole();
		int c = enterFromConsole();

		if (a > 0 && b > 0 && c > 0) {

			int result = gcd(gcd(a, b), c);

			if (result == 1) {
				System.out.println("Введенные числа являются взаимно простыми");

			} else {
				System.out.println("Введенные числа не являются взаимно простыми");
			}

		} else {
			System.out.println("Введенные числа должны быть больше 0!");
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

		System.out.println("Введите целое положительное число: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое положительное число!");
		}

		return sc.nextInt();

	}

}
