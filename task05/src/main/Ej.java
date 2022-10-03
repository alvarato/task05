package main;

import javax.swing.JOptionPane;

public class Ej {

	public void ej1() {
		JOptionPane.showMessageDialog(null, "Ejercicio 1");
		String n1 = JOptionPane.showInputDialog("Inserte el primer número");
		String n2 = JOptionPane.showInputDialog("Inserte el segundo número");
		JOptionPane.showMessageDialog(null, "El mayor es: " + Math.max(Integer.parseInt(n1), Integer.parseInt(n2)));
	}

	public void ej2() {
		JOptionPane.showMessageDialog(null, "Ejercicio 2");
		String name = "Alvaro";
		JOptionPane.showMessageDialog(null, "Bienvenido " + name);
	}

	public void ej3() {
		JOptionPane.showMessageDialog(null, "Ejercicio 3");
		String name = JOptionPane.showInputDialog("Ingrese su Nombre");
		JOptionPane.showMessageDialog(null, "Bienvenido " + name);
	}

	public void ej4() {
		JOptionPane.showMessageDialog(null, "Ejercicio 4");
		String radio = JOptionPane.showInputDialog("Ingrese el Radio");
		double area = Math.PI * Math.pow(Double.parseDouble(radio), 2);
		JOptionPane.showMessageDialog(null, "EL Area es: " + area);
	}

	public void ej5() {
		JOptionPane.showMessageDialog(null, "Ejercicio 5");
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte un número"));
		if (n1 % 2 == 0) {
			JOptionPane.showMessageDialog(null, n1 + "Si es divisible en 2");
		} else {
			JOptionPane.showMessageDialog(null, n1 + "No es divisible en 2");
		}
	}

	public void ej6() {
		JOptionPane.showMessageDialog(null, "Ejercicio 6");
		int IVA = 21;
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
		JOptionPane.showMessageDialog(null, "El precio final es: " + (n1+(n1*21)/100));
	}

	public void ej7() {
		JOptionPane.showMessageDialog(null, "Ejercicio 7");
		int i = 0;
		String sum = "";
		while (i < 100) {
			i++;
			sum = sum + "-" + i;
		}
		JOptionPane.showMessageDialog(null,"While: " + sum);
	}

	public void ej8() {
		JOptionPane.showMessageDialog(null, "Ejercicio 8");
		String sum = "";
		for (int i = 1; i < 101; i++) {
			sum = sum + "-" + i;;
		}
		JOptionPane.showMessageDialog(null,"For: " + sum);
	}

	public void ej9() {
		JOptionPane.showMessageDialog(null, "Ejercicio 9");
		String lista2 = "";
		String lista3 = "";
		for (int i = 1; i < 101; i++) {
			System.out.println(i);
			if (i % 2 == 0) {
				lista2 = lista2 + "-" + i;
			}
			if (i % 3 == 0) {
				lista3 = lista3 + "-" + i;
			}
		}
		JOptionPane.showMessageDialog(null, "Números Divisibles en 2");
		JOptionPane.showMessageDialog(null, lista2);
		JOptionPane.showMessageDialog(null, "Números Divisibles en 3");
		JOptionPane.showMessageDialog(null, lista3);
	}

	public void ej10() {
		JOptionPane.showMessageDialog(null, "Ejercicio 10");
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas"));
		double sum = 0;
		for (int i = 0; i < n1; i++) {
			double n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la venta " + (i + 1)));
			sum = sum + n2;
		}
		JOptionPane.showMessageDialog(null, "El total de las ventas es: " + sum);
	}

	public void ej11() {
		JOptionPane.showMessageDialog(null, "Ejercicio 11");
		String day = (JOptionPane.showInputDialog("Ingrese el día"));
		day = day.toLowerCase();
		String info;
		switch (day) {
		case "lunes":
			info = "Laboral";
			break;
		case "martes":
			info = "Laboral";
			break;
		case "miercoles":
			info = "Laboral";
			break;
		case "jueves":
			info = "Laboral";
			break;
		case "viernes":
			info = "Laboral";
			break;
		case "sabado":
			info = "Festivo";
			break;
		case "domingo":
			info = "Festivo";
			break;
		default:
			info = "inválido";
			break;

		}
		JOptionPane.showMessageDialog(null, "El día " + day + " es " + info);
	}

	public void ej12() {
		JOptionPane.showMessageDialog(null, "Ejercicio 12");
		String password = JOptionPane.showInputDialog("Ingrese su nueva Contraseña");
		int i = 0;
		while (i < 3) {
			String intento = JOptionPane.showInputDialog("Ingrese su Contraseña");
			if (intento.equals(password)) {
				JOptionPane.showMessageDialog(null, "Contraseña Correcta");
				i = 4;
			}
			if (i == 2) {
				JOptionPane.showMessageDialog(null, "Supero los 3 intentos");
			}
			i++;
		}
	}

	public void ej13() {
		JOptionPane.showMessageDialog(null, "Bienvenido a la Calculadora Inversa");
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero"));
		String operador = JOptionPane.showInputDialog("Ingrese un entero");
		switch (operador) {
		case "+":
			JOptionPane.showMessageDialog(null, n1 + operador + n2 + " = " + (n1 + n2));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, n1 + operador + n2 + " = " + (n1 - n2));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, n1 + operador + n2 + " = " + (n1 * n2));
			break;
		case "/":
			JOptionPane.showMessageDialog(null, n1 + operador + n2 + " = " + (n1 / n2));
			break;
		case "^":
			JOptionPane.showMessageDialog(null, n1 + operador + n2 + " = " + Math.pow(n1, n2));
			break;
		case "%":
			JOptionPane.showMessageDialog(null, n1 + operador + n2 + " = " + (n1 % n2));
			break;
		default:
			JOptionPane.showMessageDialog(null, "Error al ingresar los operadores");
			break;

		}
	}
}
