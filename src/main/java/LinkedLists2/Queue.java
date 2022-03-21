package LinkedLists2;
import LinkedLists2.LinkedList;
import java.util.Iterator;

/**
 * Queue: custom implementation
 * @author     John Mortensen
 *
 * 1. Uses custom LinkedList of Generic type T
 * 2. Implements Iterable
 * 3. "has a" LinkedList for head and tail
 */


public class Queue<T> implements Iterable<T> {
    LinkedList<T> head, tail;

    /**
     *  Add a new object at the end of the Queue,
     *
     * @param  data,  is the data to be inserted in the Queue.
     */
    public void add(T data) {
        // add new object to end of Queue
        LinkedList<T> tail = new LinkedList<>(data, null);

        if (head == null)  // initial condition
            this.head = this.tail = tail;
        else {  // nodes in queue
            this.tail.setNextNode(tail); // current tail points to new tail
            this.tail = tail;  // update tail
        }
    }

    public void delete() {
        // System.out.println("Delete: " + this.head.getData());
        if (this.head == null) {
            return;
        }
        LinkedList<T> head = this.head.getNext();
        if (head == null) {
            this.head = this.tail = null;
            return;
        }
        head.setPrevNode(null);
        this.head.setNextNode(null);
        this.head = head;

        /**if (this.head != null) {
                this.head.setNextNode(this.head); //this line makes an infinitely recursive loop for some reason if you don't set head to something immediately after
                System.out.println(this.head.getData());
                System.out.println("head: " + this.head.getData() + "\nnext: " + this.head.getNext().getData());
                this.head = null;
                System.out.println("head not null");
            } else {
                System.out.println("head null");
                head.setNextNode(this.head);
                head = null;
            }**/
    }

    /**
     *  Returns the head object.
     *
     * @return  this.head, the head object in Queue.
     */
    public LinkedList<T> getHead() {
        return this.head;
    }

    /**
     *  Returns the tail object.
     *
     * @return  this.tail, the last object in Queue
     */
    public LinkedList<T> getTail() {
        return this.tail;
    }

    /**
     *  Returns the iterator object.
     *
     * @return  this, instance of object
     */
    public Iterator<T> iterator() {
        return new QueueIterator<>(this);
    }
}




