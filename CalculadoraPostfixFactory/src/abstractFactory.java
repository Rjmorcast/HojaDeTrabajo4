
public abstract class abstractFactory<E> {
    /**
     * Devuelve una instancia de una Factory
     * @param stackType Tipo de factory que se desea instanciar
     * @param <E> Tipo de datos
     * @return Instancia de un Stack
     */
    public abstract <E> Stack<E> getStack(String stackType);
    
    public abstract <E> List<E> getList (String listType);
}
