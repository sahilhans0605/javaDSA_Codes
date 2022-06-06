package oopsApnaCollege;

class Person {
    int age;
    String name;
//POLYMORPHISM.......One function many forms.
// .it can be used for printing age OR printing name, OR printing Name and age both.
// ..according to arguments passed
//    It is compile time polymorphism ...or function overloading
//    Also function overloading can be achieved by differentiating their return type
//    Compile time polymorphism is more efficient than run time polymorphism...
//    because run time errors occur while running the app which will be a bad thing for user using an app
//    so we should try to use compile time polymorphism more than run time
    void printInfo(String name) {
        System.out.println(name);
    }

    void printInfo(int age) {
        System.out.println(age);
    }

    void printInfo(String name , int age) {
        System.out.println(name + "  "+ age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {

    }
}
