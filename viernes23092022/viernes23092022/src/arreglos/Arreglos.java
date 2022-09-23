package arreglos;

import java.util.Scanner;

public class Arreglos {

	public static void main(String[] args) {
		//Arreglo - Es un tipo de Estructura de datos
		//Declaracion 
		int[] arr = new int[10];
		double[] arr4 = new double[5];
		//Declaracion e inicializacion
		double[] arr2 = new double[] {2.5,3.6,1.2,6.3};
		char[] arr3 = {'a','b','c','d'};
		
		Scanner lector=new Scanner(System.in);
		System.out.println("Cuantos datos va a ingresar? ");
		int cantidad = lector.nextInt();
		
		String[] estudiantes = new String[cantidad];
		System.out.println("Ingrese los nombres :");
		for (int i = 0; i< estudiantes.length; i++) {
			System.out.print("Elemento [" + (i + 1) + "] = ");
			estudiantes[i] = lector.next();
		}
		//Este for es para mostrar los datos del arreglo
		for (int i = 0; i< estudiantes.length; i++) {
			System.out.println("Estudiante: " + (i + 1) + " = " + estudiantes[i]);
		}
		
		
		//La posicion de cada elemento esta definida por un indice
		//El indice va desde 0 hasta el tamaño del arreglo -1
		//arr[0] es el primer elemento del arreglo
		arr[0] = 25;
		//arr[1] es el segundo elemento del arreglo
		arr[1] = 5;
		arr[2] = 12;
		arr[3] = 34;
		arr[4] = 15;
		arr[5] = 15;
		arr[6] = 0;
		arr[7] = 5;
		arr[8] = 8;
		arr[9] = 5;
		//arr[10] = 5;
		
		
		
		
	}

}
