/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TercerParcial.ArbolBinario;

import java.util.ArrayList;

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
        //arbol.eliminar(30);
        //arbol.inOrden();
        
        System.out.println("Obtener Menor: " + arbol.obtenerMenor());
        System.out.println("Obtener Mayor: " + arbol.obtenerMayor());
        System.out.println("Sumatoria: " + arbol.sumar());
        System.out.println("Verificar Existe 1000: " + arbol.verificarSiSeEncuentra(1000));
        System.out.println("Verificar Existe 29: " + arbol.verificarSiSeEncuentra(29));
        System.out.println("---------------------------------------");
        arbol.inOrden();
        //System.out.println("Eliminar Menor: ");
        //arbol.eliminarMenorDato();
        //System.out.println("Eliminar Mayor: ");
        //arbol.eliminarMayor();
        //System.out.println("Eliminar Hojas: ");
        //arbol.eliminarHojas();
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(29);
        array.add(28);
        array.add(61);
        
        //arbol.eliminarDeUnArrayList(array);
        arbol.eliminarDeUnArrayListNumerosImpares(array);
        arbol.inOrden();
    }
}
