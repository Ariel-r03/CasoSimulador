/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casosimulado1;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class CasoSimulado1 {

    public static void main(String[] args) {
//    Ejercicio1();
//    Ejercicio2();
    Ejercicio3();
 
}
String Nombre;
String Cedula;
double NotaFinal;
boolean aprobado;

    public String getNombre() {
        return Nombre;
    }
    
    public boolean getAprobado() {
        return aprobado;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public double getNotaFinal() {
        return NotaFinal;
    }

    public void setNotaFinal(double NotaFinal) {
        this.NotaFinal = NotaFinal;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public CasoSimulado1(String Nombre, String Cedula, double NotaFinal, boolean aprobado) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.NotaFinal = NotaFinal;
        this.aprobado = aprobado;
    }
    
public static void Ejercicio1(){
       JOptionPane.showMessageDialog(null, "***Bienvenido a tu calculadora de numeros primos***");
        int x=0;
        int y=0;
        ArrayList<Integer> vector = new ArrayList<Integer>();
        Scanner input =new Scanner (System.in);
        System.out.println("Digite X1 (Primer nÃºmero del rango): ");
        x=input.nextInt();
        String texto= new String();
        System.out.println("Digite Xn (Ultimo nÃºmero del rango): ");
        y=input.nextInt();
        
       
  for (int i=x;i<=y;i++) {
  if (NumeroPrimo(i)){
       vector.add(i);	 
  }
}
  for(Integer posicion :vector) {
      texto += " "+ posicion;
    }
      
  JOptionPane.showMessageDialog(null, texto);
} 
public static boolean NumeroPrimo(int numero){
  int divisor = 2;
  boolean primo=true;
  while ((primo) && (divisor!=numero)){
    if (numero % divisor == 0)
      primo = false;
    divisor++;
  }
  return primo;
}

public static void Ejercicio3(){
    JOptionPane.showMessageDialog(null, "EJERCICIO 3");
    int opcion;
    Scanner input =new Scanner (System.in);
    Scanner entrada =new Scanner (System.in);
   ArrayList<CasoSimulado1> vector = new ArrayList<CasoSimulado1>();
    String nombre;
    String cedula;
    double notaFinal;
    boolean aprobado=false;
    do{
    System.out.println("**BIENVENIDO A REGISTRO ACADEMICO**");
    System.out.println("Digite la acción a realizar: ");
    System.out.println("1.Registrar estudiante");
    System.out.println("2.Buscar Estudiante");
    System.out.println("3.Salir");
    opcion=input.nextInt();
   
    switch(opcion) {
			case 1:
				System.out.println("Digite el nombre del estudiante: ");
                                nombre=entrada.nextLine();
                                System.out.println("Digite la cedula del estudiante: ");
                                cedula=entrada.nextLine();
                                System.out.println("Digite la nota final: ");
                                notaFinal=input.nextDouble();
                                if(notaFinal>=70){
                                   aprobado=true; 
                                }
                                CasoSimulado1 E=new CasoSimulado1(nombre,cedula,notaFinal,aprobado);
                                vector.add(E);
                                System.out.println(nombre+" Se ha agregado satisfactoriamente");
                                break;
			case 2:
                                String cedulaB;
                                boolean estado=true;
			        System.out.println("Digite el numero de cedula del estudiante que desea buscar: ");
                                cedulaB=entrada.nextLine();
                                
                                CasoSimulado1 resultado=null;
                                for (CasoSimulado1 estudiante : vector) {
                                    if (estudiante.getCedula().equals(cedulaB)) {
                                        resultado = estudiante;
                                        nombre=resultado.getNombre();
                                        cedula=resultado.getCedula();
                                        notaFinal=resultado.getNotaFinal();
                                        aprobado=resultado.getAprobado();

                                        System.out.println("Nombre: "+nombre+"\nCedula: "+cedula+"\nNotaFinal: "+notaFinal+"\nAprobado: "+aprobado);break;
                                    }    
                                }
                                for (CasoSimulado1 estudiante : vector) {
                                    if (estudiante.getCedula()!=cedulaB) {
                                        JOptionPane.showMessageDialog(null, "NO SE HA ENCONTRADO NINGUN ESTUDIANTE CON ESA CEDULA", "ERROR", JOptionPane.WARNING_MESSAGE);break;
                                    }
                                    }
                                break;
                        case 3: System.out.println("GRACIAS POR USAR NUESTRA APP");break;
                                
			default:
				System.out.println("Ha digitado una opcion no existente, digitelo de nuevo");
		}
         } while(opcion!=3);
    
}

public static void Ejercicio2(){
    
    	int n = 12; //VALOR PARA LA CANTIDAD DE TABLAS A MOSTRAR POR EJ: DEL 1 AL 12
        int m = 12; //VALOR PARA LA TABLA HASTA LA QUE SE QUIERA MULTIPLICAR POR EJE: 1*12
       
        //METODO PARA CREAR LA MATRIZ, LOS CICLOS FOR OCURREN DE ACUERDO A LOS VALORES QUE SE LE DEN, LAS VARIABLES i y j SON VARIABLES TEMPORALES
        for(int i = 1; i <= n; i++) { //PRIMER VECTOR, SE CREA EL VECTOR CON LA CANTIDAD DE FILAS A MOSTRAR DE ACUERDO AL VALOR DE "n"
            System.out.println("----TABLA DEL " + i + "-----"); //SE IMPRIMEN LAS FILAS 
            for(int j = 1; j <= m; j++) { //SEGUNDO VECTOR, SE CREA EL VECTOR CON LA CANTIDAD DE COLUMNAS A MOSTRAR DE ACUERDO AL VALOR DE "m"
                System.out.println(i + " x " + j + " = " + (i*j)); //SE IMPRIMEN LAS COLUMNAS 
            }
            System.out.println();
        }
	
}

   
}
