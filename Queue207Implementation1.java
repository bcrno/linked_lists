package linkedLists;

import java.util.NoSuchElementException;

public class Queue207Implementation1<E> implements Queue207<E> {
	
	protected static QueueNode head;
	protected QueueNode tail;
	protected int numberItems;
	
	public Queue207Implementation1 () {
		head = null;
		tail = null;
		numberItems = 0;
	}
	

	 /**
     * inserts the specified element e into this queue,
     * if it is possible to do so
     * @param e   the element to add
     * @returns true upon success
     * @throws NullPointerException if e is null
     */
	@SuppressWarnings("unchecked")
	public boolean add (E e) {
		if (e == null) {
			throw new NullPointerException ();
		}
		else {
			QueueNode newNode = new QueueNode(e, null);
			tail.setNext(newNode);
			tail = newNode;

			if (head == null) {
				head = newNode;
			}
			numberItems++;	
			return true;

		}
	}

    /**
     * retrieves and removes the head of this queue
     * @returns the head of this queue
     * @throws NoSuchElementException  if this queue is empty
     */
	@SuppressWarnings("unchecked")
    public E remove () throws NoSuchElementException {
    
    	if (head == null) {
    		throw new NoSuchElementException();
    	}
    	else {
    		@SuppressWarnings("rawtypes")
    		QueueNode oldHead = head;
    		head.setNext(head.getNext());
    		return (E) oldHead.getData();
    	}
}

    /**
     * retrieves, but does not remove, the head of this queue
     * @returns the head of this queue
     * @throws NoSuchElementException  if this queue is empty
     */
    public E element () throws NoSuchElementException {
    	return (E) head.getData();
    }

    /** 
     * returns the number of elements in this queue
     */
    public int size() {
    	return numberItems;
    }
    
    @SuppressWarnings("rawtypes")
    public static void printQueue(Queue207Implementation1 queue) {
    	QueueNode curr;
    	curr = head;
    	while (curr != null){
    		System.out.println(queue.element());
    		curr.setNext(curr.getNext());
    	}
    }
    
    public static void main (String args []) {
    	Queue207Implementation1 queue1 = new Queue207Implementation1 ();
    	queue1.add(5);
    	queue1.add(7);
    	queue1.add(1);
    	
    	printQueue(queue1);
    	
    }

}
