package by.jonline.module2.decomposition;

import java.util.Scanner;

/*Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий надо
произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/

public class Number_17 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n >= 0 && n <= 100000) {

			System.out.println(subtraction(n, 0));

		} else if (n < 0) {
			System.out.println("Исходя из условий задачи, число должно быть больше 0!");

		} else {
			System.out.println("Размер числа слишком большой! Возможна ошибка переполнения.");
		}

	}

	public static int subtraction(int a, int count) {

		if (a == 0) {
			
			return count;

		} else {

			return subtraction(a - sumOfDigits(a), count + 1);
		}
	}

	public static int sumOfDigits(int a) {

		int sum = 0;

		while (a / 10 != 0) {

			sum += a % 10;
			
			a /= 10;
		}

		sum += a % 10;

		return sum;
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое положительное цисло: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое положительное число!");
		}

		return sc.nextInt();

	}

}
