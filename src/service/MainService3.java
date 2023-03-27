package service;

//TODO stylize the output code
//TODO try catch

import datastr.MyDeque;
import datastr.MyNodeD;

import java.util.Objects;
import java.util.Scanner;

public class MainService3 {
    public static void main(String[] args) throws Exception {
        /*
        MyDeque numbers = new MyDeque<>();
        MyNodeD number1 = new MyNodeD(10);
        MyNodeD number2 = new MyNodeD(20);
        MyNodeD number3 = new MyNodeD(30);
        MyNodeD number4 = new MyNodeD(40);
        MyNodeD number5 = new MyNodeD(50);

        MyDeque students = new MyDeque<>();
        Student st1 = new Student("Rebeka", "Tretjaka", Faculty.ITF, "300832-21656");
        Student st2 = new Student("Ieva", "Berzina", Faculty.EPF, "220565-32565");
        Student st3 = new Student("Elza", "Janina", Faculty.TSF, "025630-36484");
        MyNodeD student1 = new MyNodeD(st1);
        MyNodeD student2 = new MyNodeD(st2);
        MyNodeD student3 = new MyNodeD(st3);

        try {
//            System.out.println("dequeue");
//            numbers.dequeueFromEnd();

            System.out.print("enqueue at the front number1");
            numbers.enqueueAtFront(number1);
            System.out.println();
            numbers.print();

            System.out.print("enqueue at the front number2");
            numbers.enqueueAtFront(number2);
            System.out.println();
            numbers.print();

            System.out.println("How many elements: " + numbers.howManyElements());

            System.out.print("dequeue from the end");
            numbers.dequeueFromEnd();
            System.out.println();
            numbers.print();

            System.out.print("enqueue to the end number 3, 4, 5");
            numbers.enqueueAtEnd(number3);
            numbers.enqueueAtEnd(number4);
            numbers.enqueueAtEnd(number5);
            System.out.println();
            numbers.print();

            System.out.println("How many elements: " + numbers.howManyElements());

            System.out.print("dequeue at front");
            numbers.dequeueFromFront();
            System.out.println();
            numbers.print();

            System.out.println("How many elements: " + numbers.howManyElements());
            System.out.println("Delete");
            numbers.delete();
            System.out.println("How many elements: " + numbers.howManyElements());


            System.out.print("enqueue at the front student1");
            students.enqueueAtFront(student1);
            System.out.println();
            students.print();

            System.out.print("enqueue at the front student2");
            students.enqueueAtFront(student2);
            System.out.println();
            students.print();

            System.out.println("How many elements: " + students.howManyElements());

            System.out.print("dequeue from the end");
            students.dequeueFromEnd();
            System.out.println();
            students.print();

            System.out.print("enqueue to the end student 3");
            students.enqueueAtEnd(student3);
            System.out.println();
            students.print();

            System.out.println("How many elements: " + students.howManyElements());

            System.out.print("dequeue at front");
            students.dequeueFromFront();
            System.out.println();
            students.print();

            System.out.println("How many elements: " + students.howManyElements());
            System.out.println("Delete");
            students.delete();
            System.out.println("How many elements: " + students.howManyElements());
        } catch (Exception e) {
            System.out.println(e);
        }*/
        browserHistory();
    }
    /*
     * Papildināt MainService klasi, uzrakstot funkciju, kurā tiek simulēta interneta pārlūka vēstures uzkrāšana.
     * Funkcijā nepieciešams ļaut lietotājam ievadīt konsolē dažādas url adreses, kuras saglabā dekā deka priekšpusē.
     * Deka izmērs ir 10. Ja deks tiek pārpildīts, tad no aizmugures jāizņem elementi, lai atbrīvotu vietu dekā.
     * Ja konsolē tiek ievadīta vērtība 1 (nevis url) adrese, tad tiek izprintēts un izdzēsts pirmais deka elements (0.5 balles).
     * */

    public static void browserHistory() throws Exception {
        MyDeque<String> history = new MyDeque();
        String urlAddress;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter URL");
        urlAddress = myObj.nextLine();
        while(!(Objects.equals(urlAddress, "0"))){
            MyNodeD inputUrl = new MyNodeD(urlAddress);
            if(Objects.equals(urlAddress, "1")){
                System.out.println(history.getFrontNode());
                history.dequeueFromFront();
            } else {
                if(history.howManyElements() >= 10) {
                    history.dequeueFromEnd();
                }
                history.enqueueAtFront(inputUrl);
            }
            System.out.println("History:");
            history.print();
            System.out.println("Enter URL");
            urlAddress = myObj.nextLine();
        }

    }










}
