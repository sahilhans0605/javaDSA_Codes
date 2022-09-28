package stack;

import java.util.ArrayList;

public class ImplementStackUsingArrayList {

    int size = 0;
    ArrayList<Integer> arrayList = new ArrayList<>();

    boolean isEmpty() {
        return arrayList.size() == 0;
    }

    void push(int element) {//array list keeps doubling it's size...
        arrayList.add(element);
        size++;
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        }
        int ans = arrayList.get(arrayList.size() - 1);
        arrayList.remove(arrayList.size() - 1);
        size--;
        return ans;
    }

    int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arrayList.get(arrayList.size() - 1);
    }
}

