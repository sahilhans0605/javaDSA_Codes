//multiple not allowed...multilevel allowed
package oopsClassThree;

public class Inheritance {
    public static void main(String[] args) {
        Samsung s1 = new Samsung();
        s1.playGames();// if not found in samsung class then it will find
        // in it's parent class mobile phone
        Apple a1 = new Apple();
        a1.playGames();

        Samsung s2 = new Samsung();
        s2.playGames(4);
    }
}

class Samsung extends MobilePhone {
    void playGames() {
        System.out.println("Samsung playing games!");
        //method overriding(Run time polymorphism) ...papa ji ne game play krne ka method apna bna liya...override krdiya
//        slow hota h kyoki run time pe hota h ...sub class mein bhi ho skta h parent class mein bhi

    }

    void playGames(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("Samsung" + i);
        }
        //        and method overloading.. ko compile time polymorphism...fast hota h because same class mein hota h
        //         aur compile time pe ho jaata h

    }
}

class Apple extends MobilePhone {

}

class MobilePhone {
    int price;
    int dimension;
    String operatingSystem;
    boolean hasHeadPhoneJack;

    void playGames() {
        System.out.println("Mobile phones playing games!");
    }
}