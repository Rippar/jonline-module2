package by.jonline.module2.multidim_array;

import java.util.Scanner;

/*��������� ���������� ������� ������� n*/

public class Number_16 {
	public static void main(String[] args) {

		int n = enterFromConsole();

		if (n > 2 && n <= 100) { // ����. ������ ����� ��� �������� �������������

			int[][] a = new int[n][n];

			if (n % 2 != 0) { // ���������� ����������� �������� ��� ��������� n

				printArray(magicSquareOdd(a));

			} else if (n % 4 == 0) { // ���������� ����������� �������� ��� ������� n, �������� 4

				printArray(magicSquareDoubleEven(a));

			} else if (n % 2 == 0 && n % 4 != 0) { // ���������� ����������� �������� ��� ������� n, �������� 2, �� �� �������� 4

				printArray(magicSquareSingleEven(a));

			}

		} else if (n > 100) {
			System.out.println("��������� ������ ������� ������� �����!");

		} else {
			System.out.println(
					"������ ������� ��� ������ ������ ������ ���� ����������� ����� ������������� ������, ������� 2!");
		}

	}

	public static int[][] magicSquareOdd(int[][] a) {

		/*
		 * ���� ������ ����������� � ���������� ��������� ������� ���������� �� 1 �� n^2
		 * � ������� �����������, ������� � ����������� ������ ������ ������. �����
		 * ����������� ��������� ����� ����� ������, ������� �� ��������� ������ � �����
		 * (���� �� ����� � ������� ������ ��� ������� ������ ������, �� "�������������"
		 * �� ��������������� ������� �������). ���� ���� ������ ��� ���� ���������
		 * ������ ����� �����, ���������� �������� ������ ����.
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
		 * ���� ������ ����������� � ���������� ��������� ������� ���������� �� 1 �� n^2
		 * � ������� ����������� ����� �������, ������� � ������� �������, � �����
		 * ��������� ������� ���������� ��������� ������� ���������� (�����������
		 * �������� ��������).
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
		 * ���� ������ ����������� � ��������� �������� ������� �� 4 �������� ���������
		 * n/2 � ����������� ������ ��������� � ���������� (��������� ��� ����� �����
		 * ���������� ����������� �������� ��� ��������� n). ����� ��� 0�� � 2��
		 * ���������� �� ������ ������� ������� � n/4 �������� (�������� �������� �� 0��
		 * �� 2� � �������� ���������), ����� ���������� n/4+1 ������� ��� �����������
		 * ������ ������� ��������� (�� ��������� +1 �� ������ ����). ����� ������
		 * ������� ������� � ��������� �������� 1�� � 3�� ���������� (�������� ��������
		 * �� 1�� � 3� � �������� ���������) ��� �������� n>6 �� ��������� �����:
		 * ��������, ��� n=6 ��������� ������� �� �������������; ��� n=10 �������������
		 * (n-1)� �������, ��� n=14 ������������� ��� ��������� ������� � ��� �����).
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

		System.out.println("������� ����� �����, ������� 2: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� �����, ������� 2!: ");

		}
		return sc.nextInt();
	}

}
