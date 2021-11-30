package by.jonline.module2.multidim_array;

/*Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз*/

public class Number_11 {
	public static void main(String[] args) {

		int l = 10;
		int w = 20;

		int[][] a = new int[l][w];

		fillArray(a);
		printArray(a);

		for (int i = 0; i < a.length; i++) {

			int count = 0;

			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] == 5) {
					count++;

				}
			}

			if (count >= 3) {
				System.out.println(i + "я строка матрицы содержит три и более числа 5");
			}
		}
	}

	public static void fillArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				a[i][j] = (int) (Math.random() * 16);
			}
		}
	}

	public static void printArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.printf("%4d", a[i][j]);
			}

			System.out.println();
		}
		System.out.println("\n");
	}

}
