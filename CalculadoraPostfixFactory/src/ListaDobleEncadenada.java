/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Morales #17027
 */
public class ListaDobleEncadenada<E> extends ListaAbstracta<E>{

    public int cuenta;
    public DobleNodo<E> cabeza;
    public DobleNodo<E> fin ;
    
    public ListaDobleEncadenada(){
        this.cabeza = null;
        this.fin = null;
        this.cuenta = 0;
    }
    
    @Override
    public void clear() {
        this.cabeza = null;
        this.fin = null;
        this.cuenta = 0;
    }

    @Override
    public void add(E elemto) {
        //Añade el elemento siguiente a la cola
        this.fin = new DobleNodo<E>(elemto,null,this.fin);
        //si la cabeza no existe, la cola es la cabeza
        if (this.cabeza == null){
            this.cabeza = this.fin;
        }
        //Aumenta la cuenta
        this.cuenta++;
    }

    @Override
    public E getLast() {
        return this.fin.info;
    }

    @Override
    public E removeLast() {
        //Guarda el ultimo valor de la lista
        DobleNodo<E> temporal = this.fin;
        //el penultimo valor ahora es el ultimo
        this.fin = this.fin.anterior;
        //Si la lista se queda vacia se pone la cabeza como vacia
        if (this.fin == null){
            this.cabeza = null;
        } else {
            //Sino se le pone que la cola apunta a nada
            this.fin.insertarSiguiente(null);
        }
        this.cuenta--;
        return temporal.info;
    }
    
    @Override
    public int size(){
        return this.cuenta;
    }
}
