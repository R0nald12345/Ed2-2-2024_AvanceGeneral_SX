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
public class ClaseNodoListaDoble {
     //Atributos
    public ClaseNodoListaDoble ant;
    public ClaseNodoListaDoble prox;
    public int dato;
    
    //constructor
    public ClaseNodoListaDoble(ClaseNodoListaDoble ant, int dato,ClaseNodoListaDoble prox){
        this.ant = ant;
        this.prox = prox;
        this.dato = dato;
    }
}
