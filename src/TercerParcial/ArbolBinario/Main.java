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
        arbol.insertar(100);
        arbol.insertar(90);
        arbol.insertar(110);
        
        arbol.inOrden();
    }
}
