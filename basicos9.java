package com.java.exercise.ejerciciosbasicos1;

import java.util.Scanner;

public class basicos9 {

	public static void main(String[] args) {
		
		/*
		 * 9) Lee un número por teclado que pida el precio de un producto (puede tener decimales)
		 * y calcule el precio final con IVA. El IVA sera una constante que sera del 21%. 
		 */
		
		final double IVA = 1.21;
		
		System.out.println("Introduce el precio sin iva: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String precio = sc.nextLine();
		double precioFinal = Integer.parseInt(precio);
		double total = precioFinal * IVA;
		
		System.out.println("El precio final con IVA incluido es: " + total);
		
	}

}
