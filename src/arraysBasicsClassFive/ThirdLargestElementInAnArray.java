package arraysBasicsClassFive;

public class ThirdLargestElementInAnArray {
    public static void main(String[] args) {
        int a[] = {6, 6, 7};
        if (a.length < 3) {
            System.out.println("Invalid Input");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            largest = Math.max(a[i], largest);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != largest) {
                secondLargest = Math.max(a[i], secondLargest);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != largest && a[i] != secondLargest) {
                thirdLargest = Math.max(a[i], thirdLargest);
            }
        }
        if (thirdLargest == Integer.MIN_VALUE) {
            System.out.println("Third largest element does not exist!");
        } else {
            System.out.println("Third largest element in this array is " + thirdLargest);

        }
    }
}
