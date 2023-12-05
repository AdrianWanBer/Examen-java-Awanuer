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
}
