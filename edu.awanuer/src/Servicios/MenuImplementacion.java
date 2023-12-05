package Servicios;

import java.util.Scanner;
/*
 * clase implementacion que tiene los metodos encargados o relacionados con el menu
 * 051223 - awb
 */
public class MenuImplementacion implements MenuInterfaz {

	public int mostrarMenuYSeleccion(Scanner sc) {
		
		System.out.println("| Que quieres hacer  |");
		System.out.println("| 1.Cerrar aplicación|");
		System.out.println("| 2.Añadir venta     |");
		System.out.println("| 3.Añadir gasto     |");
		System.out.println("| 4.Mostrar total    |");
		int seleccion = sc.nextInt();
		return seleccion;
		
	}
}
