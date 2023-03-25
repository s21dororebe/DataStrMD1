package datastr;

//TODO checks (if not null)

public class MyDeque<T> {
    MyNodeD frontNode;
    MyNodeD rearNode;
    int length;

    public MyNodeD getFrontNode() {
        return frontNode;
    }
    public MyNodeD getRearNode() {
        return rearNode;
    }
    public void setFrontNode(MyNodeD inputFrontNode) {
        frontNode = inputFrontNode;
    }
    public void setRearNode(MyNodeD inputRearNode) {
        rearNode = inputRearNode;
    }
    public MyDeque(){
        setFrontNode(null);
        setRearNode(null);
        length = 0;
    }

    public boolean isFull(){
        try {
            MyDeque temp = new MyDeque();
            return false;
        } catch (OutOfMemoryError e){
            return true;
        }
    }
    public boolean isEmpty(){
        return frontNode == null;
    }
    public int howManyElements(){
        return length;
    }

    /*
     * Insertion at Front end : (enqueueAtFront)
     * 1. Allocate space for a newNode of doubly linked list.
     * 2. IF newNode == NULL, then
     * 3.     print "Overflow"
     * 4. ELSE
     * 5.     IF front == NULL, then
     * 6.         rear = front = newNode
     * 7.     ELSE
     * 8.         newNode->next = front
     * 9.       front->prev = newNode
     * 10.        front = newNode
     * */
    public void enqueueAtFront(MyNodeD element) throws Exception {
        if(isFull()){
            throw (new Exception("The deque is full"));
        }
        if(element == null){
            throw (new Exception("The input element is null"));
        }
        if(frontNode == null){
            setFrontNode(element);
            setRearNode(element);
        } else {
            element.setNext(getFrontNode());
            frontNode.setPrevious(element);
            setFrontNode(element);
        }
        length++;

    }
    /*
     * Insertion at Rear end :
     * 1. Allocate space for a newNode of doubly linked list.
     * 2. IF newNode == NULL, then
     * 3.     print "Overflow"
     * 4. ELSE
     * 5.     IF rear == NULL, then
     * 6.         front = rear = newNode
     * 7.     ELSE
     * 8.         newNode->prev = rear
     * 9.       rear->next = newNode
     * 10.        rear = newNode
     * */
    public void enqueueAtEnd(MyNodeD element) throws Exception {
        if(isFull()){
            throw (new Exception("The deque is full"));
        }
        if(element == null){
            throw (new Exception("The input element is null"));
        }
        if(rearNode == null){
            setFrontNode(element);
            setRearNode(element);
        } else {
            element.setPrevious(rearNode);
            rearNode.setNext(element);
            setRearNode(element);
        }
        length++;
    }
    /*
    * Deletion from Front end :
    * 1. IF front == NULL
    * 2.     print "Underflow"
    * 3. ELSE
    * 4.     Initialize temp = front
    * 5.     front = front->next
    * 6.     IF front == NULL
    * 7.         rear = NULL
    * 8.     ELSE
    * 9.         front->prev = NULL
    * 10     Deallocate space for temp
    * */
    public void dequeueFromFront() throws Exception {
        if (isEmpty()) {
            throw (new Exception("The deque is empty"));
        }
        if(frontNode == null){
            throw (new Exception("The input element is null"));
        }
        setFrontNode(frontNode.getNext());
        if(frontNode == null){
            setRearNode(null);
        } else {
            frontNode.setPrevious(null);
        }
        length--;
    }
    /*
    * Deletion from Rear end :
    * 1. IF front == NULL
    * 2.     print "Underflow"
    * 3. ELSE
    * 4.     Initialize temp = rear
    * 5.     rear = rear->prev
    * 6.     IF rear == NULL
    * 7.         front = NULL
    * 8.     ELSE
    * 9.         rear->next = NULL
    * 10     Deallocate space for temp
    * */
    public void dequeueFromEnd() throws Exception {
        if (isEmpty()) {
            throw (new Exception("The deque is empty"));
        }
        if(frontNode == null){
            throw (new Exception("The input element is null"));
        }
            setRearNode(rearNode.getPrevious());
            if(rearNode == null){
                setFrontNode(null);
            } else {
                rearNode.setNext(null);
            }
            length--;

    }
    public void print() throws Exception {
        if (!isEmpty()){
            MyNodeD temp = frontNode;
            int tempLength = length;
            while(tempLength > 0){
                System.out.print(temp + " ");
                temp = temp.getNext();
                tempLength--;
            }
            System.out.println();
        } else {
            throw (new Exception("Nothing to print, the queue is empty"));
        }
    }
    public void delete() throws Exception {
        if(!isEmpty()){
            setRearNode(null);
            while (frontNode != null) {
                MyNodeD temp = frontNode;
                frontNode = frontNode.getNext();
            }
            length = 0;
        } else {
            throw (new Exception("Nothing to delete, the queue is empty"));
        }
    }

}
