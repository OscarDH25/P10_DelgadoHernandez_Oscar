package main.java.ieseuropa;

public class Strings {

	private static String borrarApariencias(String cadena, String borrar) {
		return cadena.replace(borrar, "");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(borrarApariencias("Real Zaragoza", "Real"));
	}

}
