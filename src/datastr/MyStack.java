package datastr;

public class MyStack<T> {
    private MyNodeS topNode;
    private int length = -1;

    //GETTERS
    public MyNodeS getTopNode() {
        return topNode;
    }
    public int getLength() {
        return length;
    }
    //SETTERS
    public void setTopNode(MyNodeS inputTopNode) {
        topNode = inputTopNode;
    }
    //CONSTRUCTORS
    //no argument constructor
    public MyStack(){
        MyNodeS topNode = new MyNodeS<>(null);
        length++;
    }
    //TOSTRING
    @Override
    public String toString() {
        return "MyStack{" +
                "topNode=" + topNode +
                ", length=" + length +
                '}';
    }
    //OTHER FUNCTIONS
    public boolean isFull(){
        try {
            MyStack temp = new MyStack();
            return false;
        } catch (OutOfMemoryError e){
            throw new OutOfMemoryError("Unable to allocate more memory for the stack");
        }
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public int howManyElements(){
        return length;
    }

    public void push(MyNodeS inputElement) throws Exception {
        if(!isFull()){
            if(isEmpty()) {
                setTopNode(inputElement);
                length++;
            } else {
                MyNodeS newElement = new MyNodeS<>(inputElement);
                newElement.setNext(topNode);
                setTopNode(newElement);
                length++;
            }
        } else {
            throw (new Exception("The stack is full"));
        }
    }
    public MyNodeS pop() throws Exception {
        if(!isEmpty()){
            MyNodeS temp = topNode;
            topNode = topNode.getNext();
            length--;
            return temp;
        } else {
            throw (new Exception("Nothing to pop, the stack is empty"));
        }
    }
    public MyNodeS top() {
        return topNode;
    }
    public void print() throws Exception {
        if(length > 0){
            MyNodeS temp = topNode;
            for (int i = 0; i < length; i++){
                System.out.println(temp + " ");
                temp = temp.getNext();
            }
        } else {
            throw (new Exception("Nothing to print, the stack is empty"));
        }
    }


    public void delete() throws Exception {
        if(!isEmpty()){
            while(length > 0){
                pop();
            }
            length = 0;
        } else {
            throw (new Exception("Nothing to delete, the stack is empty"));
        }
    }

}
