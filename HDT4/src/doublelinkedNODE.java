public class doublelinkedNODE<E>
{
protected E data;
protected doublelinkedNODE<E> nextElement;
protected doublelinkedNODE<E> previousElement;

public doublelinkedNODE(E v,
                        doublelinkedNODE<E> next,
                        doublelinkedNODE<E> previous)
{
    data = v;
    nextElement = next;
    if (nextElement != null)
        nextElement.previousElement = this;
    previousElement = previous;
    if (previousElement != null)
        previousElement.nextElement = this;
}

public doublelinkedNODE(E v)
// post: constructs a single element
{
    this(v,null,null);
}
}