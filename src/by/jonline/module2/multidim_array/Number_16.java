package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*Построить магический квадрат порядка n*/

public class Number_16 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 2 && n <= 100) { // макс. размер задан для удобства представления

			int[][] a = new int[n][n];

			if (n % 2 != 0) { // построение магического квадрата для нечетного n

				printArray(magicSquareOdd(a));

			} else if (n % 4 == 0) { // построение магического квадрата для четного n, кратного 4

				printArray(magicSquareDoubleEven(a));

			} else if (n % 2 == 0 && n % 4 != 0) { // построение магического квадрата для четного n, кратного 2, но не кратного 4

				printArray(magicSquareSingleEven(a));

			}

		} else if (n > 100) {
			System.out.println("Введенный размер матрицы слишком велик!");

		} else {
			System.out.println(
					"Размер матрицы для данной задачи должен быть представлен целым положительным числом, большим 2!");
		}

	}

	public static int[][] magicSquareOdd(int[][] a) {

		/*
		 * Суть метода заключается в заполнении элементов матрицы значениями от 1 до n^2
		 * в порядке возрастания, начиная с центральной ячейки нижней строки. Далее
		 * присваиваем следующее целое число ячейке, смежной по диагонали справа и снизу
		 * (если мы стоим в крайней правой или крайней нижней ячейке, то "перескакиваем"
		 * на противоположную сторону матрицы). Если этой ячейке уже было присвоено
		 * другое целое число, используем соседнюю ячейку выше.
		 */

		int n = a.length;
		int line = n - 1;
		int column = n / 2;

		a[line][column] = 1;

		for (int i = 2; i <= n * n; i++) {
			if (a[(line + 1) % n][(column + 1) % n] == 0) {

				line = (line + 1) % n;
				column = (column + 1) % n;

			} else {
				line = (line - 1 + n) % n;
			}

			a[line][column] = i;
		}

		return a;
	}

	public static int[][] magicSquareDoubleEven(int[][] a) {

		/*
		 * Суть метода заключается в заполнении элементов матрицы значениями от 1 до n^2
		 * в порядке возрастания слева направо, начиная с верхней строчки, и затем
		 * изменения порядка следования элементов главных диагоналей (переставить
		 * элементы наоборот).
		 */

		int n = a.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = (n * i) + j + 1;
			}
		}

		for (int i = 0; i < n / 4; i++) {
			for (int j = 0; j < n / 4; j++) {
				a[i][j] = (n * n + 1) - a[i][j];
			}
		}

		for (int i = 0; i < n / 4; i++) {
			for (int j = 3 * (n / 4); j < n; j++) {
				a[i][j] = (n * n + 1) - a[i][j];
			}
		}

		for (int i = 3 * n / 4; i < n; i++) {
			for (int j = 0; j < n / 4; j++) {
				a[i][j] = (n * n + 1) - a[i][j];
			}
		}

		for (int i = 3 * n / 4; i < n; i++) {
			for (int j = 3 * n / 4; j < n; j++) {
				a[i][j] = (n * n + 1) - a[i][j];
			}
		}

		for (int i = n / 4; i < 3 * n / 4; i++) {
			for (int j = n / 4; j < 3 * n / 4; j++) {
				a[i][j] = (n * n + 1) - a[i][j];
			}
		}

		return a;
	}

	public static int[][] magicSquareSingleEven(int[][] a) {

		/*
		 * Суть метода заключается в разбиении исходной матрицы на 4 квадрата размерами
		 * n/2 и превращении данных квадратов в магические (используя для этого метод
		 * построения магического квадрата для нечетного n). Далее для 0го и 2го
		 * квадрантов мы меняем местами позиции в n/4 столбцах (перенося значения из 0го
		 * во 2й и наоборот квадранты), также задействуя n/4+1 столбец для центральной
		 * строки каждого квадранта (со смещением +1 от левого края). Также меняем
		 * местами позиции в последних столбцах 1го и 3го квадрантов (перенося значения
		 * из 1го в 3й и наоборот квадранты) для значений n>6 по следующей схеме:
		 * например, при n=6 последний столбец не задействуется; при n=10 задействуется
		 * (n-1)й столбец, при n=14 задействуются два последних столбца и так далее).
		 * 
		 */

		int n = a.length;
		int size = n * n;
		int halfN = n / 2;
		int subSquareSize = size / 4;

		int[][] tmp = new int[halfN][halfN];
		int[][] subSquare = magicSquareOdd(tmp);

		int[] quadrantNumbers = { 0, 2, 3, 1 };

		int[][] result = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				int quadrant = (i / halfN) * 2 + (j / halfN);

				result[i][j] = subSquare[i % halfN][j % halfN];
				result[i][j] += quadrantNumbers[quadrant] * subSquareSize;
			}
		}

		int nColsLeft = halfN / 2;
		int nColsRight = nColsLeft - 1;

		for (int i = 0; i < halfN; i++) {
			for (int j = 0; j < n; j++) {

				if (j < nColsLeft || j >= n - nColsRight || (j == nColsLeft && i == nColsLeft)) {

					if (j == 0 && i == nColsLeft) {
						continue;
					}

					int temp = result[i][j];

					result[i][j] = result[i + halfN][j];
					result[i + halfN][j] = temp;
				}
			}
		}

		return result;

	}

	public static void printArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.printf("%6d", a[i][j]);
			}

			System.out.println();
		}
		System.out.println("\n");
	}

	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое число, большее 2: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое число, большее 2!: ");

		}
		return sc.nextInt();
	}

}
