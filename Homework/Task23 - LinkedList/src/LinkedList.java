<<<<<<< HEAD
import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    private class Node<T> {
        T value;
        Node<T> next;
        Node(T value) {
            this.value = value;
        }
    }

    private class LinkedListIterator<T> implements Iterator<T> {
        private Node<T> current;
        public T next(){
            return current.value;
        }
        public boolean hasNext () {
            return current != null;
        }
    }

    public Iterator<T> iterator (){
        return new LinkedListIterator<T>();
    }

    private Node<T> current;
    private Node<T> head;
    private Node<T> tail;

    private int count;

    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    public T get(int index) {
        Node<T> current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current.value;
    }

    public void addFirst (T newValue) {
        Node<T> newNode = new Node<T>(newValue);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        count++;
    }

    public void addLast (T newValue) {
        Node<T> newNode = new Node<T>(newValue);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    public int amountOfNodes () {
        return count;
    }

    public T getNodeWithIndex (int index) {
        current = head;
        if (index <= count ) {
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            System.err.println("There are only "+ count + " elements");
        }
        return current.value;
    }

    public void remove (int index) {
        current = head;
        Node<T> before;
        if (index <= count ) {
            for (int i = 0; i < index-1; i++) {
                current = current.next;
            }
            before = current;
            before.next = current.next.next;
            count--;
        } else {
            System.err.println("There are only " + count + " elements");
        }
    }

    public void reverse () {
        Node<T> previous = null;
        Node<T> current = head;
        head = tail;
        Node<T> following;
        for (int i = 0; i < count; i++) {
            following = current.next;
            current.next = previous;
            previous = current;
            current = following;
        }
        head = previous;
    }
}
=======
import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    private class Node<T> {
        T value;
        Node<T> next;
        Node(T value) {
            this.value = value;
        }
    }

    private class LinkedListIterator<T> implements Iterator<T> {
        private Node<T> current;
        public T next(){
            return current.value;
        }
        public boolean hasNext () {
            return current != null;
        }
    }

    public Iterator<T> iterator (){
        return new LinkedListIterator<T>();
    }

    private Node<T> current;
    private Node<T> head;
    private Node<T> tail;

    private int count;

    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    public T get(int index) {
        Node<T> current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current.value;
    }

    public void addFirst (T newValue) {
        Node<T> newNode = new Node<T>(newValue);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        count++;
    }

    public void addLast (T newValue) {
        Node<T> newNode = new Node<T>(newValue);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    public int amountOfNodes () {
        return count;
    }

    public T getNodeWithIndex (int index) {
        current = head;
        if (index <= count ) {
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            System.err.println("There are only "+ count + " elements");
        }
        return current.value;
    }

    public void remove (int index) {
        current = head;
        Node<T> before;
        if (index <= count ) {
            for (int i = 0; i < index-1; i++) {
                current = current.next;
            }
            before = current;
            before.next = current.next.next;
            count--;
        } else {
            System.err.println("There are only " + count + " elements");
        }
    }

    public void reverse () {
        Node<T> previous = null;
        Node<T> current = head;
        head = tail;
        Node<T> following;
        for (int i = 0; i < count; i++) {
            following = current.next;
            current.next = previous;
            previous = current;
            current = following;
        }
        head = previous;
    }
}
>>>>>>> f61609cceab18ed14498ec1a6483292a3ac53f5c
