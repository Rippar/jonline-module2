package by.jonline.module2.decomposition;

import java.util.Scanner;

/*Написать метод (методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел*/

public class Number_1 {
	public static void main(String[] args) {

		int a = enterFromConsole();
		int b = enterFromConsole();

		if (a > 0 && b > 0) {

			System.out.println("Наибольший общий делитель для данных чисел: " + gcd(a, b));
			System.out.println("Наименьшее общее кратное для данных чисел: " + lcm(a, b));

		} else {
			System.out.println("Введенные числа должны быть положительными!");
		}

	}

	public static int gcd(int a, int b) { // ����� ���

		if (b == 0) {
			return a;

		} else {
			return gcd(b, a % b);
		}
	}

	public static int lcm(int a, int b) { // ����� ���
		return a * (b / gcd(a, b));
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
