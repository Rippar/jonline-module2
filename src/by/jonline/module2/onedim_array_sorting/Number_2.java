package by.jonline.module2.onedim_array_sorting;

/*���� ��� ������������������ a1<=a2<=..<=an � b1<=b2<=...<=bm. ���������� �� ��� ����� ������������������ ����� ���, 
 * ����� ��� ���� ���� �����������. ����������: �������������� ������ �� ������������.*/

public class Number_2 {
	public static void main(String[] args) {

		double[] a = { 2.4, 3.6, 4.0, 4.4, 4.8, 5.6 };
		double[] b = { -1.4, 4.1, 4.4, 5.4, 10.2 };	
		double[] c = new double[a.length + b.length];
		
		printArray(a);
		printArray(b);

		for (int i = 0; i < c.length; i++) { //���������� �������
			if (i < a.length) {
				c[i] = a[i];
			} else {
				for (int j = 0; j < b.length; j++, i++) {
					c[i] = b[j];
				}
			}
		}

		boolean isSorted = false;

		while (!isSorted) { // ���������� ���������� ���������
			isSorted = true;

			for (int i = 0; i < c.length - 1; i++) {
				double tmp;

				if (c[i] > c[i + 1]) {

					isSorted = false;
					tmp = c[i];
					c[i] = c[i + 1];
					c[i + 1] = tmp;
				}
			}
		}

		printArray(c);
	}

	public static void printArray(double[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.printf("%9.3f", a[i]);
		}

		System.out.println("\n");
	}

}