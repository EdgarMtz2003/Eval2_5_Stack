/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package eval2_5_stack;
/**
 *
 
 * @author moviles
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;
    private Nodo previo;
    
    // por default, un nuevo nodo va al final de la lista
    //el final de la lista se indica con null
      
    public Nodo(){
        this.siguiente=null;
        this.previo=null;
        
    }
    public Nodo( int valor){
        this.valor=valor;
        this.siguiente=null;
        this.previo=null;
    }
    
    
    
    public int getValor(){
        return valor;
    }
    
    public void setValor(int valor){
        this.valor=valor;
        
    }
    
    public Nodo getsiguiente(){
        return siguiente;
    }
    
    public void setsiguiente(Nodo siguiente){
        this.siguiente=siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
    
    
}
