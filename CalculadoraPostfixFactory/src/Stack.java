/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public interface Stack<E> {
    /**
     * Ingresa un elemento en el stack
     * @param elemento elemento a ingresar
     */
    public void push(E elemento);
    /**
     * Saca el ultimo elemento en el stack
     * @return elemento
     */
    public E pop();
    /**
     * devuelve el ultimo elemento en el stack
     * @return elemento
     */
    public E peek();
    /**
     * devuelve si el stack esta vacio o no
     * @return true/false
     */
    public boolean empty();
    /**
     * devuelve el tamaño actual del stack
     * @return tamaño
     */
    public int size();
}
