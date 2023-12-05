package Controladores;

import java.util.Scanner;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;
/*
 * clase inicio, la clase principal de la aplicacion
 * 051223 - awb
 */
public class Inicio {
	/*
	 * Metodo main que se encarga del flujo de la aplicacion
  	 * 051223 - awb
	 */
	public static void main(String[] args) {
		
		//Declaracion de Scanner y llamada a los metodos
		Scanner sc = new Scanner (System.in);
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		
		//Declaracion de variables
		long total = 0;
		boolean cerrarMenu = false;
		
		//Apertura del while encargado de abrir y cerrar aplicacion
		while(!cerrarMenu) {
			int seleccion = mi.mostrarMenuYSeleccion(sc);
			switch(seleccion) {
			
			case 1: //Cerrar menu
				System.out.println("Se acabo el dia");
				cerrarMenu = true;
				break;
			case 2: //Añadir venta
				total = oi.añadirVenta(sc, total);
				break;
			case 3: //Añadir gasto
				total = oi.añadirGasto(sc, total);
				if (total == 0) {
					System.out.println("Acabamos de llegar a 0");
				}
				if (total < 0 ) {
					System.out.println("Debes este dinero: " + total);
				}
				
				break;
			case 4: //Mostrar total
				
				if (total == 0) {
					System.out.println("El total de hoy es: " + total + " Vamos mal");
				} 
				if (total < 0) {
					System.out.println("El total de hoy es: " + total + " Vamos MUY mal");
				}
				if (total > 0) {
					System.out.println("El total de hoy es: " + total);
				}
				break;
				
			}
		}

	}

}
