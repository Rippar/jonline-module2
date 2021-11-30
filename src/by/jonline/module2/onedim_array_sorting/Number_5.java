package by.jonline.module2.onedim_array_sorting;

import java.util.Scanner;

/*Сортировка вставками. Дана последовательность чисел a1, a2, .... an. Требуется переставить числа в порядке возрастания. 
Делается это следующим образом. Пусть  a1, a2, .... ai - упорядоченная последовательность, т.е a1<=a2<=..<=an. 
Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей. 
Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны. Примечание: Место помещения очередного элемента 
в отсортированную часть производить с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
*/

public class Number_5 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n >= 2 && n <= 100) {

			double[] a = new double[n];

			fillArray(a);

			printArray(a);

			for (int i = 0; i < a.length; i++) {
				double current = a[i];

				int low = binarySearch(a, i);

				for (int j = i; j > low; j--) {

					a[j] = a[j - 1];

				}
				a[low] = current;

			}

			printArray(a);

		} else {
			System.out.println("Размер массива должен быть размером от 2 до 100!");
		}

	}

	public static int binarySearch(double[] a, int i) {

		int lo = 0;
		int hi = i;
		int mid;

		double key = a[i];

		while (lo < hi) {
			mid = lo + (hi - lo) / 2;

			if (key < a[mid]) {
				hi = mid;

			} else {
				lo = mid + 1;
			}
		}

		return lo;
	}

	public static void fillArray(double[] a) {
		for (int i = 0; i < a.length; i++) {

			a[i] = -100 + Math.random() * 200;

		}
	}

	public static void printArray(double[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.printf("%9.3f", a[i]);
		}

		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое число от 2 до 100: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое число от 2 до 100!: ");

		}
		return sc.nextInt();
	}

}