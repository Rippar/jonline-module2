package by.jonline.module2.onedim_array;

import java.util.Scanner;

/*В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К*/

public class Number_1 {
	public static void main(String[] args) {
	
		int n = enterFromConsole();
		
		if (n > 0 && n <= 100) { // макс. размер задан для удобства представления
			
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
				
			    System.out.println("Сумма элементов, кратных  "+k+": "+sum);
			    
			} else {
				System.out.println("Делить на 0 нельзя!");
			}

		    
		} else if (n > 100) {
			
			System.out.println("Введенный размер массива слишком велик!");

		} else {
			System.out.println("Размер массива для данной задачи должен быть больше 1!");

		}
	}
	
	public static void fillArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = 1 + (int) (Math.random() * 100);
		}
	}
	
	public static void printArray(int[] a) {
		
		System.out.println("Исходный массив:");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "; ");
		}
		System.out.println("\n");
	}
	
	public static int enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите размер массива, затем число К: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое число!: ");

		}
		return sc.nextInt();
	}
}
