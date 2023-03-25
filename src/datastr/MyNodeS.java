package datastr;

public class MyNodeS<T> {
    private T data; //mainīgais, kurā glabājas vērtība
    private MyNodeS next; //norāde uz nākamo elementu
    //GETTERS
    public T getData() {
        return data;
    }
    public MyNodeS getNext() {
        return next;
    }
    //SETTERS
    public void setData(T inputData) {
        if(inputData!=null){
            data = inputData;
        } else {
            data = (T) new Object();
        }
    }
    public void setNext(MyNodeS inputNext) throws Exception {
        if(inputNext!=null){
            next = inputNext;
        } else {
            throw (new Exception("The input element is null"));
        }
    }
    //CONSTRUCTORS
    //argument constructor
    public MyNodeS(T data){
        setData(data);
    }
    //TOSTRING
    @Override
    public String toString(){
        return "" + data;
    }
}
