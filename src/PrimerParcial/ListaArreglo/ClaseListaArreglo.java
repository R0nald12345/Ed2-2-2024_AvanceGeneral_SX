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
    
    public void insertarNum(int num, int pos){
        insertarNumRecursivo(this.cant, num, pos);
        this.cant++;
    }
    
    private void insertarNumRecursivo(int cantAux,int num,int pos){
        if(cantAux == pos){
            vector[cantAux] = num;
//            this.cant++;
        }else{
//            insertarNumRecursivo(cantAux-1, num, pos );
//            if(cantAux == pos ){
//                vector[cantAux] = num;
////                this.cant++;
//            }
//            
            vector[cantAux] = vector[cantAux - 1];  // Desplaza el elemento hacia adelante
        insertarNumRecursivo(cantAux - 1, num, pos);  // Llamada recursiva
        }
    }
    
    public boolean verificarTodoIgual(){
        return verificarTodoIgualRecursivo(this.cant);
    }
    
    private boolean verificarTodoIgualRecursivo(int cantAux){
        //Caso Base
        if(cantAux == 1){
            return true;
        }else{ //caso General
            boolean res = verificarTodoIgualRecursivo(cantAux-1);
            int datoAnterior= vector[cantAux-2]; // 6
            if(datoAnterior == vector[cantAux-1]){ // 6 == 1
                res =  true;
            }else{
                res = false;
            }
            return res;
//            return datoAnterior == vector[cantAux-1];
        }
    } 
    
    public int frecuenciaNumero(int x){
        return frecuenciaNumeroRecursivo(this.cant, x);
    }
    
    private int frecuenciaNumeroRecursivo(int cantAux, int x){
        //caso Base
        if(cantAux == 1 ){
            if(vector[cantAux -1] == x){
                return 1;
            }else{
                return 0;
            }
        }else{ // caso General
            int cantidad = frecuenciaNumeroRecursivo(cantAux-1,x);
            if(vector[cantAux-1] == x){ //verifico ultima posicion
                cantidad++;
            }
            return cantidad;
        }
    }
    
    public int sumarDigitoPar(){
        return sumarDigitoParRecursivo(this.cant);
    }
    
    
    private int sumarDigitoParRecursivo(int cantAux ){
        if(cantAux == 1){
            if((this.vector[cantAux-1] %2) == 0){
                return vector[cantAux-1];
            }else{
                return 0;
            }
        }else{ //Caso General
            int sumaTotal =sumarDigitoParRecursivo(cantAux - 1); 
            //trato de validar el ultimo dato del Vector
            if((this.vector[cantAux-1] % 2) == 0){
                return sumaTotal + vector[cantAux-1];
            }else{
                return sumaTotal;
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
