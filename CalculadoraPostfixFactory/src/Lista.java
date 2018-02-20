/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public interface Lista<E> extends Stack<E>{
    /**
     * tamaño de la lista
     * @return size
     */
    public int size();
    /**
     * limpia la lista
     */
    public void clear();
    /**
     * añade un elemento al final de la lista
     */
    public void add(E elemto);
    /**
     * devuelve el ultimo elemento de la lista
     * @return elemento
     */
    public E getLast();
    /**
     * elimina y devuelve el ultimo elemento de la lista
     * @return elemento
     */
    public E removeLast();
}
