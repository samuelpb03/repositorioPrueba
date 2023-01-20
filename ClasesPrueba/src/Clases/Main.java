package Clases;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String marca;
		int puertas;
		int potencia;
		int peso;
		int trenMotriz;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la marca del coche");
		marca = teclado.nextLine();
		System.out.println("Introduce la potencia del coche");
		potencia = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce las puertas del coche");
		puertas = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce el peso del coche");
		peso = teclado.nextInt();
		System.out.println("Introduce el tren motriz del coche (1 Traccion delantera, 2 Traccion trasera, 3 Traccion total");
		trenMotriz = teclado.nextInt();
		teclado.close();
		
		Coche coche1 = new Coche(puertas, marca, potencia, peso, trenMotriz);
		
		Coche.darValoracion(coche1);
	}

}
