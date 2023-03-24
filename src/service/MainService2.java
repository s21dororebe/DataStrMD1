package service;

import datastr.MyNodeQ;
import datastr.MyQueue;
import model.Faculty;
import model.Student;

public class MainService2 {
    public static void main(String[] args) {
        MyNodeQ number1 = new MyNodeQ(20);
        MyNodeQ number2 = new MyNodeQ(30);
        MyNodeQ number3 = new MyNodeQ(40);
        MyNodeQ number4 = new MyNodeQ(50);
        MyNodeQ number5 = new MyNodeQ(60);
        MyQueue numbers = new MyQueue();

        Student st1 = new Student("Rebeka", "Tretjaka", Faculty.ITF, "300832-21656");
        Student st2 = new Student("Ieva", "Berzina", Faculty.EPF, "220565-32565");
        Student st3 = new Student("Elza", "Janina", Faculty.TSF, "025630-36484");
        MyNodeQ student1 = new MyNodeQ(st1);
        MyNodeQ student2 = new MyNodeQ(st2);
        MyNodeQ student3 = new MyNodeQ(st3);
        MyQueue <Student> students = new MyQueue<>();
        try {
            System.out.println("Stack with numbers");
            System.out.println("count of elements: " + numbers.howManyElements());
            System.out.println("Is this stack full? ==> " + numbers.isFull());
            System.out.println("Is this stack empty? ==> " + numbers.isEmpty());
            System.out.println("Adding new elements:");

            numbers.enqueue(number1);
            numbers.print(); // 20
            System.out.println("count of elements: " + numbers.howManyElements());

            numbers.enqueue(number2);
            numbers.print(); //20 30
            System.out.println("count of elements: " + numbers.howManyElements());

            numbers.enqueue(number3);
            numbers.print(); // 20 30 40
            System.out.println("count of elements: " + numbers.howManyElements());

            numbers.enqueue(number4);
            numbers.print(); // 20 30 40 50
            System.out.println("count of elements: " + numbers.howManyElements());

            numbers.enqueue(number5);
            numbers.print(); // 20 30 40 50 60
            System.out.println("count of elements: " + numbers.howManyElements());
            System.out.println("Is this stack full? ==> " + numbers.isFull());

            System.out.println("Pop element:");
            numbers.dequeue();
            numbers.print(); // 30 40 50 60
            System.out.println("count of elements: " + numbers.howManyElements());
            numbers.dequeue();
            numbers.print(); //40 50 60
            System.out.println("count of elements: " + numbers.howManyElements());
            System.out.println("Delete stack:");
            numbers.delete();
            System.out.println("count of elements: " + numbers.howManyElements());
            System.out.println("Is this stack empty? ==> " + numbers.isEmpty());

            System.out.println("Stack with students");
            System.out.println("count of elements: " + students.howManyElements());
            System.out.println("Is this stack full? ==> " + students.isFull());
            System.out.println("Is this stack empty? ==> " + students.isEmpty());
            System.out.println("Adding new elements:");

            students.enqueue(student1);
            students.print();
            System.out.println("count of elements: " + students.howManyElements());

            students.enqueue(student2);
            students.print();
            System.out.println("count of elements: " + students.howManyElements());

            students.enqueue(student3);
            students.print();
            System.out.println("count of elements: " + students.howManyElements());

            System.out.println("Pop element:");
            students.dequeue();
            students.print();
            System.out.println("count of elements: " + students.howManyElements());
            students.dequeue();
            students.print();
            System.out.println("count of elements: " + students.howManyElements());
            System.out.println("Delete stack:");
            students.delete();
            System.out.println("count of elements: " + students.howManyElements());
            System.out.println("Is this stack empty? ==> " + students.isEmpty());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
