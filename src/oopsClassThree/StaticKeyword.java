//math.PI....se yaad krna h
//#v important...ststic function se static function hi call hoga
// ...hence main function(static) se static function hi call hoga
package oopsClassThree;

class Person {
    int age;
    String name;
//    static things are same for all objects hence they can be accessed directly via classes
// so if we call Student.school="JMV"...it will be same for all students of jmv school
//     so as to save memory we can make a variable/function static
    static int count;//....To access this variable in other class(without making any object of class) we should define it static ...
//    Hence static things can directly be accessed using class name
//    why we use static...there are somethings that are same for all objects ...it can be directly accessed as Person.count
//    we use Math.PI...we are not creating object of math class...and using it directly because it is made static

    Person() {
        System.out.println("person(OBJECT) is being created default constructor");//default constructor override krdiya
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
