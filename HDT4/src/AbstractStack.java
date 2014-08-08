abstract public class AbstractStack<E> 
implements Stack<E>
{
    public boolean isEmpty()
   // post: regresa true si el stack esta vacio
   {
      return size() == 0;
   }
    
    public boolean contains(E value){
        return true;
        
    }
    
    public int size(){
        return size();
    }
}