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
public class ClaseNodoListaSimple {
     //Atributos
    public int dato;
    public ClaseNodoListaSimple prox;
    
    //Constructor
    public ClaseNodoListaSimple(int elem, ClaseNodoListaSimple nuevoProx){
        this.dato = elem;
        this.prox = nuevoProx;
    }
    
    
}
