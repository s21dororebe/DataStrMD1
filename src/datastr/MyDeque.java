package datastr;

public class MyDeque<T> {
    private MyNodeD frontNode;
    private MyNodeD rearNode;
    private int length;

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

    public void enqueueAtFront(MyNodeD element) throws Exception {
        if(isFull()){
            throw (new Exception("The deque is full"));
        } else {
            MyNodeD newNode = new MyNodeD(element);
            if(element == null){
                throw (new Exception("The input element is null"));
            } else {
                if(frontNode == null){
                    setFrontNode(newNode);
                    setRearNode(newNode);
                } else {
                    newNode.setNext(getFrontNode());
                    frontNode.setPrevious(newNode);
                    setFrontNode(newNode);
                }
                length++;
            }
        }
    }
    public void enqueueAtEnd(MyNodeD element) throws Exception {
        if(isFull()){
            throw (new Exception("The deque is full"));
        } else {
            MyNodeD newNode = new MyNodeD(element);
            if(element == null){
                throw (new Exception("The input element is null"));
            } else {
                if(rearNode == null){
                    setFrontNode(newNode);
                    setRearNode(newNode);
                } else {
                    newNode.setPrevious(rearNode);
                    rearNode.setNext(newNode);
                    setRearNode(newNode);
                }
                length++;
            }
        }
    }
    public void dequeueFromFront() throws Exception {
        if (isEmpty())
            throw (new Exception("The deque is empty"));
        else {
            MyNodeD temp = getFrontNode();
            setFrontNode(frontNode.getNext());
            if (frontNode == null)
                setRearNode(null);
            else
                frontNode.setPrevious(null);
            length--;
        }
    }
    public void dequeueFromEnd() throws Exception {
        if (isEmpty())
            throw (new Exception("The deque is empty"));
        else {
            MyNodeD temp = getRearNode();
            setRearNode(rearNode.getPrevious());
            if (rearNode == null)
                setFrontNode(null);
            else
                rearNode.setNext(null);
            length--;
        }

    }
    public void print() throws Exception {
        if (!isEmpty()){
            MyNodeD temp = frontNode;
            int tempLength = length;
            while(tempLength > 0){
                System.out.println(temp);
                temp = temp.getNext();
                tempLength--;
            }
        } else {
            throw (new Exception("Nothing to print, the queue is empty"));
        }
    }
    public void delete() throws Exception {
        if(!isEmpty()){
            setRearNode(null);
            while (frontNode != null) {
                frontNode = frontNode.getNext();
            }
            length = 0;
        } else {
            throw (new Exception("Nothing to delete, the queue is empty"));
        }
    }

}
