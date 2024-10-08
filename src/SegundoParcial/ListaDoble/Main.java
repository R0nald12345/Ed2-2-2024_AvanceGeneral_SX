/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundoParcial.ListaDoble;

/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String[] args) {
        ListaArregloWithListaDoble arregloLista = new ListaArregloWithListaDoble();
        
        arregloLista.insertarDatoConPosicion(10, 0);
        arregloLista.insertarDatoConPosicion(20, 0);
        arregloLista.insertarDatoConPosicion(30, 0);
        arregloLista.insertarDatoConPosicion(40, 0);
        arregloLista.insertarDatoConPosicion(50, 0);
        arregloLista.insertarDatoConPosicion(60, 0);
        
        arregloLista.insertarDatoConPosicion(10, 1);
        arregloLista.insertarDatoConPosicion(20, 1);
        arregloLista.insertarDatoConPosicion(30, 1);
        arregloLista.insertarDatoConPosicion(40, 1);
        
        arregloLista.insertarDatoConPosicion(10, 2);
        arregloLista.insertarDatoConPosicion(20, 2);
        arregloLista.insertarDatoConPosicion(30, 2);
        
        arregloLista.insertarDatoConPosicion(10, 3);
        arregloLista.insertarDatoConPosicion(20, 3);
        
//        arregloLista.insertarDatoConPosicion(10, 4);
        
         System.out.println("--------------------------");
        System.out.println("Lista Arreglo Posicion 0");
        System.out.println(arregloLista.imprimirListaArregloI(0));
        
        System.out.println("--------------------------");
        System.out.println("Lista Arreglo Posicion 1");
        System.out.println(arregloLista.imprimirListaArregloI(1));
        
        System.out.println("--------------------------");
        System.out.println("Lista Arreglo Posicion 2");
        System.out.println(arregloLista.imprimirListaArregloI(2));
        
        System.out.println("--------------------------");
        System.out.println("Lista Arreglo Posicion 3");
        System.out.println(arregloLista.imprimirListaArregloI(3));
        
        System.out.println("--------------------------");
        System.out.println("Lista Arreglo Posicion 4");
        System.out.println(arregloLista.imprimirListaArregloI(4));
        
    }
}
