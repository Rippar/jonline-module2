package by.jonline.module2.decomposition;

import java.util.Scanner;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
Для решения задачи использовать декомпозицию.*/

public class Number_15 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 1 && n < 10) {

			int start = (int) (Math.pow(10, n - 1));
			int end = (int) (Math.pow(10, n));

			for (int i = start; i < end; i++) {

				if (isStrictlyIncreasing(i)) {

					System.out.println(i);
				}
			}

		} else {
			System.out.println("Разрядность числа для данной задачи должна быть больше 1, но не больше 9!");
		}

	}

	public static boolean isStrictlyIncreasing(int a) {

		boolean flag = false;

		while (a / 10 != 0) {

			flag = true;

			int tmp = a % 10;

			a /= 10;

			if (a % 10 >= tmp) {

				flag = false;

				break;
			}
		}

		return flag;

	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите желаемую разрядность чисел для отображения: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое положительное число!");
		}

		return sc.nextInt();

	}

}