/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Nodo<E> {
    
    public E info;
    public Nodo<E> siguiente;
    /**
     * Constructor de un nodo
     * @param data datos del nodo
     * @param siguiente siguiente nodo
     */
    public Nodo(E data, Nodo<E> siguiente){
        this.info = data;
        this.siguiente = siguiente;
    }
    /**
     * Constructor de un nodo sin puntero
     * @param data datos del nodo
     */
    public Nodo(E data){
        this(data, null);
    }
    /**
     * Añade un siguiente nodo al actual
     * @param siguiente siguiente nodo
     */
    public void insertarSiguiente(Nodo<E> siguiente){
        this.siguiente = siguiente;
    }
    /**
     * Insertar datos al nodo
     * @param data datos
     */
    public void setInfo(E data){
        this.info = data;
    }
}
