package main.java.ieseuropa;
import java.util.*;
public class SeriePell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

int n, a=1, b=0, c; 
System.out.println("primeros 15 numeros de la Serie Pell");
for (n=1; n<=15; n++) {
	c=a + 2*b;
	System.out.print(c+" ");
	a=b;
	b=c;
}
	}

}
