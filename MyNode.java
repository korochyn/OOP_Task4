package MyLinkedList;

public class MyNode<T> {
    T item;
    MyNode<T> next =null;
    MyNode<T> prev = null;

    MyNode(MyNode<T> prev, T element, MyNode<T> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "" + item ;
    }

    
}
