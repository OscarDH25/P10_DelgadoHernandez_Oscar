package main.java.ieseuropa;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	private static int calcularMinimo(int[] array) {
		int min = array[1];
		for (int numero : array) {
			if (numero < min)
				min = numero;
		}
		return min;
	}

	private static int calcularMaximo(int[] array) {
		int max = 0;
		for (int numero : array) {
			if (numero > max)
				max = numero;
		}
		return max;
	}
	private static void OrdenarArray() {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		int i;
		for (i = 0; i < 10; i++) {
		}
		System.out.println("Introduce los elementos de tu array");
		for (i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		for (i = 0; i < 10; i++) {
			System.out.print(num[i] + " ");
		}
	}


	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(calcularMinimo(array));
		System.out.println(calcularMaximo(array));
		OrdenarArray();

	}

}
