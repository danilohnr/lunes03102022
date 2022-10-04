package metodos;

import java.util.Scanner;

public class SobrecargaDeMetodos {
	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		double l, h;
		System.out.println("Calcule el area lateral de un prisma");
		System.out.println("Que datos conoce? ");
		System.out.println("0- Ninguno");
		System.out.println("1- Cantidad de lados");
		System.out.println("2- Cantidad de lados y longitud de los lados");
		System.out.println("3- Cantidad de lados, longitud de los lados y la altura");
		System.out.println("4. Salir");
		int op = lector.nextInt();
		
		switch (op) {
		case 0: {			
			System.out.println("El área lateral del prisma es " + calcularAreaLateralPrisma());
			break;
		}
		case 1: {
			System.out.print("Ingrese n = ");
			n = lector.nextInt();
			System.out.println("El área lateral del prisma es " + calcularAreaLateralPrisma(n));
			break;
		}
		case 2: {
			System.out.print("Ingrese n = ");
			n = lector.nextInt();
			System.out.print("Ingrese l = ");
			l = lector.nextDouble();
			System.out.println("El área lateral del prisma es " + calcularAreaLateralPrisma(n,l));
			break;
		}
		case 3: {
			System.out.print("Ingrese n = ");
			n = lector.nextInt();
			System.out.print("Ingrese l = ");
			l = lector.nextDouble();
			System.out.print("Ingrese h = ");
			h = lector.nextDouble();
			System.out.println("El área lateral del prisma es " + calcularAreaLateralPrisma(n,l,h));
			break;
		}
		case 4: {
			System.out.println("Gracias por utilizar esta super aplicacion");
			break;
		}
		default:
			System.out.println("Opcion incorrecta.");
		}		
		
	}
	
	//Es un método que devuelve un valor double pero no requiere datos de entrada
	private static double calcularAreaLateralPrisma() {
		double l, h, areaLateral;
		int n;
		System.out.print("Ingrese n = ");
		n = lector.nextInt();
		System.out.print("Ingrese l = ");
		l = lector.nextDouble();
		System.out.print("Ingrese h = ");
		h = lector.nextDouble();
		
		areaLateral = n * l * h;
		
		return areaLateral;
	}
	private static double calcularAreaLateralPrisma(int n) {
		double l, h, areaLateral;		
		System.out.print("Ingrese l = ");
		l = lector.nextDouble();
		System.out.print("Ingrese h = ");
		h = lector.nextDouble();
		
		areaLateral = n * l * h;
		
		return areaLateral;
	}
	private static double calcularAreaLateralPrisma(int n, double l) {
		double h, areaLateral;		
		System.out.print("Ingrese h = ");
		h = lector.nextDouble();
		
		areaLateral = n * l * h;
		
		return areaLateral;
	}
	private static double calcularAreaLateralPrisma(int n, double l, double h) {
		double areaLateral;		
		
		areaLateral = n * l * h;
		
		return areaLateral;
	}

}
