package by.jonline.module2.decomposition;

import java.util.Scanner;

/*Написать метод (методы), определяющий, в каком из данных двух чисел больше цифр.*/

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
			System.out.println("В первом числе цифр больше, чем во втором");
			
		} else if (countA<countB) {
			System.out.println("Во втором числе цифр больше, чем в первом");
			
		} else {
			System.out.println("В данных числах одинаковое количество цифр");
			
		}
		
	}
	
	public static int enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое число: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое число!");
		}

		return sc.nextInt();

	}

}
