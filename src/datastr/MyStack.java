package datastr;

public class MyStack {
    //TODO length pielietot push() un pop() funkcijās)

    MyNodeS topNode;
    int length;

    //GETTERS
    public MyNodeS getTopNode() {
        return topNode;
    }
    public int getLength() {
        return length;
    }
    //SETTERS
    public void setTopNode(MyNodeS topNode) {
        this.topNode = topNode;
    }
    public void setLength(int length) {
        this.length = length;
    }
    //CONSTRUCTORS
    //no argument constructor
    MyStack(){
        MyNodeS temp = new MyNodeS<>(0);
        setTopNode(temp);
        setLength(0);
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
//    public boolean isFull(){
//
//    }
    public boolean isEmpty()
    {
        return topNode.getNext() == null;
    }
}
