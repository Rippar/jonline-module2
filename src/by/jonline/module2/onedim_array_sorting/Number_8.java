package by.jonline.module2.onedim_array_sorting;

/*���� ����� p1/q1, p2/q2,... pn/qn (pi, qi - �����������). ��������� ���������, ������� ��������
��� ����� � ������ ����������� � ������������� �� � ������� �����������.*/

public class Number_8 {
	public static void main(String[] args) {

		int[] p = { 5, 2, 4, 3, 7, 1 }; // ������ ����������
		int[] q = { 6, 3, 9, 8, 8, 3 }; // ������ ������������

		printArray(p);
		printArray(q);

		int comDen = lcm(q);

		System.out.println("����� �����������: " + comDen);

		for (int i = 0; i < p.length; i++) { // ���������� ������ � ������ �����������
			p[i] = p[i] * comDen / q[i];
			q[i] = q[i] * comDen / q[i];
		}

		System.out.println("\n���������� ������ � ������ �����������: ");
		printArray(p);
		printArray(q);

		sortingFractions(p, q); // ���������� ������ � ������� �����������

		System.out.println("\n���������� � ������� ����������� ������: ");
		printArray(p);
		printArray(q);

	}

	public static void sortingFractions(int[] a, int[] b) {

		for (int i = 0; i < a.length; i++) {

			int valueA = a[i];
			int valueB = b[i];

			int j = i - 1;

			for (; j >= 0; j--) {

				if (valueA < a[j]) {
					a[j + 1] = a[j];
					b[j + 1] = b[j];

				} else {
					break;
				}
			}

			a[j + 1] = valueA;
			b[j + 1] = valueB;
		}
	}

	public static int gcd(int a, int b) { // ����� ���

		if (b == 0) {
			return a;

		} else {
			return gcd(b, a % b);
		}
	}

	public static int lcm(int a, int b) { // ����� ���
		return a * (b / gcd(a, b));
	}

	public static int lcm(int[] a) {
		int result = a[0];

		for (int i = 1; i < a.length; i++) {
			result = lcm(result, a[i]);
		}

		return result;
	}

	public static void printArray(int[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);
		}

		System.out.println();
	}

}
