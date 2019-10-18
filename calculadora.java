

import java.util.Scanner;

public class calculadora{
	public static void main(String[] args){

		double a,b;
		int c;



		Scanner teclado=new Scanner(System.in);

		System.out.println("Introduce 2 números");

		a=teclado.nextDouble();
		b=teclado.nextDouble();


		System.out.println("¿Que operacion quieres realizar entre los dos números?");
		System.out.println("1-Suma  2-Resta  3-Multiplicación  4-Division");

		c=teclado.nextInt();




		if(c==1){

			System.out.println(a+b);
		}
		if (c==2) {
			System.out.println(a-b);
			
		}
		if (c==3) {
			System.out.println(a*b);
			
		}
		if(c==4) {
			System.out.println(a/b);
		}













	}
}