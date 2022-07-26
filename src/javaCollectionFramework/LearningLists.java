package javaCollectionFramework;

import java.util.*;

//List is an interface which consist of three important classes linkedlist/arraylist/stack

public class LearningLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
//        To create linked list/stack we just replace ArrayList with linked list
//        But time complexity will be changed in linked list
        list.add(23);
        list.add(45);//O(1)
        list.add(3);
        list.add(4);

//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i)*2);
//        }
//        list.add("Hi);//not allowed same data type
//        Array list is a resizable array
//        arraylist ko pta nhi hota kitne size ka bnana h isliye double krta rhta h
//        System.out.println(list);

//        ITERATOR

//        Iterator<Integer>it = list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());//it.next returns the current element
//        }

        list.set(0, null);
        list.set(1, 100);//O(1)
        System.out.println(list);
        list.remove(1);//O(n)//1 is the index
        System.out.println(list);
        list.add(0, 23);
        System.out.println(list);
        System.out.print(list.contains(null));
        list2.add(400);
        list2.add(4500);
        list.addAll(list2);
        System.out.println(list);

        Set<String> set = new HashSet<>();//no order in hash set
//        ordered in linked hash set
//        sorted in tree hashset
        set.add("Apple");
        set.add("Mango");
        set.add("Kiwi");
        set.add("Orange");
        set.remove("Kiwi");
//        set.add("Apple");//duplicates not allowed by any type of set
        System.out.println(set);//output will be unordered
//        a.remove(b);...b waale elemebt jo a mein h uda dega
//        PRIORITY QUEUE
//        Priority queue mein priority defined hoti h elements ki
//        jese phle Prime minister
//        phir VIP aise beech beech mei se element remove kr skte h

//        DEQUE
//        Add elements from both sides

//        If element is not added ...it throws exception(bezatti krwadega)
//        offer function returns false.....
//        But both add and offer add elements in queue

//           In tree hash map elements are sorted according to their keys

        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(23);
        queue.add(45);
        System.out.println(queue.remove(0));

    }
}
