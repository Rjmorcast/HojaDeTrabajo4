/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class ListaCircular<E> extends ListaAbstracta<E>{

    public Nodo<E> fin;
    public int cuenta;
    

    @Override
    public void clear() {
        this.fin=null;
        this.cuenta=0;
    }

    @Override
    public void add(E elemto) {
        Nodo<E> temp = new Nodo<E>(elemto);
         if (this.fin == null){
             this.fin = temp;
             this.fin.insertarSiguiente(fin);
         } else {
             temp.insertarSiguiente(this.fin.siguiente);
             this.fin.insertarSiguiente(temp);
         }
         this.cuenta++;
         this.fin = this.fin.siguiente;
    }

    @Override
    public E getLast() {
        return this.fin.info;
    }

    @Override
    public E removeLast() {
         Nodo<E> index = this.fin;
        while (index.siguiente != this.fin) {
            index = index.siguiente;
        }

        Nodo<E> temp = this.fin;
        if (index == this.fin)
        {
            this.fin = null;
        } else {
            index.insertarSiguiente(this.fin.siguiente);
            this.fin = index;
        }
        this.cuenta--;
        return temp.info;
    }
   
    @Override
    public int size(){
        return this.cuenta;
    }
}
