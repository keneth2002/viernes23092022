package arreglos;

import java.util.Scanner;

public class Arreglosunidimensionales {

	public static void main(String[] args) {
		//Sumar arreglos unidimensionales
		
		Scanner lector = new Scanner(System.in);
		System.out.print("Ingrese el tamaño de los arreglos : ");
		int tam = lector.nextInt();
		double[] arr1 = new double[tam];
		double[] arr2 = new double[tam];
		double[] suma = new double[tam];
		System.out.println("Ingrese los atos del arreglo 1 : ");
		
		for (int i = 0; i< arr1.length; i++) {
			arr1[i] = lector.nextDouble();
		}
System.out.println("Ingrese los atos del arreglo 2 : ");
		
		for (int i = 0; i< arr2.length; i++) {
			arr2[i] = lector.nextDouble();
		}
		
		//Sumar los elementos
		for (int i = 0; i< tam; i++) {
			suma[i] = arr1[i] + arr2[i];
		}
		
		//Mostrar el arreglo suma
		System.out.print("La suma de los arreglos es: ");
		for (int i = 0; i< tam; i++) {
			System.out.println( suma[i] +  "  ,  "  );
		}
		
	}

}
