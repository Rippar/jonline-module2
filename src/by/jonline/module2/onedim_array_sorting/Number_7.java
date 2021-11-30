package by.jonline.module2.onedim_array_sorting;

/*����� ���� ��� ����������� ������������������ �������������� ����� a1<=a2<=..<=an � b1<=b2<=...<=bm.  ��������� ������� �� �����, 
 �� ������� ����� ��������� �������� ������������������ b1<=b2<=...<=bm � ������ ������������������ ���, ����� ����� 
 ������������������ ���������� ������������.*/

public class Number_7 {
	public static void main(String[] args) {

		double[] a = { -5, 2, 4, 6, 7, 9 };
		double[] b = { -25, -12, 3, 6, 11, 25, 34 };
		double[] c = concatenateArrays(a, b);

		printArray(a);

		printArray(b);

		printArray(c);

		for (int i = a.length; i < c.length; i++) { // ����� ����� ��������� ���������� �������� � ��������������� �����
													// ������������� ������� (�� ������� ���������� ������ ��������) �
													// ������� ��������� ������. �� �����, ������������ ���������������
													// ������ �������� ������ �������� � ���������� � ���� ���������
													// ������� ������� ���, ����� ������ ��-�������� ���������
													// ������������

			double current = c[i];

			int low = binarySearch(c, i);

			for (int j = i; j > low; j--) {

				c[j] = c[j - 1];

			}

			c[low] = current;

			System.out.println(i - a.length + "� ������� ������� ������� ������ �� " + low + "� ������� ������� (������) ������� \n");

		}

		printArray(c);
	}

	public static double[] concatenateArrays(double[] a, double[] b) { // ����������� ���� �������� �������� � ����

		double[] c = new double[a.length + b.length];

		for (int i = 0; i < c.length; i++) {

			if (i < a.length) {

				c[i] = a[i];
				continue;

			} else if (i == a.length) {

				for (int j = 0; j < b.length; j++, i++) {
					c[i] = b[j];
				}
			}
		}

		return c;
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

	public static void printArray(double[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.printf("%9.3f", a[i]);
		}

		System.out.println("\n");
	}

}