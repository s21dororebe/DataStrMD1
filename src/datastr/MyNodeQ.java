package datastr;

public class MyNodeQ<T> {
    private T data; //mainīgais, kurā glabājas vērtība
    private MyNodeQ next; //norāde uz nākamo elementu

    //GETTERS
    public T getData() {
        return data;
    }
    public MyNodeQ getNext() {
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
    public void setNext(MyNodeQ inputNext) throws Exception {
        if(inputNext!=null){
            next = inputNext;
        } else {
            throw (new Exception("The input element is null"));
        }
    }
    //CONSTRUCTORS
    //argument constructor
    public MyNodeQ(T data){
        setData(data);
    }
    //TOSTRING
    @Override
    public String toString(){
        return "" + data;
    }

}
