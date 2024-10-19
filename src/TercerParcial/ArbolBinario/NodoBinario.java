/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TercerParcial.ArbolBinario;

/**
 *
 * @author Ronald
 */
public class NodoBinario {
    
    public NodoBinario izq;
    public int elem;
    public NodoBinario der;
    
    public NodoBinario(int elem){
        this.izq = null;
        this.elem = elem;
        this.der = null;
    }
    
}
