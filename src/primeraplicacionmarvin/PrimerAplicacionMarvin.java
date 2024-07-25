/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeraplicacionmarvin;

/**
 *
 * @author Estudiante
 */
public class PrimerAplicacionMarvin {

    public static void main(String[] args) {
        //variables
        String grupo = "1 A";
        int edad = 16;
        double altura = 1.71;   
        
        //ejecutamos los métodos de abajo
        sumar(2, 8);
        
        System.out.println("El resultado de la suma es: " + sumar(2, 5));
    }
    
    //métodos y funciones
    public static void saludar(){
        System.out.println("Hola mundo!");
    }
    
    //métodos que retornan valores
    public static String despedir(){
    
        String despedida = "Adiós mundo";
        return despedida;
    }
    
    //métodos con argumentos
    public static int sumar(int num1, int num2){
        int resultado = (num1 + num2);
        return resultado;
    }
    
}
