package Servicios;

import java.util.Scanner;
/*
 * Interfaz que contiene los metodos de la implementacio Menu
 * 051223 - awb
 */
public interface MenuInterfaz {

	/*
	 * Metodo que se encarga de mostrar el menu por pantalla y recoger la seleccion
	 * 051223 - awb
	 * @param sc
	 * @return numero entero (seleccion)
	 */
	public int mostrarMenuYSeleccion(Scanner sc);
}
