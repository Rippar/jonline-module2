package by.jonline.module2.decomposition;

import java.util.Scanner;

/*�������� ����� (������), ������������, � ����� �� ������ ���� ����� ������ ����.*/

public class Number_11 {
	public static void main(String[] args) {
		
		int n = enterFromConsole();
		int k = enterFromConsole();
		
		longestNumber(n,k);

	}
	
	public static void longestNumber(int a, int b) {
		
		int countA=1;
		int countB=1;
		
		while (a/10!=0) {
			
			countA++;
			a/=10;
		}
		
		while (b/10!=0) {
			
			countB++;
			b/=10;
		}
		
		if (countA>countB) {
			System.out.println("� ������ ����� ���� ������, ��� �� ������");
			
		} else if (countA<countB) {
			System.out.println("�� ������ ����� ���� ������, ��� � ������");
			
		} else {
			System.out.println("� ������ ������ ���������� ���������� ����");
			
		}
		
	}
	
	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		System.out.println("������� ����� �����: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� �����!");
		}

		return sc.nextInt();

	}

}
