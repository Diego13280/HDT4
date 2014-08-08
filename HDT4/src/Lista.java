/**
 * Diego Juarez 13280
 * Daniel Mejia 13271
 */
public interface Lista<E>  {
         public boolean isEmpty();
   //post: regresa true si el stack esta vacio

   public int size();
   //post: regresa la cantidad de elementos
   //      en el stack
   public void addFirst(E value);
   
   public void clear();
   
      
   public void add(int posicion, E value);
   
   public boolean contains(E value);
   
   E get(int posicion);
   
   E remove(int poscion);
}
