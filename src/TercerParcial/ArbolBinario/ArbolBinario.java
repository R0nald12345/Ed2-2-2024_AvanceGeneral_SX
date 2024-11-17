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
    
    public void PostOrden(){
        PostOrdenR(this.raiz);
        System.out.println("");
    }
    
    private void PostOrdenR(NodoBinario raizAux){
        if(raizAux == null){
            return;
        }else{
            inOrdenR(raizAux.izq);
            inOrdenR(raizAux.der);
            System.out.print(raizAux.elem + ", ");
        }
    }
    
    public boolean isHoja(NodoBinario raizAux){
        return raizAux.izq == null && raizAux.der == null;
    }
    
    //Yo
    public int contarNodos(){
        return contarNodosRecursivo(this.raiz);
    }
    
    //mascara maton
    private int contarNodosRecursivo(NodoBinario raizAuxiliar){
        //Caso base
        if(raizAuxiliar == null){
            return 0;
        }
        if(isHoja(raizAuxiliar) == true){
            return 1;
        }
        
        //Caso General
        int i = contarNodosRecursivo(raizAuxiliar.izq); // 2
        int d = contarNodosRecursivo(raizAuxiliar.der); // 3
        return i + d + 1;
    } 
    
    
    public int contarNumerosPares(){
        return contarNumeroParesRecursivo(this.raiz);
        
    }
    
    private int contarNumeroParesRecursivo(NodoBinario raizAuxiliar){
        //Caso Base
        if(raizAuxiliar == null){
            return 0;
        }
        if(isHoja(raizAuxiliar) == true){
            if(raizAuxiliar.elem%2 == 0){
                return 1;
            }else{
                return 0;
            }
        }
        //Caso General
        int i =  contarNumeroParesRecursivo(raizAuxiliar.izq);
        int d =  contarNumeroParesRecursivo(raizAuxiliar.der);
        //Verifico el padre
        if(raizAuxiliar.elem %2 == 0){
            return i + d+ 1;
        }else{
            return i +d;
        }
    }
    
    
    public int contarNumerosImpar(){
        return contarNumeroImparRecursivo(this.raiz);
        
    }
    
    private int contarNumeroImparRecursivo(NodoBinario raizAuxiliar){
        //Caso Base
        if(raizAuxiliar == null){
            return 0;
        }
        if(isHoja(raizAuxiliar) == true){
            if(raizAuxiliar.elem%2 != 0){
                return 1;
            }else{
                return 0;
            }
        }
        
        //Caso General
        int i =  contarNumeroImparRecursivo(raizAuxiliar.izq);
        int d =  contarNumeroImparRecursivo(raizAuxiliar.der);
        //Verifico el padre
        if(raizAuxiliar.elem %2 != 0){
            return i + d + 1;
        }else{
            return i +d;
        }
    }
    
    public NodoBinario eliminarNodo(NodoBinario p) {
        if (p.izq == null && p.der == null) { //Caso 0
            return null; // elimino la ulltima hoja sde mi arbol
        }
        
        //Caso 1 (En el caso que te mi nodo tiene 1 solo hijo)
        if (p.izq != null && p.der == null) {
            return p.izq;
        }
        if (p.izq == null && p.der != null) {
            return p.der;
        }
        
        //Caso 2
        int y = inmediatoSuperior(p.der);
        p.elem = y; //intercambiamos
        p.der = eliminar(p.der, y);
        return p;
    }
    
     public int inmediatoSuperior(NodoBinario p) {
        if (p.izq == null) {
            return p.elem;
        } else {
            return inmediatoSuperior(p.izq);
        }
    }
    
    public void eliminar(int x) {
        raiz = eliminar(raiz, x);
    }
    
    private NodoBinario eliminar(NodoBinario p, int x) { //eliminar el 100
        if (p == null) { //si mi arbol esta vacio
            return null;
        }
        if (x == p.elem) { // si mi arbol tiene Un Dato 
            return eliminarNodo(p);
        }
        //Caso General
        if (x < p.elem) {
            p.izq = eliminar(p.izq, x);
        } else {
            p.der = eliminar(p.der, x);
        }
        return p;
    }
    
            
    
    
}
