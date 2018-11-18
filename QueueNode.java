package linkedLists;

/**
 * Class to implement one node of a singly-linked list queue
 * */
public class QueueNode <E>
{
   /**
    * Each QueueNode has a data field of type E
    * and a next field to support a singly-linked list
    */
   private E data;
   private QueueNode next;

   /**
    * The default constructor sets the data and next fields to null
    */
   public QueueNode ()
   {
      data = null;
      next = null;
   }

   /**
    * An alternative constructor has both data and next parameters
    */
   public QueueNode (E origData, QueueNode origNext)
   {
      data = origData;
      next = origNext;
   }

   //getters and setters
   /**
    * return data field of the QueueNode
    * */
   public E getData() {
	   return data;
   }

   /**
    * sets data field of the QueueNode
    * */
   public void setData(E data) {
	   this.data = data;
   }

   /**
    * return next field of the QueueNode
    * */
   public QueueNode getNext() {
	   return next;
   }

   /**
    * sets next field of the QueueNode
    * */
   public void setNext(QueueNode next) {
	   this.next = next;
   }
}
