package oopsClassThree;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Animal animal1 = new Animal();//object of animal class
        Animal animal2 = new Animal("Bob");
//without constructor we can't make objects...so default constructor is already made whenever we make a class
        animal1.name = "Elephant";
        animal1.legs = 4;
        animal2.name = "Cow";
        animal2.legs = 4;
        animal1.walk();
        animal1.walk(5);
//        we don't interact with class(engine)...we interact with object(car)
    }
}

class Animal {
    int legs;
    String name;//data of class

    public Animal() {
//        it is default constructor....Constructors doesn't return anything
        System.out.println("Calling default constructor");// as we have written something in constructor
        // this means we have changed the default constructor hence we have done constructor overriding
//        no return type in constructor
//        constructor can also be overloaded

    }

    public Animal(String newName) {
        System.out.println(newName + " was passed while creating object ");
    }

    void walk() //member of class
    {
        System.out.println(name + " is Walking ");
    }

    // two different functions can be made one have parameters and other does not hava....
// it is called method overloading
//    i.e methods with same name and different parameters
//    we can overload main method...the execution of program starts
//    from that main method which has String[]args
    void walk(int steps) {
        System.out.println("Animal walked " + steps + " steps");
    }
}
