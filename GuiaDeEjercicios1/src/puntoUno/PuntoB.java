package puntoUno;

public class PuntoB {

	public static void main(String[] args) {
		/*
		 * b. A lo anterior, solo muestre los números pares
		 */
		
		int numeroInicio = 5;
		int numeroFin = 14;
		
		while(numeroInicio <= numeroFin) {
			if(numeroInicio % 2 == 0) { // si son numeros pares entra 
				if(numeroInicio != numeroFin) {
					System.out.print(numeroInicio+", ");
				} else {
					System.out.print(numeroInicio);
				}
			}		
			numeroInicio++;
		}

	}

}
