package by.jonline.module2.decomposition;

import java.util.Scanner;

/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенных в степень n,
равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию*/

public class Number_14 {
	public static void main(String[] args) {

		int k = enterFromConsole();

		if (k > 1) {

			for (int i = 1; i <= k; i++) {

				if (isArmstrongNum(i)) {
					System.out.println("Число " + i + " является числом Армстронга");
				}
			}

		} else {
			System.out.println("Нужно ввести целое число, большее 1!");

		}

	}

	public static boolean isArmstrongNum(int a) {

		boolean flag = false;

		int copyA = a;

		int n = numberOfDigits(a);

		int sum = 0;

		for (int i = 0; i < n; i++) {

			int tmp = copyA % 10;

			sum += Math.pow(tmp, n);

			copyA /= 10;
		}

		if (sum == a) {
			flag = true;
		}

		return flag;
	}

	public static int numberOfDigits(int a) {

		int count = 1;

		while (a / 10 != 0) {

			a /= 10;
			count++;
		}

		return count;
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое число, большее 1: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое число, большее 1!");
		}

		return sc.nextInt();

	}

}
