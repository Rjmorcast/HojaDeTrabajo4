/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
import java.util.ArrayList;
public class StackArrayList<E> implements Stack<E> {

    public ArrayList<E> datos;
    
    public StackArrayList(){
        datos = new ArrayList<E>();
    }
    
    @Override
    public void push(E elemento) {
        datos.add(elemento);
    }

    @Override
    public E pop() {
        return datos.remove(size()-1);
    }

    @Override
    public E peek() {
        return datos.get(size() - 1);
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return datos.size();
    }
    
}
