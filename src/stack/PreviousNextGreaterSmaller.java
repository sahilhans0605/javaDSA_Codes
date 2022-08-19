package stack;

import java.util.Stack;

public class PreviousNextGreaterSmaller {

    static int[] previousSmallerElement(int a[]) {
        //        Previous smaller element
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[a.length];
        int i = 0;
        for (int e : a) {
            while (!stack.isEmpty() && e <= stack.peek()) {//here the time complexity in not n^2....becuase only one element is inserted at a time...O(2n)~O(n)
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(e);
            i++;
        }
        return ans;
    }

    static int[] previousGreaterElement(int a[]) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[a.length];
        int i = 0;
        for (int e : a) {
            while (!stack.isEmpty() && e >= stack.peek()) {//here the time complexity in not n^2....becuase only one element is inserted at a time...O(2n)~O(n)
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(e);
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {4, 1, 3, 5, 2, 1};
        int ans[] = previousSmallerElement(a);//***********
        int ans2[] = previousGreaterElement(a);//**********
//        int ans3[] = nextSmallerElement(a);//**********
        int ans4[] = nextGreaterElement(a);//**********
        for (int e : ans) {
            System.out.print(e + " ");
        }
        System.out.println();
        for (int e : ans2) {
            System.out.print(e + " ");
        }
//        System.out.println();
//        for (int e : ans3) {
//            System.out.print(e + " ");
//        }
        System.out.println();
        for (int e : ans4) {
            System.out.print(e + " ");
        }
    }

    private static int[] nextGreaterElement(int[] a) {
        int ans[] = new int[a.length];
        Stack<Integer> s = new Stack<>();
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && a[i] >= s.peek()) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[j] = -1;
            } else {
                ans[j] = s.peek();
            }
            s.push(a[i]);
            j++;
        }
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int temp = ans[left];
            ans[left] = ans[right];
            ans[right] = temp;
            left++;
            right--;
        }
//        for (int i = 0; i < a.length / 2; i++) {
//            int temp = ans[i];
//            ans[i] = ans[a.length - i - 1];
//            ans[a.length - i - 1] = temp;
//        }
        return ans;
    }

//    private static int[] nextSmallerElement(int[] a) {
//
//    }
}
