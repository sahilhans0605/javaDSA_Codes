package hashingBasics;
//Summary------------>  we use hashCode and equals method to make a hashset/set of custom class
import java.util.HashSet;
import java.util.Set;

class Student {
    int rollNumber;
    String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public String toString() {//it is the to string method of student if we want to print an object of this class this toString method will be called
//        it is same as display method we make in classes
        return "(" + rollNumber + " , " + name + ")";
    }

    @Override
    public int hashCode() {//hashcode roll number ke basis pe btata hai ki do cheeze equal h ya nhi
        return rollNumber;//custom class student se humne jab hash set bnaya toh hash code ne hume help kiya ki duplicate elements na aaye set mein on the basis of their roll number
    }

//    @Override
//    public boolean equals(Object that) {
//        Student student = (Student) that;
//        if (this.rollNumber == student.rollNumber) {
//            return true;
//        }
//        return false;
//    }

}

public class HashCodeAndEqualsContract {
    public static void main(String[] args) {
        Set<Student> rollCall = new HashSet<>();
        Student s1 = new Student(1, "Sahil");
        Student s2 = new Student(1, "Ankit");
        Student s3 = new Student(2, "Sahil");
        rollCall.add(s1);
        rollCall.add(s2);
        rollCall.add(s3);
        System.out.println(rollCall);//if we don't make toString method in student class//it is printing object id because print calls toString method
        // by default it returns object id...from class.
        // ..it is not an object of main class.....so we need to override a function toString in student class
        Student s4 = new Student(1, "Sahil");
        rollCall.add(s4);
        System.out.println(rollCall);//it is allowing duplicate values....which should not happen
//        it is happening because java is not checking(shallow checking) inside object..and treating s1 and s4 as different object

//set will not allow to put s1 and s4 to put two times but it is not checking what is inside set
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s2));//true if roll numbers are same//because we are comparing hashcode(which is now returning roll numbers)

//        if we comment out equals method... then .equals will come from object not from student class

//        now we have commented equals in student class
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s2));

        Student s5 = s1;
        System.out.println(s1==s5);//or s.equals(s5)

    }
}
