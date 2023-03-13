package puntoUno;

public class PuntoD {

	public static void main(String[] args) {
		/*
		 * d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
		 */
		
		int numeroInicio = 5;
		int numeroFin = 14;
		
		for(int i = numeroFin; i >= numeroInicio;i--) {
			if(i % 2 == 0) {
				if(numeroInicio != numeroFin) {
					System.out.print(i+", ");
				} else {
					System.out.print(i);
				}
			}
		}

	}
}
