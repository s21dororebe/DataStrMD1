package service;

import datastr.MyNodeQ;
import datastr.MyQueue;
import model.Faculty;
import model.Student;

import java.util.Random;

public class MainService2 {

    public static void main(String[] args) {
        MyQueue numbers = new MyQueue();
        MyNodeQ number1 = new MyNodeQ(10);
        MyNodeQ number2 = new MyNodeQ(20);
        MyNodeQ number3 = new MyNodeQ(30);
        MyNodeQ number4 = new MyNodeQ(40);
        MyNodeQ number5 = new MyNodeQ(50);

        MyQueue students = new MyQueue();
        Student st1 = new Student("Rebeka", "Tretjaka", Faculty.ITF, "300832-21656");
        Student st2 = new Student("Ieva", "Berzina", Faculty.EPF, "220565-32565");
        Student st3 = new Student("Elza", "Janina", Faculty.TSF, "025630-36484");
        MyNodeQ student1 = new MyNodeQ(st1);
        MyNodeQ student2 = new MyNodeQ(st2);
        MyNodeQ student3 = new MyNodeQ(st3);

        try {
        //System.out.println("dequeue");
        //numbers.dequeue();

            System.out.println("Queue with numbers");
            System.out.println("Is this stack full? ==> " + numbers.isFull());
            System.out.println("Is this stack empty? ==> " + numbers.isEmpty());

            System.out.println();
            System.out.print("enqueue number1 and number2");
            numbers.enqueue(number1);
            numbers.enqueue(number2);
            System.out.println();
            printInfo(numbers);

            System.out.print("dequeue");
            numbers.dequeue();
            System.out.println();
            printInfo(numbers);

            System.out.print("enqueue number 3, 4, 5");
            numbers.enqueue(number3);
            numbers.enqueue(number4);
            numbers.enqueue(number5);
            System.out.println();
            printInfo(numbers);

            System.out.print("dequeue");
            numbers.dequeue();
            System.out.println();
            printInfo(numbers);

            System.out.println("Delete");
            numbers.delete();
            System.out.println("How many elements: " + numbers.howManyElements());

            System.out.println();
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println();

            System.out.println("Queue with students");
            System.out.println("Is this stack full? ==> " + students.isFull());
            System.out.println("Is this stack empty? ==> " + students.isEmpty());

            System.out.println();
            System.out.print("enqueue student1 and student2");
            students.enqueue(student1);
            students.enqueue(student2);
            System.out.println();
            printInfo(students);

            System.out.print("dequeue");
            students.dequeue();
            System.out.println();
            printInfo(students);

            System.out.print("enqueue student3");
            students.enqueue(student3);
            printInfo(students);

            System.out.print("dequeue");
            students.dequeue();
            System.out.println();
            printInfo(students);

            System.out.println("Delete");
            students.delete();
            System.out.println("How many elements: " + students.howManyElements());

            System.out.println();
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println();

            System.out.println("Papildfunkcija:");

            MyQueue phoneNumbers = new MyQueue();
            callME(phoneNumbers);
            System.out.println("Phone numbers:");
            phoneNumbers.print();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static void printInfo(MyQueue stackWithElemnts) throws Exception {
        stackWithElemnts.print();
        System.out.println("How many elements: " + stackWithElemnts.howManyElements());
        System.out.println();
    }


    private static final Random rand = new Random();
    public static void callME(MyQueue numbersArray){
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(rand.nextInt(2000));
                int number = generatePhoneNumber();
                MyNodeQ generatedNumber = new MyNodeQ(number);
                System.out.println(generatedNumber);
                numbersArray.enqueue(generatedNumber);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public static int generatePhoneNumber(){
        int result = 2;
        Random rand = new Random();
        for(int i = 0; i < 7; i++){
            double temp = rand.nextDouble() * 9;
            result = result * 10 + (int)temp;
        }
        return result;
    }

    
}



























