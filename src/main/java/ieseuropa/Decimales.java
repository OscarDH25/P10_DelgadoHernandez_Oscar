package main.java.ieseuropa;

public class Decimales {

	private static int eliminarDecimales(float num) {
		return (int) num;
	}
	public static void main(String[] args) {
		
		System.out.println(eliminarDecimales(15.03f));
	}

}
