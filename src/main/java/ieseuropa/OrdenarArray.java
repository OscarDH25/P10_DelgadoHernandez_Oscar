package main.java.ieseuropa;
import java.util.*;
public class OrdenarArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);


int []num = new int [10];
int i;
for (i=0;i<10;i++) {
}
System.out.println("Introduce los elementos de tu array");
for (i=0;i<10;i++) {
num[i]= sc.nextInt();
}
Arrays.sort(num);
for (i=0;i<10;i++) {
	System.out.print(num[i]+" ");
			}
		}
	}
