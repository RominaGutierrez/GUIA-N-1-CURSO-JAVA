package puntoUno;

import java.util.Scanner;

public class PuntoC {

	public static void main(String[] args) {
		/*
		 * c. A lo anterior, con una variable extra, elija si se deben mostrar los
		 * n�meros pares o impares
		 */
		Scanner leer = new Scanner(System.in);
		int numeroInicio = 5, numeroFin = 14, opcion = 0;
		
		System.out.println("Ingrese la opci�n deseada: ");
		System.out.println("1- Mostrar los n�meros pares");
		System.out.println("2- Mostrar los n�meros impares");
		opcion = leer.nextInt();
		
		leer.close();
		
		//utilizando el switch
		/*switch(opcion){
		case 1: 
				System.out.print("Los n�meros pares entre "+numeroInicio+" y "+numeroFin+" son: ");
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
				break; 
		case 2:
				System.out.print("Los n�meros impares entre "+numeroInicio+" y "+numeroFin+" son: ");
			while(numeroInicio <= numeroFin) {
				if(numeroInicio % 2 != 0) { // si son numeros impares entra 
					if(numeroInicio != numeroFin) {
						System.out.print(numeroInicio+", ");
					} else {
						System.out.print(numeroInicio);
					}
				}		
				numeroInicio++;
			}
			break; 
			default:
				System.out.println("��Opci�n ingresada incorrecta!!");
						
		}*/
		
		//utilizando el if-else
		if (opcion == 1) { // Entra los numeros pares
			System.out.print("Los n�meros pares entre "+numeroInicio+" y "+numeroFin+" son: ");
			while (numeroInicio <= numeroFin) {
				if (numeroInicio % 2 == 0) {
					if (numeroInicio != numeroFin) {
						System.out.print(numeroInicio + ", ");
					} else {
						System.out.print(numeroInicio);
					}
				}
				numeroInicio++;
			}
		} else if (opcion == 2) { // Entran los numeros impares
			System.out.print("Los n�meros impares entre "+numeroInicio+" y "+numeroFin+" son: ");
			while (numeroInicio <= numeroFin) {
				if (numeroInicio % 2 != 0) {
					if (numeroInicio != numeroFin) {
						System.out.print(numeroInicio + ", ");
					} else {
						System.out.print(numeroInicio);
					}
				}
				numeroInicio++;
			}
		}
	
	}

}
