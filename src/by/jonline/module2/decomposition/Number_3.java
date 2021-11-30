package by.jonline.module2.decomposition;

import java.util.Locale;
import java.util.Scanner;

/*Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника*/

public class Number_3 {
	public static void main(String[] args) {

		double a = enterFromConsole();

		if (a > 0) {

			double s;
			s = 6 * triangleSquare(a);
			System.out.printf("Площадь правильного шестиугольника со стороной %.3f = %4.3f", a, s);

		} else {
			System.out.println("Сторона шестиугольника должна быть больше 0!");
		}

	}

	public static double triangleSquare(double a) {
		double s;
		s = Math.sqrt(3) * a * a / 4;
		return s;
	}

	public static double enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH); // используется, чтобы вводить в консоль вещественные числа через точку (по
										// умолчанию ввод через запятую)

		System.out.println("Введите положительное число: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Нужно ввести положительное число!: ");

		}
		return sc.nextDouble();
	}

}
