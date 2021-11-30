package by.jonline.module2.decomposition;

/*�������� ����� (������) ��� ���������� ����� ����������� ���� �������� ����� �� 1 �� 9*/

public class Number_7 {
	public static void main(String[] args) {
		System.out.println(sumOfFactorials(9));
	}

	public static int sumOfFactorials(int n) {

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			int multiply = 1;

			if (i % 2 != 0) {

				for (int j = 1; j <= i; j++) {
					multiply *= j;
				}

				sum += multiply;
			}

		}

		return sum;
	}

}
