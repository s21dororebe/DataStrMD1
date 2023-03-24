package datastr;

/*
* Elementi tiek pievienot aizmugurē (rear);
* Elementi tiek izņemti no priekšpuses (front)
* */

public class MyQueue <T> {
    MyNodeQ frontNode;
    MyNodeQ rearNode;
    int length = -1;

    public MyNodeQ getFrontNode() {
        return frontNode;
    }
    public MyNodeQ getRearNode() {
        return rearNode;
    }
    public int getLength() {
        return length;
    }

    //delete from front
    public void setFrontNode(MyNodeQ frontNode) {
        this.frontNode = frontNode;
    }
    //add from rear
    public void setRearNode(MyNodeQ rearNode) {
        this.rearNode = rearNode;
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
        return length == 0;
    }
    public int howManyElements(){
        return length;
    }

    public void enqueue(MyNodeQ inputElement) throws Exception {
        if(!isFull()){
            if(isEmpty()) {
                setFrontNode(inputElement);
                setRearNode(inputElement);
                length++;
            } else {
                setRearNode(inputElement);
                frontNode.setNext(getRearNode());
                length++;
            }
        } else {
            throw (new Exception("The stack is full"));
        }
    }
    public void dequeue() throws Exception {
        if(!isEmpty()){
            MyNodeQ temp = frontNode;
            frontNode = frontNode.getNext();
            length--;
        } else {
            throw (new Exception("Nothing to pop, the stack is empty"));
        }
    }
    public void print() throws Exception {
        if(length > 0){
            MyNodeQ temp = getFrontNode();
            for(int i = 0; i < length; i++){
                System.out.print(temp + " ");
                temp = temp.getNext();
            }
            System.out.println();
        } else {
            throw (new Exception("Nothing to print, the stack is empty"));
        }
    }
    public void delete() throws Exception {
        if(!isEmpty()){
            while(length > 0){
                dequeue();
            }
            length = 0;
        } else {
            throw (new Exception("Nothing to delete, the stack is empty"));
        }
    }
}
