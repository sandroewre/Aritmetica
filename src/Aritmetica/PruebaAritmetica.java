/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;
// es package es el paquete que hemos creado
/**
 *
 * @author labctr
 */
public class PruebaAritmetica {
    // este public static void main(String[]args) es para ejecutar el programa en java
    public static void main(String[]args){
        // crear un objeto en este caso el "a" de tipo Aritmetica
        Aritmetica a = new Aritmetica();
        // aqui invocamos los metodos 
         int resultado = a.sumar(3,4,5);
         //aqui imprimimos el resultado q esta en la clase Aritmetica
         //y asi se tepite cuantos metodos hemos creado en la clase Aritmetica 
         System.out.println("Resultado:" +resultado);
         int resultador = a.restar(4,8);
         System.out.println("Resultado:" +resultador);
         int resultadom = a.Multiplicar(4,6);
         System.out.println("Resultado:" +resultadom);
         int resultadod = a.dividir(10,5);
         System.out.println("Resultado:" +resultadod);
         
        
        //restar
   
}
}
