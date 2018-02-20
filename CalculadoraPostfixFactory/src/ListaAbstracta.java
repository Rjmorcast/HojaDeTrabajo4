/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public abstract class ListaAbstracta<E> implements Lista<E>{
    /**
     * Constructor
     */
    public ListaAbstracta(){}
    
    @Override
    public void push(E element){
        add(element);
    }    
    
    @Override
    public E pop(){
        return getLast();
    }
    
    @Override
    public E peek(){
        return getLast();
    }
    
    @Override
    public boolean empty(){
        return size()==0;
    }
    
    @Override
    public int size(){
        return 0;
    }
}
