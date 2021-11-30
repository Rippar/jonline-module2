package by.jonline.module2.multidim_array;

/*������� 10�20 ��������� ���������� ������� �� 0 �� 15. ������� �� ����� ���� ������� � ������ �����, � ������� ����� 5 ����������� ��� � ����� ���*/

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
				System.out.println(i + "� ������ ������� �������� ��� � ����� ����� 5");
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
