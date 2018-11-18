package linkedLists;

public class QueueNode <E>
{
   /**
    * Each QueueNode has a data field of type E
    * and a next field to support a singly-linked list
    */
   private E data;
   private QueueNode next;

   /**
    * The default construtor sets the data and next fields to null
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
   public E getData() {
	   return data;
   }

   public void setData(E data) {
	   this.data = data;
   }

   public QueueNode getNext() {
	   return next;
   }

   public void setNext(QueueNode next) {
	   this.next = next;
   }


}
