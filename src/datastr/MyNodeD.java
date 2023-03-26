package datastr;

public class MyNodeD<T> {
    private T data;
    private MyNodeD next;
    private MyNodeD previous;

    //GETTERS
    public T getData() {
        return data;
    }
    public MyNodeD getNext() {
        return next;
    }
    public MyNodeD getPrevious() {
        return previous;
    }
    //SETTERS
    public void setData(T inputData) {
        if(inputData!=null){
            data = inputData;
        } else {
            data = (T) new Object();
        }
    }
    public void setNext(MyNodeD inputNext) throws Exception {
        next = inputNext;
    }
    public void setPrevious(MyNodeD inputPrevious)  {
        previous = inputPrevious;
    }
    //CONSTRUCTORS
    //argument constructor
    public MyNodeD(T data) {
        setData(data);
        previous = null;
        next = null;
    }
    //TOSTRING
    @Override
    public String toString(){
        return "" + data;
    }
}
