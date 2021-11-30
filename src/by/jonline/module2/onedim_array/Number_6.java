package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*«адана последовательность N вещественных(?) чисел. ¬ычислить сумму чисел, пор€дковые номера которых €вл€ютс€ простыми числами*/
/*¬озможно, ошибка в условии, так как вещественные числа не могут быть простыми*/

public class Number_6 {
	public static void main(String[] args) {

		int n = enterFromConsole();
		
		if (n > 0 && n < 2.0 * 10e6) {
			
			int[] a = new int[n];
			int sumOfSimple = 0;

			fillArray(a);

			printArray(a);

			for (int i = 2; i < a.length; i++) { // 0 и 1 не €вл€ютс€ простыми числами
				if (isSimple(i)) {
					sumOfSimple += a[i];
				}
			}

		} else if (n > 100) {

			System.out.println("¬веденный размер массива слишком велик!");

		} else {

			System.out.println("–азмер массива дл€ данной задачи должен быть больше 1!");
		}
	}

	public static boolean isSimple(int a) {
		for (int i = 2; i < a; i++) {

			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void fillArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = 1 + (int) (Math.random() * 200);
		}
	}

	public static void printArray(int[] a) {

		System.out.println("»сходный массив:");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "; ");
		}
		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите целое положительное число, большее 1: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Ќужно ввести целое положительное число, большее 1!: ");

		}
		return sc.nextInt();
	}

}