package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*� ������ A[N] �������� ����������� �����. ����� ����� ��� ���������, ������� ������ ������� �*/

public class Number_1 {
	public static void main(String[] args) {
	
		int n = enterFromConsole();
		
		if (n > 0 && n <= 100) { // ����. ������ ����� ��� �������� �������������
			
			int[] a = new int[n];
		
			int k = enterFromConsole();
			
			if (k>0 || k<0) {
				
				int sum = 0;
				
				fillArray(a);
				
				printArray(a);

				for (int i = 0; i < a.length; i++) {
					if (a[i] % k == 0) {
						sum += a[i];
					}
				}
				
			    System.out.println("����� ���������, ������� "+k+": "+sum);
			    
			} else {
				System.out.println("������ �� 0 ������!");
			}

		    
		} else if (n > 100) {
			
			System.out.println("��������� ������ ������� ������� �����!");

		} else {
			System.out.println("������ ������� ��� ������ ������ ������ ���� ������ 1!");

		}
	}
	
	public static void fillArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = 1 + (int) (Math.random() * 100);
		}
	}
	
	public static void printArray(int[] a) {
		
		System.out.println("�������� ������:");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "; ");
		}
		System.out.println("\n");
	}
	
	public static int enterFromConsole() {
		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ������ �������, ����� ����� �: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("����� ������ ����� �����!: ");

		}
		return sc.nextInt();
	}
}
