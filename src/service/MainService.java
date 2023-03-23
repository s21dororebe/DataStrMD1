package service;

import datastr.MyNodeS;
import datastr.MyStack;

import model.Student;
import model.Faculty;

public class MainService {
    public static void main(String[] args) throws Exception {
        MyNodeS number1 = new MyNodeS(20);
        MyNodeS number2 = new MyNodeS(30);
        MyNodeS number3 = new MyNodeS(40);
        MyNodeS number4 = new MyNodeS(50);
        MyNodeS number5 = new MyNodeS(60);
        MyStack numbers = new MyStack();

        Student st1 = new Student("Rebeka", "Tretjaka", Faculty.ITF, "300832-21656");
        Student st2 = new Student("Ieva", "Berzina", Faculty.EPF, "220565-32565");
        Student st3 = new Student("Elza", "Janina", Faculty.TSF, "025630-36484");
        MyNodeS student1 = new MyNodeS(st1);
        MyNodeS student2 = new MyNodeS(st2);
        MyNodeS student3 = new MyNodeS(st3);
        MyStack <Student> students = new MyStack<>();
        try {
            System.out.println("Stack with numbers");
            System.out.println("top(): " + numbers.top() + ", count of elements: " + numbers.howManyElements());
            System.out.println("Is this stack full? ==> " + numbers.isFull());
            System.out.println("Is this stack empty? ==> " + numbers.isEmpty());
            System.out.println("Adding new elements:");

            numbers.push(number1);
            numbers.print(); // 20
            System.out.println("top(): " + numbers.top() + ", count of elements: " + numbers.howManyElements());

            numbers.push(number2);
            numbers.print(); //20 30
            System.out.println("top(): " + numbers.top() + ", count of elements: " + numbers.howManyElements());

            numbers.push(number3);
            numbers.print(); // 20 30 40
            System.out.println("top(): " + numbers.top() + ", count of elements: " + numbers.howManyElements());

            numbers.push(number4);
            numbers.print(); // 20 30 40 50
            System.out.println("top(): " + numbers.top() + ", count of elements: " + numbers.howManyElements());

            numbers.push(number5);
            numbers.print(); // 20 30 40 50 60
            System.out.println("top(): " + numbers.top() + ", count of elements: " + numbers.howManyElements());
            System.out.println("Is this stack full? ==> " + numbers.isFull());

            System.out.println("Pop element:");
            numbers.pop();
            numbers.print(); // 30 40 50 60
            System.out.println("top(): " + numbers.top() + ", count of elements: " + numbers.howManyElements());
            numbers.pop();
            numbers.print(); //40 50 60
            System.out.println("top(): " + numbers.top() + ", count of elements: " + numbers.howManyElements());
            System.out.println("Delete stack:");
            numbers.delete();
            System.out.println("top(): " + numbers.top() + ", count of elements: " + numbers.howManyElements());
            System.out.println("Is this stack empty? ==> " + numbers.isEmpty());

            System.out.println("Stack with students");
            System.out.println("top(): " + students.top() + ", count of elements: " + students.howManyElements());
            System.out.println("Is this stack full? ==> " + students.isFull());
            System.out.println("Is this stack empty? ==> " + students.isEmpty());
            System.out.println("Adding new elements:");

            students.push(student1);
            students.print();
            System.out.println("top(): "  + students.top() + ", count of elements: " + students.howManyElements());

            students.push(student2);
            students.print();
            System.out.println("top(): " + students.top() + ", count of elements: " + students.howManyElements());

            students.push(student3);
            students.print();
            System.out.println("top(): " + students.top() + ", count of elements: " + students.howManyElements());

            System.out.println("Pop element:");
            students.pop();
            students.print();
            System.out.println("top(): " + students.top() + ", count of elements: " + students.howManyElements());
            students.pop();
            students.print();
            System.out.println("top(): " + students.top() + ", count of elements: " + students.howManyElements());
            System.out.println("Delete stack:");
            students.delete();
            System.out.println("top(): " + students.top() + ", count of elements: " + students.howManyElements());
            System.out.println("Is this stack empty? ==> " + students.isEmpty());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
