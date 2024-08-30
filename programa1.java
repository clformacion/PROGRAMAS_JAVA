package PROGRAMAS1;
import java.util.Scanner;


public class programa1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num1,num2,suma, producto;
		System.out.print("ingrese primer valor: ");
		num1=teclado.nextInt();
		System.out.print("ingrese segundo valor: ");
		num2=teclado.nextInt();
		suma=num1+num2;
		producto=num1*num2;
		System.out.println("la suma de los dos valore es " + suma);
		System.out.println("el producto de los valores es " + producto);
		

	}
	

}
