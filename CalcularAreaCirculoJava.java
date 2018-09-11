package com.java.exercise.ejerciciosbasicos1;

import javax.swing.*;

public class CalcularAreaCirculoJava {

	public static void main(String[] args) {
		/*
		 * 5) Haz una aplicacion que calcule el area de un circulo(pi*R2). El radio se
		 * pedira por teclado (recuerda pasar de String a double con
		 * Double.parseDouble). Usa la constante PI y el metodo pow de Math.
		 */

		// pedimos el radio del circulo a calcular
		String radio = JOptionPane.showInputDialog("Vamos a calcular el area de un circulo."
				+ " Los decimales se seperan con un punto. " + "Introduce el radio (en centimetros): ");

		// vamos a capturar los posibles errores con try catch (en caso de no introducir
		// numeros)
		try {

			if (radio == null || radio.isEmpty()) {
				System.out.println("No has introducido ningun radio.\nFin");

			} else {
				// parseamos el string introducido por JOptionPane a double
				double radioCm = Double.parseDouble(radio);
				// utilizamos la clase Math que trae Java para obtener el valor de PI, y
				// utilizamos el metodo pow para multiplicar los parametros pasados a pow, en
				// este caso el radio y 2
				double area = Math.PI * Math.pow(radioCm, 2);
				System.out.println("El area del circulo es: " + area + "cms.\nFin");
			}

		} catch (Exception ex) {
			System.out.println("Parece que no has introducido un valor correcto: " + ex);
		}
	}
}
