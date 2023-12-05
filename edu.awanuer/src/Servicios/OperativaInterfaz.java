package Servicios;

import java.util.Scanner;

/*
 * Interfaz que contendra lops metodos de la implenetacion (OperativaImplementacion)
 * 051223 - awb
 */
public interface OperativaInterfaz {

	/*
	 * Metodo encargado de hacer la operativa de añadir venta
	 * 051223 - awb
	 * @param sc, long total
	 * @return long totalNuevo
	 */
	public long añadirVenta(Scanner sc, long total);
	
	/*
	 * Metodo encargado de hacer la operativa de añadir gasto
	 * 051223 - awb
	 * @param sc, long total
	 * @return long totalNuevo
	 */
	public long añadirGasto(Scanner sc, long total);

	/*
	 * metodo que se encarga de comprobar el valor de total y dar una respuesta al usuario
	 * por consola
	 * 051223 - awb
	 * @param total
	 */
	public void totalComprobacion(long total);
}
