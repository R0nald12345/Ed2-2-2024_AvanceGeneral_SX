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
public class ListaArbol {

    //Atributos
    ArbolBinario arbol;
    ArrayList<ArbolBinario> listaArbol;

    //Contructor
    public ListaArbol(int cantidad) {
        listaArbol = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            listaArbol.add(new ArbolBinario());
        }
    }
    
    public void deleteDateInPosition(int position, int date){
        listaArbol.get(position).eliminar(date);
    }

    public void insertarDato(int p, int x) {
        listaArbol.get(p).insertar(x);
    }

    public void mostrarInOrdenPos(int posicion) {
        listaArbol.get(posicion).inOrden();
    }
    
    public int countParPosition(int position){
        return listaArbol.get(position).contarNumerosPares();
    }

    public static void main(String[] args) {

        ListaArbol lista1 = new ListaArbol(5);

        lista1.insertarDato(0, 100);
        lista1.insertarDato(0, 110);
        lista1.insertarDato(0, 90);
        lista1.insertarDato(0, 50);

        lista1.insertarDato(3, 10);
        
        lista1.insertarDato(4, 90);
        lista1.insertarDato(4, 50);
        
//        System.out.println("------ANTES--------");
//        System.out.println("Pos: 0");
//        lista1.mostrarInOrdenPos(0);
//        
//        lista1.deleteDateInPosition(0, 90);
        System.out.println("Cantidad pares pos: 0 =>" + lista1.countParPosition(0)); 
        
        System.out.println("------DESPUES--------");
        System.out.println("Pos: 0");
        lista1.mostrarInOrdenPos(0);
        System.out.println("Pos: 1");
        lista1.mostrarInOrdenPos(1);
        System.out.println("Pos: 2");
        lista1.mostrarInOrdenPos(2);
        System.out.println("Pos: 3");
        lista1.mostrarInOrdenPos(3);
        System.out.println("Pos: 4");
        lista1.mostrarInOrdenPos(4);
    }

}
