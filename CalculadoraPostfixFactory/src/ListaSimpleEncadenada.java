/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class ListaSimpleEncadenada<E> extends ListaAbstracta<E>{

    public int cuenta;
    public Nodo<E> cabeza;
    /**
     * Constructor de la lista
     */
    public ListaSimpleEncadenada(){
        this.cabeza = null;
        this.cuenta = 0;
    }
    
    @Override
    public void clear() {
        this.cabeza = null;
        this.cuenta = 0;
    }

    @Override
    public void add(E elemto) {
        Nodo<E> newElement = new Nodo<E>(elemto,null);
        Nodo<E> index = this.cabeza;
        if (this.cabeza == null){
            this.cabeza = newElement;
        }else {
            while (index.siguiente != null){
                index = index.siguiente;
            }
            index.insertarSiguiente(newElement);
        }
        this.cuenta++;
    }

    @Override
    public E getLast() {
        Nodo<E> index = this.cabeza;
        while (index.siguiente != null){
            index = index.siguiente;
        }
        return (E)index.info;
    }

    @Override
    public E removeLast() {
        Nodo<E> temporal = null;
        Nodo<E> index = this.cabeza;
        while (index.siguiente != null){
            temporal = index;
            index = index.siguiente;
        }
        temporal.siguiente=null;
        this.cuenta--;
        return (E)index.info;
    }
    
    @Override
    public int size(){
        return this.cuenta;
    }
    
}
