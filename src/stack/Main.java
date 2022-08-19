package stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

//        Stack<Integer>stack = new Stack<>();//it uses vector internally and vector uses array internally and it is not dynamic
//        //wrapper class ---> INTEGER ArrayDeque<Integer>stack = new ArrayDeque<>();//it uses queue internally that is why it is recommended
//-------------------------------------OR----------------------------------------------------
//        ImplementStackUsingLinkedList stackUsingLinkedList = new ImplementStackUsingLinkedList();//no capacity needed it is dynamic stack because it is stack using linkedlist
//
//        stackUsingLinkedList.push(1);
//        stackUsingLinkedList.push(2);
//        stackUsingLinkedList.push(3);
//        stackUsingLinkedList.push(4);
//        while (!stackUsingLinkedList.isEmpty()) {
//            System.out.println(stackUsingLinkedList.peek());
//            System.out.println(stackUsingLinkedList.pop());
//        }
//        System.out.println(stackUsingLinkedList.pop());
//        System.out.println(stackUsingLinkedList.pop());
//        System.out.println(stackUsingLinkedList.pop());


//        ImplementStackUsingArray stackUsingArray = new ImplementStackUsingArray(3);//3 is the size of stack
//        stackUsingArray.push(2);
//        stackUsingArray.push(4);
//        stackUsingArray.push(8);
//        stackUsingArray.push(1);

//        System.out.print(stackUsingArray.peak());

        ImplementStackUsingArrayList stackUsingArrayList = new ImplementStackUsingArrayList();
        stackUsingArrayList.push(1);
        stackUsingArrayList.push(2);
        stackUsingArrayList.push(3);
        stackUsingArrayList.push(4);

        while(!stackUsingArrayList.isEmpty()){
            System.out.println(stackUsingArrayList.pop());
        }
    }
}
