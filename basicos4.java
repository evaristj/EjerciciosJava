package com.java.exercise.ejerciciosbasicos1;

import javax.swing.*;

public class basicos4 {

	public static void main(String[] args) {
		/*
		 * 4) Modifica la aplicacion anterior, para que nos pida el nombre que queremos
		 * introducir.
		 */
		String name = JOptionPane.showInputDialog("Para seguir, introduce tu nombre");
		if (name.length() >= 2) {
			System.out.println("Bienvenido " + name + "!!!");
		} else if (name.length() < 2) {
			do {
				name = JOptionPane.showInputDialog(name + " No es un nombre valido, introduce otro.");
			} while (name.length() <= 2);
			{
				System.out.println("Bienvenido " + name + "!!!");
			}
		}
	}
}
