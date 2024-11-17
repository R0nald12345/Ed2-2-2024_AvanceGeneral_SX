/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TercerParcial.ArbolBinario;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar(30);
        arbol.insertar(28);
        arbol.insertar(50);
        arbol.insertar(29);
        arbol.insertar(48);
        arbol.insertar(60);
        
        arbol.inOrden();
        
//        arbol.PostOrden();
        
        System.out.println("cantidad de Nodos " + arbol.contarNodos());
        System.out.println("Contar Nodo Pares " + arbol.contarNumerosPares());
        System.out.println("Contar Nodo Impares " + arbol.contarNumerosImpar());
        arbol.eliminar(30);
        arbol.inOrden();
    }
}
