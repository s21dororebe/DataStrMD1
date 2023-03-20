package datastr;

public class MyNodeS<T> {
    T data; //mainīgais, kurā glabājas vērtība
    MyNodeS next; //norāde uz nākamo elementu
    T previous; //mainīgais kā norāde uz iepriekšējo mezglu

    //GETTERS
    public T getData() {
        return data;
    }
    public MyNodeS getNext() {
        return next;
    }
    public T getPrevious() {
        return previous;
    }
    //SETTERS
    public void setData(T data) {
        this.data = data;
    }
    public void setNext(MyNodeS next) {
        this.next = next;
    }
    public void setPrevious(T previous) {
        this.previous = previous;
    }
    //CONSTRUCTORS
    //argument constructor
    MyNodeS(T data){
        setData(data);
        next = null;
        previous = null;
    }
    //TOSTRING
    @Override
    public String toString() {
        return "MyNodeS{" +
                "data=" + data +
                ", next=" + next +
                ", previous=" + previous +
                '}';
    }

}
