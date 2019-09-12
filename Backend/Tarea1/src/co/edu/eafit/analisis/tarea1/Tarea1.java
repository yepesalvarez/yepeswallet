package co.edu.eafit.analisis.tarea1;

import java.util.Scanner;

public class Tarea1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Ingrese la opci�n seguido de la tecla enter: \n"
				+ "1 : para encontrar epsilon de su m�quina \n"
				+ "2 : para encontrar el n�mero m�s grande positivo de su m�quina");
		char programa = sc.next().charAt(0);
		sc.close();
		switch(programa) {
		case '1':
			epsilon();
			break;
		case '2':
			masGrande();
			break;
		}

	}
	
	/*Se iterar hasta encontrar el valor mas pequeno
	 * que no sea igual a cero por tanto al sumarse a 1
	 * no se perdera informacion
	 */
	private static void epsilon() {
		double divisor = 0.5;
		while(1 != 1 + divisor) {
			divisor = divisor / 2;
		}
		System.out.println(divisor);
	}
	
	private static void masGrande() {
		/* Se va a hallar una aproximaci�n de n�mero m�s grande tipo Double */
		double result = Double.POSITIVE_INFINITY;
		double cont = 1.7E308;
		/*Se establece un contador con el m�ximo primer decimal que permite el compilador
		 *  para una variable double*/
		while(result == Double.POSITIVE_INFINITY) {
			result = Double.POSITIVE_INFINITY - cont;
			System.out.println(cont);
			/*Fuimos rebanjando manualmente el exponente del contador,
			 *  cada vez se alcanza mas precisi�n pero cuesta m�s iteraciones
			 *   hallarlo. con E300 se toma 1.5 minutos hallar la aproximaci�n:
			 *   1.7976931299995626E308 */
			cont = cont + 1.0E300; 
		}
		
	}
}
