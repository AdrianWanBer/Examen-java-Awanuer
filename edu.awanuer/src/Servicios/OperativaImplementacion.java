package Servicios;

import java.util.Scanner;

public class OperativaImplementacion implements OperativaInterfaz {

	public long añadirVenta(Scanner sc, long total) {
		
		System.out.println("Cuanto ha ganado con la venta: ");
		long dineroGanado = sc.nextLong();
		long totalNuevo = total + dineroGanado;
		
		return totalNuevo;
	}
	
	public long añadirGasto(Scanner sc, long total) {
		System.out.println("Cuanto ha gastado: ");
		long dineroGastado = sc.nextLong();
		long totalNuevo = total - dineroGastado;
		
		return totalNuevo;
	}

	public void totalComprobacion(long total) {
		
		if (total == 0) {
			System.out.println("El total de hoy es: " + total + " Vamos mal");
		} 
		if (total < 0) {
			System.out.println("El total de hoy es: " + total + " Vamos MUY mal");
		}
		if (total > 0) {
			System.out.println("El total de hoy es: " + total);
		}
	}
}
