package datastr;

import java.util.Arrays;

public class MyStack<T> {
    //TODO length pielietot push() un pop() funkcijās)

    private MyNodeS topNode;
    private int length = 0;

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
    MyStack(){
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

//    Izveidot print() funkciju, kas izprintē steka elementus;
//    Izveidot funkciju, kas veic steka iztukšošanu;

    public void push(MyNodeS inputElement) throws Exception {
        if(!isFull()){
            topNode.setNext(new MyNodeS<>(topNode));
            setTopNode(inputElement);
        } else {
            throw (new Exception("The stack is full"));
        }
    }
    public MyNodeS pop() throws Exception {
        if(!isEmpty()){
            MyNodeS temp = topNode;
            topNode = topNode.getNext();
            return temp;
        } else {
            throw (new Exception("Nothing to pop, the stack is empty"));
        }
    }
    /*
    * The following table shows the different values of the top.
    * -1  ... it shows the stack is empty
    * 0   ... the stack has only one element
    * N-1 ... the stack is full
    * N   ... the stack is overflow
    * */
    public int top() {
        if(!isEmpty()){
            return -1;
        } else if(length == 1){
            return 0;
        } else if(isFull()){
            return length-1;
        } else {
            return length;
        }
    }
    public void print() throws Exception {
        if(!isEmpty()){
            MyNodeS temp = topNode;
            for (int i = 0; i < length; i++){
                System.out.print(temp + " ");
                temp = temp.getNext();
            }
        } else {
            throw (new Exception("Nothing to print, the stack is empty"));
        }

    }
    public void delete() throws Exception {
        if(!isEmpty()){
            while(!isEmpty()){
                pop();
            }
        } else {
            throw (new Exception("Nothing to delete, the stack is empty"));
        }
    }

}
