package main.java.ieseuropa;

import java.util.ArrayList;

public class Array {
	private static int mediaArrays(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += i;
		}
		return (int)suma/array.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
	}

}
