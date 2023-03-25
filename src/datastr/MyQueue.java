package datastr;

//I was stuck with enqueue() and dequeue(), so I was using this website
//https://www.geeksforgeeks.org/queue-linked-list-implementation/

//TODO checks

public class MyQueue<T> {
    MyNodeQ frontNode;
    MyNodeQ rearNode;
    int length;

    public MyNodeQ getFrontNode() {
        return frontNode;
    }
    public MyNodeQ getRearNode() {
        return rearNode;
    }

    public void setFrontNode(MyNodeQ inputFrontNode) {
        frontNode = inputFrontNode;
    }
    public void setRearNode(MyNodeQ inputRearNode) {
        rearNode = inputRearNode;
    }

    public MyQueue(){
        setFrontNode(null);
        setRearNode(null);
        length = 0;
    }

    public boolean isFull(){
        try {
            MyQueue temp = new MyQueue();
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
    public void enqueue(MyNodeQ element) throws Exception {
        if(isFull()){
            throw (new Exception("The queue is full"));
        }
        MyNodeQ temp = new MyNodeQ(element);
        if (rearNode == null) {
            setFrontNode(temp);
            setRearNode(temp);
        }
        rearNode.setNext(temp);
        setRearNode(temp);
        length++;
    }
    public void dequeue() throws Exception {
        if (isEmpty()) {
            throw (new Exception("The queue is empty"));
        }
//        MyNodeQ temp = getFrontNode();
        setFrontNode(frontNode.getNext());
        if (isEmpty())
            setRearNode(null);
        length--;
    }
    public void print() throws Exception {
        if (frontNode != null){
            MyNodeQ temp = frontNode;
            while(temp != null){
                System.out.print(temp + " ");
                temp = temp.getNext();
            }
            System.out.println();
        } else {
            throw (new Exception("Nothing to print, the queue is empty"));
        }
    }
    public void delete() throws Exception {
        if(!isEmpty()){
            while(length > 0){
                dequeue();
            }
            length = 0;
        } else {
            throw (new Exception("Nothing to delete, the queue is empty"));
        }
    }

}
