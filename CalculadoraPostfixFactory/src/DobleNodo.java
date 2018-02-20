/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Clase de los nodos doblemente encadenados
 * @author Rodrigo Morales #17027 y Javier Anleu
 */
public class DobleNodo<E> {
    public E info;
    public DobleNodo siguiente;
    public DobleNodo anterior;

    /**
     * Constructor de un nodo doblemente enlazado
     * @param data información del nodo
     * @param siguiente siguiente elemento
     * @param anterior anterior elemento
     */
    public DobleNodo(E data, DobleNodo<E> siguiente, DobleNodo<E> anterior ){
        this.info = data;
        this.siguiente = siguiente;
        this.anterior = anterior;
        if (this.siguiente != null){
            this.siguiente.anterior = this;
        }
        if (this.anterior != null){
            this.anterior.siguiente = this;
        }
    }
    /**
     * Crea un nodo sin anterior ni siguiente
     * @param data datos del nodo
     */
    public DobleNodo(E data){
        this(data,null,null);
    }
    /**
     * Inserta el siguiente nodo
     * @param siguiente siguiente nodo
     */
    public void insertarSiguiente( DobleNodo<E> siguiente){
        this.siguiente = siguiente;
    }
    /**
     * Coloca el valor al nodo
     * @param data informacion del nodo
     */
    public void setInfo (E data){
        this.info = data;
    }
    /**
     * Inserta un nodo antes del actual
     * @param anterior 
     */
    public void insertarAnterior(DobleNodo<E> anterior){
        this.anterior = anterior;
    }
}
