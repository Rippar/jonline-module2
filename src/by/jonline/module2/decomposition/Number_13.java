package by.jonline.module2.decomposition;

import java.util.Scanner;

/*Два простых числа называются "близнецами", если они отличаются друг от друга на 2 (например, 41 и 43). Найти и напечатать все пары 
"близнецов" из отрезка [n, 2n], где n - заданное натуральное число, большее 2. Для решения задачи использовать декомпозицию.*/

public class Number_13 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 2 && n <= 10000) { // макс. размер задан для удобства представления

			twinsDigits(n);

		} else {
			System.out.println("Введенное число должно быть больше 2, но не больше 10000!");
		}

	}

	public static void twinsDigits(int n) {

		for (int i = n; i <= 2 * n - 2; i++) {

			if (i % 2 == 0) { // исключаем все четные числа из проверки
				continue;
			}

			if (isSimple(i) && isSimple(i + 2)) {
				System.out.println(i + ", " + (i + 2));
			}
		}
	}

	public static boolean isSimple(int n) {

		boolean flag = true;

		for (int factor = 2; factor <= n / factor; factor++) {

			if (n % factor == 0) {

				flag = false;
				break;
			}
		}

		return flag;

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
