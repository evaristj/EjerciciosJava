package com.java.exercise.ejerciciosbasicos1;

import javax.swing.*;

public class MostrarNombre {

	public static void main(String[] args) {
		/*
		 * 4) Modifica la aplicacion anterior, para que nos pida el nombre que queremos
		 * introducir.
		 */

		// creamos un JOptionPane para introducir el String que queramos que se muestre
		// por consola
		String name = JOptionPane.showInputDialog("Para seguir, introduce tu nombre");

		// añadimos una condicion if para darle mas realismo, en este caso si
		// introducimos menos de 2 caracteres, no nos mostrara el nombre
		if (name.length() >= 2) {
			System.out.println("Bienvenido " + name + "!!!");
		} else if (name.length() < 2) {
			// con un do while, no parara la aplicacion hasta introducir los caracteres
			// correctos
			do {
				name = JOptionPane.showInputDialog(name + " No es un nombre valido, introduce otro con más caracteres.");
			} while (name.length() <= 2);
			{
				System.out.println("Bienvenido " + name + "!!!");
			}
		}
	}
}
