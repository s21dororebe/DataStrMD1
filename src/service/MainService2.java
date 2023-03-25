package service;

import datastr.MyNodeQ;
import datastr.MyQueue;
import model.Faculty;
import model.Student;

//TODO stylize the output code
//TODO try catch

/*
* TODO
* Papildināt MainService klasi, uzrakstot funkciju,
* kurā tiek ģenerēti telefona numuri un tiek simulēta zvanīšana avārijas dienestam.
* Katrs zvans (telefona numurs) tiek ievietots rindā un gaida savu kārtu, lai tiktu izpildīts.
* Telefona numura ievietošanas un izņemšanas laiku būtu vēlams ģenerēt, izmantojot Thread.sleep() funkciju,
* tādējādi simulējot atšķirīgu laiku gan zvana pienākšanai, gan zvana apkalpošanai (0.5 balles);
* */

public class MainService2 {
    public static void main(String[] args) throws Exception {
        MyQueue numbers = new MyQueue();
        MyNodeQ number1 = new MyNodeQ(10);
        MyNodeQ number2 = new MyNodeQ(20);
        MyNodeQ number3 = new MyNodeQ(30);
        MyNodeQ number4 = new MyNodeQ(40);
        MyNodeQ number5 = new MyNodeQ(50);
//        System.out.println("dequeue");
//        numbers.dequeue();
        System.out.print("enqueue number1");
        numbers.enqueue(number1);
        System.out.println();
        System.out.print("enqueue number2");
        numbers.enqueue(number2);
        System.out.println();
        numbers.print();
        System.out.println("How many elements: " + numbers.howManyElements());
        System.out.print("dequeue number1");
        numbers.dequeue();
        System.out.println();
        numbers.print();
        System.out.print("enqueue number 3, 4, 5");
        numbers.enqueue(number3);
        numbers.enqueue(number4);
        numbers.enqueue(number5);
        System.out.println();
        numbers.print();
        System.out.println("How many elements: " + numbers.howManyElements());
        System.out.print("dequeue number2");
        numbers.dequeue();
        System.out.println();
        numbers.print();
        System.out.println("How many elements: " + numbers.howManyElements());
        System.out.println("Queue Front : " + ((numbers.getFrontNode() != null) ? (numbers.getFrontNode()).getData() : -1));
        System.out.println("Queue Rear : " + ((numbers.getRearNode() != null) ? (numbers.getRearNode()).getData() : -1));
        System.out.println("Delete");
        numbers.delete();
        System.out.println("How many elements: " + numbers.howManyElements());

        MyQueue students = new MyQueue();
        Student st1 = new Student("Rebeka", "Tretjaka", Faculty.ITF, "300832-21656");
        Student st2 = new Student("Ieva", "Berzina", Faculty.EPF, "220565-32565");
        Student st3 = new Student("Elza", "Janina", Faculty.TSF, "025630-36484");
        MyNodeQ student1 = new MyNodeQ(st1);
        MyNodeQ student2 = new MyNodeQ(st2);
        MyNodeQ student3 = new MyNodeQ(st3);
        System.out.print("enqueue student1");
        students.enqueue(student1);
        System.out.println();
        System.out.print("enqueue student2");
        students.enqueue(student2);
        System.out.println();
        students.print();
        System.out.println("How many elements: " + students.howManyElements());
        System.out.print("dequeue student1");
        students.dequeue();
        System.out.println();
        students.print();
        System.out.print("enqueue student3");
        students.enqueue(student3);
        System.out.println();
        students.print();
        System.out.println("How many elements: " + students.howManyElements());
        System.out.print("dequeue student2");
        students.dequeue();
        System.out.println();
        students.print();
        System.out.println("How many elements: " + students.howManyElements());
        System.out.println("Queue Front : " + ((students.getFrontNode() != null) ? (students.getFrontNode()).getData() : -1));
        System.out.println("Queue Rear : " + ((students.getRearNode() != null) ? (students.getRearNode()).getData() : -1));
        System.out.println("Delete");
        students.delete();
        System.out.println("How many elements: " + students.howManyElements());

    }
}
