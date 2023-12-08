package MyLinkedList;

//import org.w3c.dom.Node;

public class MyLinkedList<T> extends MyNode<T> {

    int size = 0;
    int index = 0;
    MyNode<T> first;
    MyNode<T> last;

    public MyLinkedList(MyNode<T> prev, T element, MyNode<T> next, int size) {
        super(prev, element, next);
        this.size = size;
        this.first = first;
        this.last = last;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("["+ this.first);
        int i = 0;
        MyNode<T> node = new MyNode<T>(prev, null, next);
        node = this.first;
        while (i < size) {
            builder.append(node.next + " ");
            i++;
        }

        return "MyLinkedList [size=" + size + builder + "]";
    }

    public int size() {
        return size;
    }

    // Добавление впереди
    void insertFirst(T value) {
        MyNode<T> node = new MyNode<T>(prev, value, next);
        if (this.first == null) {
            this.first = node;
            this.last = node;
        } else {
            node.next = this.first;
            this.first = node;
        }
        this.size++;
    }

    // Добавление сзади
    void insertLast(T value) {
        MyNode<T> node = new MyNode<T>(prev, value, next);
        if (this.last == null) {
            this.first = node;
            this.last = node;
        } else {
            this.last.next = node;
            this.last = node;
        }
        this.size++;
    }

    // Получение по индексу
    public MyNode<T> getNodeValue(int index) {
        MyNode<T> node = new MyNode<T>(prev, null, next);
        node = this.first;
        int i = 0;
        while (i < index) {
            node = node.next;
            i++;
        }

        return (MyNode<T>) node;



    }

}
