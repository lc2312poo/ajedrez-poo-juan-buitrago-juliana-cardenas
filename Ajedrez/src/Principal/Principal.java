package Principal;
import java.util.Scanner;

import modelo.Peon;

public class Principal {
Scanner scanner = new Scanner(System.in);
	System.out.println("Digite el tipo de ficha: ");
	System.out.println("1. Peon\n"
			+ "2.Caballo\n"
			+ "3.Torre\n"
			+ "4.Rey\n"
			+ "5.Reina\n"
			+ "6.Alfil\n");
	int tipoFicha = scanner.nextInt();
	System.out.println("Ingerese la Fila y Columna : ");
	int Fila = scanner.nextInt();
	int Columna = scanner.nextInt();
	
	
}