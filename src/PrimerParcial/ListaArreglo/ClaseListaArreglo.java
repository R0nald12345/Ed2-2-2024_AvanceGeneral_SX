/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerParcial.ListaArreglo;

/**
 *
 * @author USER
 */
public class ClaseListaArreglo {

    //atributos
    public static final int MAX = 50;
    public int vector[];
    public int cant;

    //contructor
    public ClaseListaArreglo() {
        this.cant = 0;
        vector = new int[50]; //Quiero un arreglo de 50 espacios en donde cada celta trabaje con enteros
    }

    //10 ejercicios
    public void insertarUlt(int valor) {
        vector[cant] = valor;
        cant++;
    }

    //2 
    public int contarNumerosPares() {
        int contador = 0;
        for (int i = 0; i < this.cant; i++) {
            if ((vector[i] % 2) == 0) {
                contador++;
            }
        }
        return contador;
    }

    public int obtenerMenorR(){
        return obtenerMenorRecursivoM(this.cant);
    }
    
    private int obtenerMenorRecursivoM(int cantAux){
        //Caso Base 
        if(cantAux == 1){
            return this.vector[cantAux-1];
        }else{ //Caso General
            int nuevoMenor = obtenerMenorRecursivoM(cantAux-1);
                if(nuevoMenor > this.vector[cantAux-1]){
                    return this.vector[cantAux-1];
                }else{
                    return nuevoMenor;
                }
        }
    }
    
    
    public int obtenerMayorR(){
        return obtenerMayorRecursivoM(this.cant);
    }
    
    private int obtenerMayorRecursivoM(int cantAux){
        //Caso Base 
        if(cantAux == 1){
            return this.vector[cantAux-1];
        }else{ //Caso General
            int nuevoMenor = obtenerMayorRecursivoM(cantAux-1);
                if(nuevoMenor < this.vector[cantAux-1]){
                    return this.vector[cantAux-1];
                }else{
                    return nuevoMenor;
                }
        }
    }
    
    public int contarParesR(){
        return contarParesRecursivo(this.cant);
    }
    
    private int contarParesRecursivo(int cantAux){
        if(cantAux == 1){ //caso base
            if((vector[cantAux -1] %2) == 0){
                return 1;
            }else{
                return 0;
            }
        }else{ //Caso General
            int cantidad = contarParesRecursivo(cantAux-1);
                if((vector[cantAux-1] %2) == 0){
                    return cantidad + 1;
                }else{
                    return cantidad;
                }
        }
                
    }
    
    
    public int contarNumerosImpares() {
        int contador = 0;
        for (int i = 0; i < this.cant; i++) {
            if ((vector[i] % 2) != 0) {
                contador++;
            }
        }
        return contador;
    }
    
    

    public void insertarEnPosicion(int p, int x){
        this.cant++;
        for (int i = this.cant; i > p; i--) {
            this.vector[i] = this.vector[i-1];
        }
        this.vector[p] = x;
    }
    
    public String mostrarLista(){
        String v ="[ ";
        for (int i = 0; i < this.cant ; i++) {
            v = v + this.vector[i] + ",";
        }
        return v + "]";
    }
    
}
