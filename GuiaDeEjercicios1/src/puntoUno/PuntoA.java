package puntoUno;

public class PuntoA {

	public static void main(String[] args) {
		/*
		 * a. Utilizando la sentencia while, imprima todos los números entre 2 variables
		 * “a” y “b”. Su código puede arrancar (por ejemplo): int numeroInicio = 5; int
		 * numeroFin = 14; Se deberían mostrar los números: 5,6,7,8,9,10,11,12,13,14
		 */

		// utilizando datos del ejemplo:
		int numeroInicio = 5;
		int numeroFin = 14;

		while (numeroInicio <= numeroFin) {
			if (numeroInicio != numeroFin) {
				System.out.print(numeroInicio + ", ");
			} else {
				System.out.print(numeroInicio);
			}
			numeroInicio++;
		}

	}

}
