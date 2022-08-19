package stack;

public class ImplementTwoStacksUsingOneArray {
    int a[];
    int top1;
    int top2;


    public ImplementTwoStacksUsingOneArray(int capacity) {
        a = new int[capacity];
        top1 = -1;
        top2 = capacity;
    }

    void push1(int ele) throws Exception {
        if (top1 < top2) {
            top1++;
            a[top1] = ele;
        } else {
            throw new Exception("Stack array is full");
        }
    }

    void push2(int ele) throws Exception {
        if (top1 < top2) {//top1 mein -1 bhi ho skta hai...isliye yha top1+1 use kiya gya hai
            top2--;
            a[top2] = ele;
        } else {
            throw new Exception("Stack array is full");
        }
    }

    int pop1() throws Exception {
        if (top1 <= -1) {
            throw new Exception("Stack array is empty");
        } else {
            int ans = a[top1];
            top1--;
            return ans;
        }
    }

    int pop2() throws Exception {
        if (top2 >= a.length) {
            throw new Exception("Stack array is empty");
        } else {
            int ans = a[top2];
            top2++;
            return ans;
        }
    }

    public static void main(String[] args) throws Exception {
        ImplementTwoStacksUsingOneArray stacksUsingOneArray = new ImplementTwoStacksUsingOneArray(5);
        stacksUsingOneArray.push1(10);
        stacksUsingOneArray.push1(20);
        stacksUsingOneArray.push1(30);
        stacksUsingOneArray.push2(60);
        stacksUsingOneArray.push2(90);


        System.out.println(stacksUsingOneArray.pop1());
        System.out.println(stacksUsingOneArray.pop1());
        System.out.println(stacksUsingOneArray.pop2());
        System.out.println(stacksUsingOneArray.pop2());
    }
}