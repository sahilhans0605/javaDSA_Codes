package stack;

public class ImplementStackUsingArray {

    int a[];
    int capacity;
    int top;

    public ImplementStackUsingArray(int capacity) {
        this.capacity = capacity;
        a = new int[capacity];
        top = -1;
    }

    boolean push(int element) throws Exception {
        if (top == capacity - 1) {//overflow
            throw new Exception("Stack is full");//boolean return type so that we can throw exception if element is not pushed
        }
        top++;
        a[top] = element;
        return true;
    }

    int pop() throws Exception {
        if (top == -1) {//underflow
            throw new Exception("Stack is empty");
        }
        int ans = a[top];
        top--;
        return ans;
    }

    int peak() throws Exception {
        if (top == -1) {//underflow
            throw new Exception("Stack is empty");
        }
        return a[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }

    public static void main(String[] args) {
//        using array the drawback is that it has fixed size

    }
}
