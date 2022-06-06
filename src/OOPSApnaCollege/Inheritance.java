package OOPSApnaCollege;
//Basically inheritance increases Re-usability of class Suppose we want to implement same shape of button
//on different buttons...we can make one lass and reuse it for all buttons

//TYPES
// Java have 4 types of inheritance...In c++ there are 4...java does not have multiple inheritance
//1.SINGLE LEVEL(BASE CLASS---->DERIVED CLASS)
class Shape {
    String color;

    public void area() {
        System.out.println("Displays area");
    }
}

class Triangle/*Derived class*/ extends Shape/*Base class*/ {

    public void area(int length, int height) {
        int area = (1 / 2) * length * height;
    }
}

//2. MULTILEVEL INHERITANCE(BASE CLASS--->DERIVED CLASS---->DERIVED CLASS)
class EquilateralTriangle extends Triangle {
    public void area(int length, int height) {
        int area = (1 / 2) * length * height;
    }
}

//3.HIERARCHICAL INHERITANCE(MULTIPLE DERIVED CLASS INHERITS SAME BASE CLASS)
class Circle extends Shape {
    public void area(int radius) {
        int area = (int) (Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    public void area(int length, int breadth) {
        int area = length * breadth;
    }
}

//4. HYBRID INHERITANCE(Any branch doing hierarchical any doing multilevel...means mix up of 2 and 3)
//5.MULTIPLE INHERITANCE DOES NOT TAKE PLACE IN JAVA...WE USE INTERFACES IN JAVA TO IMPLEMENT MULTIPLE INHERITANCE

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Purple";//color data is inherited to triangle from shape class
    }
}
