package hashingBasics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Hashset and HashMap in java--->Both have diff functions
//HashSet implements set but it uses hashmap for implementation
public class HashingBasics {

    class Student {
        int rollNo;
        String name;

        public Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

    }

    public static void main(String[] args) {
////put,get,contains
////        suppose "one"--->I
////        suppose "two"--->II
////        suppose "one"--->III--->then above one will be replaced by III
//
//        HashMap<String,String>map = new HashMap<>();
//        map.put("one","I");
//        map.put("two","II");
//        map.put("one","III");
//        System.out.println(map);
//
//        HashSet<Integer> set = new HashSet<>();
//        set.add(3);
//        set.add(34);
//        set.add(3);
//        System.out.println(set);//duplicate element won't be printed
//

//        ek student s1 ek student s2....objects of class student
//        agr un dono ki key value(roll no.) same h toh vo dono equal h
//        .equals function true return krega
//        set mein agr same key aajaye..toh firse nhi dlna chahiye student class se toh hum apna equals method bnayenge
//        Hashing is not a data structure it is a technique(put/get/contains/remove)
//        if array takes O(n)-->hash set will take O(1)
//        It reduces time complexity and it is used for searching/inserting/deleting

        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(10);
        System.out.println(s);//unordered printing....elements will be printed in random order

        if (s.contains(10)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        s.remove(10);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.clear();
        System.out.println(s.size());
    }


}
