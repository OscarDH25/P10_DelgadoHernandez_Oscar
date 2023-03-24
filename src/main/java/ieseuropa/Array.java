package main.java.ieseuropa;
import java.util.Arrays;
import java.util.ArrayList;


public class Array {
	private static int mediaArrays(int[] array) {
	    int suma = 0;
	    for (int i = 0; i < array.length; i++) {
	        suma += array[i];
	    }
	    return (int) suma / array.length;
	}

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

	private static int calcularMediana(int[] array) {
		Arrays.sort(array);
		int numeroCentral = array.length/2;
		if(array.length % 2 != 0) {
			return array[numeroCentral];
		}else {
			return (array[numeroCentral-1]+array[numeroCentral])/2;
		}
	}
	
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(calcularMinimo(array));
		System.out.println(calcularMaximo(array));
		System.out.println(calcularMediana(array));
	}

}
