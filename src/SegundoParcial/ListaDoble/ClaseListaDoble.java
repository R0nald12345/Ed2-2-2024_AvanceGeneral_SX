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
public class ClaseListaDoble {

    public ClaseNodoListaDoble prim;
    public ClaseNodoListaDoble ult;
    public int cantNodo;

    //Constructor
    public ClaseListaDoble() {
        this.prim = null;
        this.ult = null;
        this.cantNodo = 0;
    }

    //1. L1.insertarPrim(x) : 
    //x = 100 
    public void insertarPrim(int x) {
        if (verificarVacio()) { //Verifica mi lista esta vacio
            ClaseNodoListaDoble nuevoNodo = new ClaseNodoListaDoble(null, x, null);
            prim = ult = nuevoNodo;
        } else {
            ClaseNodoListaDoble nuevoNodo = new ClaseNodoListaDoble(null, x, null);
            nuevoNodo.prox = prim;
            prim.ant = nuevoNodo;
            this.prim = nuevoNodo;
        }
        this.cantNodo++;
    }

    public void insertarUlt(int x) {
        if (verificarVacio()) { //Verifica mi lista esta vacio
            ClaseNodoListaDoble nuevoNodo = new ClaseNodoListaDoble(null, x, null);
            prim = ult = nuevoNodo;
        } else {
            ClaseNodoListaDoble nuevoNodo = new ClaseNodoListaDoble(null, x, null);
            nuevoNodo.ant = ult;
            ult.prox = nuevoNodo;
            this.ult = nuevoNodo;
        }
        this.cantNodo++;
    }

    public boolean verificarVacio() {
        return this.prim == null && this.ult == null;
    }

    //3. L1.insertarIesimo(x, i) : Método que inserta el elemento x, en la posición i, de la lista L1.
    //x = 100
    // i = 3
    public void insertarIesimo(int x, int i) {
        if (this.cantNodo > i) {
            ClaseNodoListaDoble aux = prim;
            ClaseNodoListaDoble ant = null;
            int contador = 0;
            while (contador < i) {
                ant = aux;
                aux = aux.prox;
                contador++;
            }
            ClaseNodoListaDoble nuevoNodo = new ClaseNodoListaDoble(null, x, null);
            nuevoNodo.ant = ant;
            nuevoNodo.prox = aux;
            ant.prox = nuevoNodo;
            aux.ant = nuevoNodo;
            this.cantNodo++;

        }
    }

//    9. L1.iguales() : Método Lógico que devuelve True, si todos los elementos de la lista L1 son iguales.
    public boolean verificarIguales() {
        if (verificarVacio()) {
            return false;
        } else {
            ClaseNodoListaDoble aux = prim;
            ClaseNodoListaDoble antes = null;
            while (aux != null) {
                antes = aux;
                if (antes.dato != aux.dato) {
                    return false;
                }
                aux = aux.prox;
            }
            return true;
        }
    }

//
//10. L1.diferentes() : Método Lógico que devuelve True, si todos los elementos de la lista L1 son diferentes.
    public boolean verificarDiferentes() {
        if (verificarVacio()) {
            return false;
        } else {
            ClaseNodoListaDoble aux = prim;
            ClaseNodoListaDoble antes = null;
            while (aux != null) {
                antes = aux;
                if (antes.dato == aux.dato) {
                    return false;
                }
                aux = aux.prox;
            }
            return true;
        }
    }

//11. L1.ordenado()  : Método Lógico que devuelve True, si todos los elementos de la lista L1 están ordenados en forma ascendente o descendente.
    public boolean verificarOrdenado() {
        if (verificarVacio()) {
            return false;
        } else {
            ClaseNodoListaDoble aux = prim;
            ClaseNodoListaDoble antes = null;
            while (aux != null) {
                antes = aux;
                if (antes.dato > aux.dato) {
                    return false;
                }
                aux = aux.prox;
            }
            return true;
        }
    }

    //----E L I M I N A R-----
//    1. L1.eliminarPrim() : Método que elimina el elemento de la primer posición.
    public void eliminarPrim() {
        if (verificarVacio()) {
            return;
        }
        ClaseNodoListaDoble aux = prim;
        prim = prim.prox;
        aux.prox = null;
        prim.ant = null;
        this.cantNodo--;
    }

//2. L1.eliminarUlt() : Método que elimina el último elemento de la lista L1
    public void eliminarUlt() {
        if (verificarVacio()) {
            return;
        }
        ClaseNodoListaDoble aux = ult;
        ult = ult.ant;
        aux.ant = null;
        ult.prox = null;
        this.cantNodo--;
    }

//     5. L1.eliminarPrim( n ) : Método que eliminar los primeros n-elementos de la lista L1.
    public void eliminarPrimNveces(int n) {
        if (verificarVacio()) {
            return;
        }
        int contador = 1;
        ClaseNodoListaDoble antes = null;
        ClaseNodoListaDoble aux = prim;
        while (contador <= n) {
            antes = aux;
            aux = aux.prox;
        }
        antes.prox = null;
        aux.ant = null;
        this.prim = aux;
        this.cantNodo = this.cantNodo - n;
    }

//6. L1.eliminarUlt( n ) : Método que elimina los n-últimos elementos de la lista L1.
    public void eliminarUltNveces(int n) {
        if (verificarVacio()) {
            return;
        }
        ClaseNodoListaDoble despues = null;
        ClaseNodoListaDoble aux = ult;
        int cant = this.cantNodo - n; //3
        while (this.cantNodo >= n) {
            despues = aux;
            aux = aux.ant;
            this.cantNodo--;
        }
        aux.prox = null;
        despues.ant = null;
        this.ult = aux;
    }

//7. L1.eliminarIesimo(i) : Método que elimina el i-ésimo elemento de la lista L1.
    public void eliminarIesimo(int i) {
        if (this.cantNodo > i) {
            ClaseNodoListaDoble aux = prim;
            ClaseNodoListaDoble ant = null;
            int contador = 0;
            while (contador < i) {
                ant = aux;
                aux = aux.prox;
                contador++;
            }
            ant = aux.prox;
            ClaseNodoListaDoble aux2 = aux.prox;
            aux2.ant= aux.ant;
            aux.ant =null;
            aux.prox = null;
            this.cantNodo--;
        }
    }
    
    
    public String imprimirListaDoble(){
        ClaseNodoListaDoble aux = prim;
        String cadena = "null<- ";
        int i = 0;
        while( aux != null){
            if(i!=0){
                cadena = cadena + "=" +aux.dato ;
            }else{
                cadena = cadena + aux.dato ;
            }
            i++;
            aux = aux.prox;
        }
        return cadena + " -> null";
    }
}
