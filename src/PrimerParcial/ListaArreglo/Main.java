/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerParcial.ListaArreglo;

/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String[] args) {
        
        ClaseListaArreglo l1 = new ClaseListaArreglo();
        
        l1.insertarUlt(1);
        l1.insertarUlt(1);
        l1.insertarUlt(1);
        l1.insertarUlt(1);
        l1.insertarUlt(1);
        l1.insertarUlt(1);
        
        System.out.println(l1.mostrarLista());
//        System.out.println(l1.obtenerMenorR());
//        System.out.println(l1.obtenerMayorR());
//        System.out.println("Contar Par: " + l1.contarParesR());

//        l1.insertarNum( 1000, 2);
//        System.out.println(l1.mostrarLista());

//            System.out.println( "contar Numeros Pares:" + l1.sumarDigitoPar());

//            System.out.println( "Frecuencia 1:" + l1.frecuenciaNumero(1));
            System.out.println( "Verificar Iguales:" + l1.verificarTodoIgual());
            
    }
    
}
