package metodos;

import java.util.Scanner;

public class EjemplosMetodos {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		//MétodoA no quiere datos de entrada y no devuelve valor
		metodoA();
		//MétodoB quiere datos de entrada y no devuelve valor
		metodoB(3.2,5.0,8);
		double a = 9.3, b = 7.5;
		int c = 5;
		metodoB(a,b,c);
		System.out.print("a = ");
		a = lector.nextDouble();
		System.out.print("b = ");
		b = lector.nextDouble();
		System.out.print("c = ");
		c = lector.nextInt();
		metodoB(a,b,c);
		//MetodoC no quiere datos de entrada y devuelve un valor double
		double result = metodoC();
		System.out.println("El resultado es = " + result);
		System.out.println("El resultado es = " + metodoC());
		//MetodoD requiere datos de entrada y devuelve un valor double
		System.out.println("El resultad ahora es = " + metodoD(1.0,2.0,5.0,9));
	}
	//Definición de métodos
	private static void metodoA() {
		int valorA = 7, valorB = 8;
		System.out.println("La suma de " + valorA + " y " + valorB + " es " + (valorA+valorB));
		
	}
	private static void metodoB(double varA, double varB, int varC) {
		double resultado = (varA + varB)/(1 + varC);
		System.out.println("El resultado es = " + resultado);
	}
	private static double metodoC() {
		double varDouble1 = 1.0, varDouble2 = 2.0, varInt1 = 5.0;
		int varInt2 = 9;
		double resultado = 1 + (varDouble1*varDouble2)-varInt1/varInt2;
		return resultado;
	}
	private static double metodoD(double varDouble1, double varDouble2, double varInt1, int varInt2) {
		double resultado = 1 + (varDouble1*varDouble2)-varInt1/varInt2;
		return resultado;
	}
}
