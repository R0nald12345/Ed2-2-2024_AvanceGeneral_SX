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
public class ListaArregloWithListaDoble {
    
      //atributos
    public static final int MAX = 5;
    public ClaseListaDoble vectorListaDoble[];
   

    //contructor
    public ListaArregloWithListaDoble() {
      
        vectorListaDoble = new ClaseListaDoble[MAX];
        for (int i = 0; i < MAX; i++) {
            vectorListaDoble[i] = new ClaseListaDoble();
        }
    }
    
    // i =0; x= 10
    public void insertarDatoConPosicion(int x, int i ){
        vectorListaDoble[i].insertarUlt(x);
    }

    public boolean verificarSiEstaVacioEnI(int i){
        return vectorListaDoble[i].verificarVacio();
    }
    
    public boolean verificarIgual(int i){
        return vectorListaDoble[i].verificarDiferentes();
    }
    
    public boolean verificarDistintos(int i){
        return vectorListaDoble[i].verificarDiferentes();
    }
    
    public void eliminarIListaDobleUltimo(int i){
        vectorListaDoble[i].eliminarUlt();
    }
    
//    public int obteberCantidadParesEnI(int i){
//        return vectorListaDoble[i].contarCantidadPares();
//    }
    
    public String imprimirListaArregloI(int i){
        return vectorListaDoble[i].imprimirListaDoble();
    }
}
