package com.java.exercise.ejerciciosbasicos1;

import javax.swing.JOptionPane;

public class basicos8 {

	public static void main(String[] args) {

		/*
		 * 8) Modifica el ejercicio anterior, para que en lugar de pedir un n�mero, pida
		 * un car�cter (char) y muestre su c�digo en la tabla ASCII.
		 */

		String numero = JOptionPane.showInputDialog("introduce un caracter: ");

		do {

			numero = JOptionPane.showInputDialog("Caracter invalido, introduce otro: ");

		} while (numero.length() <= 0 | numero.length() > 1 | numero == null);

		char caracter = numero.charAt(0);

		int codigo = (int) caracter;

		System.out.println("El car�cter introducido pertence al n�mero en la tabla ASCII: " + codigo);
		System.out.println("Fin");

	}

}
