package stack;

import java.util.Stack;

public class FindMaximumAreaInAHistogram {

    static int maximumAreaBruteForce(int a[]) {
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            int l = i;
            int r = i;
            while (l >= 0 && a[l] >= a[i]) {
                l--;
            }
            while (r < a.length && a[r] >= a[i]) {
                r++;
            }
            int width = (r - l - 1);
            int area = width * a[i];
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }

    static int[] prevSmaller(int a[]) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int e = a[i];
            while (!stack.isEmpty() && e <= a[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = a[i];
            }
            stack.push(i);
        }
        return ans;
    }

    static int[] nextSmaller(int a[]) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[a.length];
        for (int i = a.length-1; i >=0; i--) {
            int e = a[i];
            while (!stack.isEmpty() && e <= a[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }

    static int maximumAreaHistogramStack(int a[]) {
        Stack<Integer> stack = new Stack<>();

        int maxArea = Integer.MIN_VALUE;


        for (int i = 0; i < a.length; i++) {
            int ps[] = prevSmaller(a);
            int ns[] = nextSmaller(a);
            int width = ns[i] - ps[i] - 1;
            int currArea = width * a[i];
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int a[] = {4, 3, 9, 2, 5, 1, 8, 3};

        System.out.println(maximumAreaBruteForce(a));
        System.out.println(maximumAreaHistogramStack(a));

    }
}
