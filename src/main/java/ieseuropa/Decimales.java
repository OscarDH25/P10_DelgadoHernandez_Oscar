package main.java.ieseuropa;

public class Decimales {
	
	private static float[] ecuacion2Grado(float a, float b , float c) {
		float raiz = (float) Math.sqrt(Math.pow(b, 2) -4 *a *c);
		
		return new float[] {(-b+raiz)/(2*a) ,(-b-raiz)/(2*a)};
	}
	
	public static void main(String[] args) {
		
		float ecuacion[] = ecuacion2Grado(2f, -7f, 3f);
		System.out.println("Solucion x1:"+ecuacion[0]+ " Solucion x2:"+ecuacion[1]);
	}

}
