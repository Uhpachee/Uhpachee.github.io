package LinkedLists2;

import java.util.Iterator;
import LinkedLists2.LinkedList;

    class QueueIterator<T> implements Iterator<T> {
        LinkedList<T> current;  // current element in iteration

        // QueueIterator is intended to the head of the list for iteration
        public QueueIterator(Queue<T> q) {
            current = q.getHead();
        }

        // hasNext informs if next element exists
        public boolean hasNext() {
            return current != null;
        }

        // next returns data object and advances to next position in queue
        public T next() {
            T data = current.getData();
            current = current.getNext();
            return data;
        }
    }

