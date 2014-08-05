public class nodo<E>
{
   protected E data; // value stored in this element
   protected nodo<E> nextElement; // ref to next

   public nodo(E v, nodo<E> next)
   // pre: v is a value, next is a reference to 
   //      remainder of list
   // post: an element is constructed as the new 
   //      head of list
   {
       data = v;
       nextElement = next;
   }

   public nodo(E v)
   // post: constructs a new tail of a list with value v
   {
      this(v,null);
   }

   public nodo<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }

   public void setNext(nodo<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

   public E value()
   // post: returns value associated with this element
   {
      return data;
   }

   public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }
}