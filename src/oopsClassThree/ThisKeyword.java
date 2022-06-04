//  bss this lgado function mein ......toh human1
package oopsClassThree;

class Human {
    int age;
    String name;

    static int count;

    Human() {
//        this("Anuj",25);   we are also able to call another constructor of same class here
        System.out.println("human(OBJECT) is being created default constructor");
        count++;//this value of count does not have any relation with any object
    }

    void walk() {
        System.out.println(this.name + " is walking!");
    }

    Human(String name, int age) {
        this();//    this is also used in constructor overloading.
        //means iss class waale constructor se call krwaao..now count will also increase...because it is called via default constructor
        this.age = age;
        this.name = name;//current class ki name waale name mein constructor ka name daalo
        walking(this);//now current object is passed...inshort current object ko pakadne mein kaam ata h ye
    }

    void walking(Human obj) {
        System.out.println(name + " is Walking");
        age += 10;
    }
}

public class ThisKeyword {
    public static void main(String[] arguments) {
        Human human = new Human("Sahil", 20);// Direct initalize object with the help of constructor
        Human human1 = new Human("Mahima", 23);
        human.walk();
        System.out.println(human.name + "    " + human.age);
        System.out.println(Human.count);


    }
}
