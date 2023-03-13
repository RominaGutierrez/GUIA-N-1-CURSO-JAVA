package puntoDos;

import java.util.Scanner;

/*“Son hogares que declaran reunir alguna de las siguientes condiciones, considerando a
todas y todos los convivientes:
● Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
(3,5 canastas básicas para un hogar tipo 2 según el INDEC).
● Tener 3 o más vehículos con una antigüedad menor a 5 años.
● Tener 3 o más inmuebles.
● Poseer una embarcación, una aeronave de lujo o ser titular de activos
societarios que demuestren capacidad económica plena.”
 */
public class IngresosAltos {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		double ingresosMensualesTotales = 0.0;
		int cantidadVehiculos = 0, cantidadInmuebles = 0;
		String respuestas = " ";
		
		
		System.out.print("Ingrese los ingresos mensuales totales del hogar: ");
		ingresosMensualesTotales = leer.nextDouble();
		System.out.print("Ingrese el número de vehículos con una antiguedad menor a 5 años: ");
		cantidadVehiculos = leer.nextInt();
		System.out.print("Ingrese el número de inmuebles: ");
		cantidadInmuebles = leer.nextInt();
		System.out.print("¿Posee una embarcación, una aeronave de lujo o es titular de activos societarios que demuestren capacidad económica plena? (s/n): ");
		respuestas = leer.next();
		
		leer.close();
		//System.out.println("\n");
		
		if(ingresosMensualesTotales >= 489083) {
			System.out.println("La persona pertenece al segmento de ingresos altos");
		} else if (cantidadVehiculos >= 3) {
			System.out.println("La persona pertenece al segmento de ingresos altos");
		} else if (cantidadInmuebles >= 3) {
			System.out.println("La persona pertenece al segmento de ingresos altos");
		} else if (respuestas == "s") {
			System.out.println("La persona pertenece al segmento de ingresos altos");
		} else {
			System.out.println("La persona no pertenece al segmento de ingresos altos");
		}
		
		
	}

}
