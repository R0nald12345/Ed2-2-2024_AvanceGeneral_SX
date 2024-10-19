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
public class ArbolBinario {
    
    public NodoBinario raiz;
    
    public ArbolBinario(){
        raiz = null;
    }
    
    public void insertar(int x){
        this.raiz = insertarR(this.raiz, x);
    }
    
    
    //Aqui lo trabajamos de forma recursivo
    private NodoBinario insertarR(NodoBinario raizAux, int x){
        //Caso Base (Arbol Vacio)
        if(raizAux == null){
            NodoBinario nuevoNodo = new NodoBinario(x);
            raizAux = nuevoNodo;
            return raizAux;
        }
        //Caso General
        if(x < raizAux.elem){
            raizAux.izq = insertarR(raizAux.izq, x);
        }else{
            raizAux.der = insertarR(raizAux.der, x);
        }
        return raizAux;
    }
    
    public boolean verificarArbolVacio(){
        return this.raiz == null;
    }
    
    public void inOrden(){
        inOrdenR(this.raiz);
        System.out.println("");
    }
    
    private void inOrdenR(NodoBinario raizAux){
        if(raizAux == null){
            return;
        }else{
            inOrdenR(raizAux.izq);
            System.out.print(raizAux.elem + ", ");
            inOrdenR(raizAux.der);
        }
    }
    
}
