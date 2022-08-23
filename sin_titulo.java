/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CONDICIONAL1.java."

import java.io.*;

public class condicional1 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String a;
		String b;
		System.out.println("digite primer valor");
		a = bufEntrada.readLine();
		System.out.println("digite segundo valor");
		b = bufEntrada.readLine();
		if (a>b) {
			System.out.println("A es mayor que B");
		} else {
			System.out.println("B es mayor que A");
		}
	}


}

