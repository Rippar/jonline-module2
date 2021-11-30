package by.jonline.module2.decomposition;

import java.util.Locale;
import java.util.Scanner;

/*Даны числа X, Y, Z, T - длины сторон четырехугольника. Написать метод (методы) вычисления его площади, 
если угол между сторонами длиной X и Y - прямой.*/

public class Number_9 {
	public static void main(String[] args) {

		double x = enterFromConsole();
		double y = enterFromConsole();
		double z = enterFromConsole();
		double t = enterFromConsole();

		if (x > 0 && y > 0 && z > 0 && t > 0) {

			double s = quadrangleSquare(x, y, z, t);

			if (s != s || (Math.abs(x - y) > z + t)) { // проверка на NaN, а также на соблюдение неравенства
				// четырехугольника

				System.out.println("Исходя из условия данной задачи, четырехугольника с такими сторонами не существует. "
								+ "Попробуйте ввести другие значения сторон.");

			} else {
				System.out.printf("Площадь данного четырехугольника: %4.3f", s);
			}

		} else {
			System.out.println("Стороны четырехугольника должны быть больше 0!");
		}

	}

	public static double quadrangleSquare(double x, double y, double z, double t) {

		double d;
		double s1;
		double s2;
		double s;

		d = Math.sqrt(x * x + y * y); // поиск длины гипотенузы треугольника xyd

		s1 = triangleSquare(x, y, d);
		s2 = triangleSquare(z, t, d);

		s = s1 + s2;

		return s;

	}

	public static double triangleSquare(double a, double b, double c) { // метод нахождения площади треугольника через
		// полупериметр
		double p;
		double s;

		p = (a + b + c) / 2.0;

		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return s;

	}

	public static double enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH); 

		System.out.println("Введите длину стороны четырехугольника: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Нужно ввести вещественное положительное число!");
		}

		return sc.nextDouble();

	}

}
