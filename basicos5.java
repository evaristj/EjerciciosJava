package com.java.exercise.ejerciciosbasicos1;

import javax.swing.*;

public class basicos5 {

	public static void main(String[] args) {
		/*
		 * 5) Haz una aplicacion que calcule el area de un circulo(pi*R2). El radio se
		 * pedira por teclado (recuerda pasar de String a double con
		 * Double.parseDouble). Usa la constante PI y el metodo pow de Math.
		 */

		String radio = JOptionPane.showInputDialog("Vamos a calcular el area de un circulo."
				+ " Los decimales se seperan con un punto. " + "Introduce el radio (en centimetros): ");

		try {
			if (radio == null || radio.isEmpty()) {
				System.out.println("No has introducido ningun radio.\nFin");
			} else {
				double radioCm = Double.parseDouble(radio);
				double area = Math.PI * Math.pow(radioCm, 2);
				System.out.println("El area del circulo es: " + area + "\nFin");

			}
		} catch (Exception ex) {
			System.out.println("Parece que no has introducido un valor correcto: " + ex);
		}
	}
}
