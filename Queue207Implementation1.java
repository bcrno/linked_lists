package linkedLists;

import java.util.NoSuchElementException;

/**
 * Class to implement queue using singly-linked list structure
 * */
public class Queue207Implementation1<E> implements Queue207<E> {
	
	protected QueueNode head; //points to the first node in the queue
	protected QueueNode tail; //points to the last node in the queue
	protected int numberItems; //current size of the queue
	
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

			if (head == null && tail == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.setNext(newNode);
				tail = newNode;
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
			head = head.getNext();
			numberItems--;
			return (E) oldHead.getData();
		}
	}

    /**
     * retrieves, but does not remove, the head of this queue
     * @returns the head of this queue
     * @throws NoSuchElementException  if this queue is empty
     */
	public E element () throws NoSuchElementException {
		if (head == null) {
			throw new NoSuchElementException();
		}
		else
			return (E) head.getData();
	}

    /** 
     * Method to return current size of the queue
     * 
     * @return numberItems as an int
     */
    public int size() {
    	return numberItems;
    }

    /**
     * Prints each node in the queue
     * 
     * @param queue		the queue to be printed
     * */
    @SuppressWarnings("rawtypes")
    public void printQueue(Queue207Implementation1 queue) {
    	QueueNode curr;
    	curr = head;
    	while (curr != null){
    		System.out.println(curr.getData());
    		curr = curr.getNext();
    	}
    }
    
    public static void main (String args []) {
    	Queue207Implementation1 queue1 = new Queue207Implementation1 ();
    	
    	queue1.add(5);
    	queue1.add(7);
    	queue1.add(1);
    	queue1.add("String");
    	
    	System.out.println("Print test after adding: ");
    	queue1.printQueue(queue1);
    	
    	System.out.println();
    	System.out.println("Size test after adding: " + queue1.size());
    	
    	queue1.remove();
    	queue1.remove();
    	
    	System.out.println("Print test after removing: ");
    	queue1.printQueue(queue1);
    	
    	System.out.println();
    	System.out.println("Size test after removing: " + queue1.size());
    	
    	System.out.println("Element test: " + queue1.element());
    	
    	queue1.remove();
    	queue1.remove();
    	
    	System.out.println("Print test on empty queue: ");
    	queue1.printQueue(queue1);
    	
    	System.out.println();
    	System.out.println("Size test on empty queue: " + queue1.size());
    	
    	//tests that throw exceptions
    	System.out.println("removing on empty queue test:");
    	queue1.remove();
    
    	System.out.println("adding null test:");
    	queue1.add(null);
    	
    	System.out.println("Element test on empty queue: " + queue1.element());
    	
    	
    }

}
