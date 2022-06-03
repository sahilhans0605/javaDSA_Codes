package oopsClassThree;

class Person {
    int age;
    String name;
    static int count;//....To access this variable in other class we should define it static ...
//    Hence static things can directly be accessed using class name
//    why we use static...there are somethings that are same for all objects ...it can be directly accessed as Person.count
//    we use Math.PI...we are not creating object of math class...and using it directly because it is made static

    Person() {
        System.out.println("person(OBJECT) is being created default constructor");
        count++;//this value of count does not have any relation with any object
    }
}

public class StaticKeyword {
    public static void main(String[] arguments) {
        Person person = new Person();
        Person person1 = new Person();
        System.out.println(Person.count);

    }
}
