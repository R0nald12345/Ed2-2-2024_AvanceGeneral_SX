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
        
        l1.insertarUlt(3);
        l1.insertarUlt(4);
        l1.insertarUlt(6);
        l1.insertarUlt(9);
        l1.insertarUlt(2);
        l1.insertarUlt(1);
        
        System.out.println(l1.mostrarLista());
        System.out.println(l1.obtenerMenorR());
        System.out.println(l1.obtenerMayorR());
        System.out.println("Contar Par: " + l1.contarParesR());
    }
    
}
