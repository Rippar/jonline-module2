package by.jonline.module2.decomposition;

import java.util.Scanner;

/*Ќаписать метод (методы), провер€ющий, €вл€ютс€ ли данные три числа взаимно простыми*/

public class Number_6 {
	public static void main(String[] args) {
		
		int a = enterFromConsole();
		int b = enterFromConsole();
		int c = enterFromConsole();

		if (a > 0 && b > 0 && c > 0) {

			int result = gcd(gcd(a, b), c);

			if (result == 1) {
				System.out.println("¬веденные числа €вл€ютс€ взаимно простыми");

			} else {
				System.out.println("¬веденные числа не €вл€ютс€ взаимно простыми");
			}

		} else {
			System.out.println("¬веденные числа должны быть больше 0!");
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
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите целое положительное число: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Ќужно ввести целое положительное число!");
		}

		return sc.nextInt();

	}

}
