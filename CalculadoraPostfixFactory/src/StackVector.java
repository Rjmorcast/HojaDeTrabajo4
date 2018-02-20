/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
import java.util.Vector;
public class StackVector <E> implements Stack<E>{

    public Vector<E> datos;
    
    public StackVector(){
        datos = new Vector<E>();
    }
    
    @Override
    public void push(E elemento) {
        datos.addElement(elemento);
    }

    @Override
    public E pop() {
        return (E)datos.remove(size()-1);
    }

    @Override
    public E peek() {
        return (E)datos.get(size() - 1);
    }

    @Override
    public boolean empty() {
        return datos.size() == 0;
    }

    @Override
    public int size() {
        return datos.size();
    }
    
}
