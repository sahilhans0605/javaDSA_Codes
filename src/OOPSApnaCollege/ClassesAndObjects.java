//class memory mein jagah leta h jab program(game) run nhi ho rha tb program(class) harddrive mein hota h
//par jab program run hota h toh main memory(RAM) fill hona shuru ho jaati h...aur class bhi uss time ram mein hi hoti h
package OOPSApnaCollege;

import OOPSApnaCollege.Bank.Account;//bank(package) imported

class Pen {
    String type;
    String color;

    void write() {
        System.out.println("Pen is writing");
    }

    void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    //CONSTRUCTORS:
//  name of constructor is same as class name,They don't return anything,neither they have any return type
//  ,they are just used to construct object
//    constructors can be called only once...when making an object..
//    NON PARAMETRISED CONSTRUCTOR
//    Student() {
//        System.out.println("Constructor called");
//    }

    //    PARAMETRISED CONSTRUCTOR
    Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    //    COPY CONSTRUCTOR// Java does not have a copy constructor like C++ we need to make one
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    public Student() {
        //now as we have defined copy constructor so we need to define...a default empty constructor as well
    }

    public void printInfo() {
        System.out.println(this.age);
        System.out.println(this.name);
    }
//DESTRUCTORS
//    java has inbuilt destructors...automatic garbage collector....those objects and variables which are not
//    in use,java deallocates memory automatically.


}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.color = "Blue";
//        pen.type = "BallPoint";
//        pen.write();
//        pen.printColor();
        Student student1 = new Student();
        student1.name = "Sahil";
        student1.age = 24;
        Student student2 = new Student("Mahima", 100);
        student2.printInfo();
        student1.printInfo();

        Student student3 = new Student(student1);//now this copies information of student1 object hence
//        this object is made using copy constructor2

        Account account = new Account();
        account.name = "Customer";

    }
}
