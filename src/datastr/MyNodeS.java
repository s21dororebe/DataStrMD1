package datastr;

public class MyNodeS<T> {
    private T data; //mainīgais, kurā glabājas vērtība
    private MyNodeS next = null; //norāde uz nākamo elementu
    private MyNodeS previous = null; //mainīgais kā norāde uz iepriekšējo mezglu

    //GETTERS
    public T getData() {
        return data;
    }
    public MyNodeS getNext() {
        return next;
    }
    public MyNodeS getPrevious() {
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
    public void setNext(MyNodeS inputNext) {
        next = inputNext;
    }
    public void setPrevious(MyNodeS inputPrevious) {
        previous = inputPrevious;
    }
    //CONSTRUCTORS
    //argument constructor
    MyNodeS(T data){
        setData(data);
    }
    //TOSTRING
    @Override
    public String toString(){
        return "" + data;
    }

}
