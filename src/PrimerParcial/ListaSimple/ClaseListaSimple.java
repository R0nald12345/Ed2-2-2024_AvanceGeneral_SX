/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerParcial.ListaSimple;

/**
 *
 * @author USER
 */
public class ClaseListaSimple {

    public ClaseNodoListaSimple prim;
    public ClaseNodoListaSimple ult;
    public int cantNodo;

    //Constructor
    public ClaseListaSimple() {
        this.prim = null;
        this.ult = null;
        this.cantNodo = 0;
    }

    //L1.insertarPrim(x) : Método que inserta el elemento x, al inicio de la lista L1.
    public void insertarPrim(int x) {
        if (verificarVacio()) { //Si mi lista esta vacio
            ClaseNodoListaSimple nuevoNodo = new ClaseNodoListaSimple(x, null);
            prim = ult = nuevoNodo;
        } else {
            ClaseNodoListaSimple nuevoNodo = new ClaseNodoListaSimple(x, null);
            nuevoNodo.prox = prim;
            this.prim = nuevoNodo;
        }
        this.cantNodo++;

    }

    //verificar Vacio
    public boolean verificarVacio() {
        return this.prim == null && this.ult == null;
    }
    

    public void insertarUlt(int x) {
        if (verificarVacio()) { //Si mi lista esta vacio
            ClaseNodoListaSimple nuevoNodo = new ClaseNodoListaSimple(x, null);
            prim = ult = nuevoNodo;
        } else {
            ClaseNodoListaSimple nuevoNodo = new ClaseNodoListaSimple(x, null);
            this.ult.prox = nuevoNodo;
            this.ult = nuevoNodo;
        }
        this.cantNodo++;

    }
    
    //2da 

    //3ra 
    //4ta
    //5ta
}
