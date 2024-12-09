/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;
import java.util.Scanner;
/**
 *
 * @author samgomgom
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
int opcion;
boolean continuar= true;
double num1=0;
double num2=0;
int suma;
int resta;
int multiplicacion;
double division;
double resultado;

while(continuar) {
	System.out.println("1. SUMA");
	System.out.println("2.RESTA");
	System.out.println("3.MULTIPLICACION");
	System.out.println("4.DIVISION");
	System.out.println("5. SALIR");
	opcion= sc.nextInt();
	
	if(opcion== 5) {
		continuar= false;
		System.out.println("saliendo de la calculadora");
			
		} else {
			System.out.println("ingrese el primer numero");
			num1= sc.nextDouble();
			System.out.println("Ingrese el segundo numero");
			num2= sc.nextDouble();
		}
		
		
			switch (opcion)
			{
			case 1:
				
				
			System.out.println(" suma");
			break;
			case 2:
				
			System.out.println("resta");
                        System.out.println("El resultado de la resta :"+ (num1 - num2));
			break;
			case 3:
			System.out.println("multiplicacion");
			
		break;
	default:
		System.out.println(" opcion incorrecta");
	}
}

	}

}

    
    

