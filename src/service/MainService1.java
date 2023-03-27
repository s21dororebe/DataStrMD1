package service;

import datastr.MyNodeS;
import datastr.MyStack;
import model.Faculty;
import model.Student;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainService1 {
    public static void main(String[] args)  {
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
            printStatus(numbers);
            System.out.println("Is this stack full? ==> " + numbers.isFull());
            System.out.println("Is this stack empty? ==> " + numbers.isEmpty());

            System.out.println();
            System.out.println("Adding new elements:");
            numbers.push(number1);
            System.out.println("Stack with numbers:");
            printInfo(numbers);

            numbers.push(number2);
            System.out.println("Stack with numbers:");
            printInfo(numbers);

            numbers.push(number3);
            System.out.println("Stack with numbers:");
            printInfo(numbers);

            numbers.push(number4);
            System.out.println("Stack with numbers:");
            printInfo(numbers);

            numbers.push(number5);
            System.out.println("Stack with numbers:");
            printInfo(numbers);
            System.out.println("Is this stack full? ==> " + numbers.isFull());
            System.out.println();

            System.out.println("Pop element:");
            numbers.pop();
            System.out.println("Stack with numbers:");
            printInfo(numbers);

            numbers.pop();
            System.out.println("Stack with numbers:");
            printInfo(numbers);

            System.out.println("Delete stack:");
            numbers.delete();
            System.out.println("top(): " + numbers.top() + ", count of elements: " + numbers.howManyElements());
            System.out.println("Is this stack empty? ==> " + numbers.isEmpty());

            System.out.println();
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println();

            System.out.println("Stack with students");
            printStatus(students);
            System.out.println("Is this stack full? ==> " + students.isFull());
            System.out.println("Is this stack empty? ==> " + students.isEmpty());

            System.out.println();
            System.out.println("Adding new elements:");
            students.push(student1);
            System.out.println("Stack with students:");
            printInfo(students);

            students.push(student2);
            System.out.println("Stack with students:");
            printInfo(students);

            students.push(student3);
            System.out.println("Stack with students:");
            printInfo(students);

            System.out.println("Pop element:");
            students.pop();
            System.out.println("Stack with students:");
            printInfo(students);

            students.pop();
            System.out.println("Stack with students:");
            printInfo(students);

            System.out.println("Delete stack:");
            students.delete();
            printStatus(students);
            System.out.println("Is this stack empty? ==> " + students.isEmpty());

            System.out.println();
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println();

            System.out.println("Papildfunkcija:");
            String file1 = "src/resources/UserController.java";
            checkSyntax(file1);
            String file2 = "src/resources/UserServiceImplTest.java";
            checkSyntax(file2);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void printStatus(MyStack stackWithElements) {
        System.out.println("top(): " + stackWithElements.top() + ", count of elements: " + stackWithElements.howManyElements());
    }

    /*
    * Man ir ļoti grūti ar file lasīšanu, tāpēc es izmantoju chatgpt, lai uzrakstītu šo funkciju
    * es sapratu kā tas strādā un papildināju to ar MyStack
    * */

    public static void checkSyntax(String path) {
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(path));
                String line;
                MyStack<Character> stackToCheck = new MyStack();
                int lineNumber = 0;
                while ((line = bReader.readLine()) != null) {
                    lineNumber++;
                    for (int i = 0; i < line.length(); i++) {
                        char ch = line.charAt(i);
                        if (ch == '(' || ch == '{' || ch == '[') {
                            stackToCheck.push(new MyNodeS(ch));
                        } else if (ch == ')' || ch == '}' || ch == ']') {
                            if (stackToCheck.isEmpty()) {
                                System.out.println("Error: Extra closing bracket at line " + lineNumber + ", position " + (i+1));
                                return;
                            }
                            MyNodeS top = stackToCheck.top();
                            if ((top.equals('(') && ch == ')')
                                    || (top.equals('{') && ch == '}')
                                    || (top.equals('[') && ch == ']')) {
                                stackToCheck.pop();
                            } else {
                                System.out.println("Error: Mismatched brackets at line " + lineNumber + ", position " + (i+1));
                                return;
                            }
                        }
                    }
                }
                if (!stackToCheck.isEmpty()) {
                    MyNodeS top = stackToCheck.top();
                    System.out.println("Error: Extra opening bracket of type " + top + " at end of file");
                } else {
                    System.out.println("Syntax check passed successfully.");
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printInfo(MyStack stackWithElements) throws Exception {
        stackWithElements.print();
        System.out.println("top(): " + stackWithElements.top() + ", count of elements: " + stackWithElements.howManyElements());
        System.out.println();
    }
}
