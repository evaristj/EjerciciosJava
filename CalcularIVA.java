package com.java.exercise.ejerciciosbasicos1;

import java.util.Scanner;

public class CalcularIVA {

	public static void main(String[] args) {

		/*
		 * 9) Lee un número por teclado que pida el precio de un producto (puede tener
		 * decimales) y calcule el precio final con IVA. El IVA sera una constante que
		 * sera del 21%.
		 */

		// declaramos la constante del valor del IVA
		final double IVA = 1.21;
		
		// declaramos la variable total fuera del try catch, para no tener error de
		// compilacion, ya que java necesita tener el valor de total, para mostrarlo
		// despues del try catch, en caso de que por algo no funcione el try catch, 
		// el codigo finalizaría mostrando como resultado final 0.0
		double total = 0;
		System.out.println("Introduce el precio sin iva: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		try {
			double precio = sc.nextDouble();
			total = precio * IVA;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println("El precio final con IVA incluido es: " + total);

	}

}
