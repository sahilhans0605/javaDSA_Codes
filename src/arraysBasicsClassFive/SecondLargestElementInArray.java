package arraysBasicsClassFive;

public class SecondLargestElementInArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if (a.length < 2) {//***********************************
            System.out.print("Invalid Input!");
        }

//second largest nikaalne ke liye first largest nikaalo aur fir ek aur baar largest nikaalo ki vo first largest ke equal na ho
        for (int i = 0; i < a.length; i++) {
            largest = Math.max(a[i], largest);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != largest) {
                secondLargest = Math.max(a[i], secondLargest);
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.print("There is no second largest element");
        } else {
            System.out.print("Second largest element in this array is : " + secondLargest);
        }
    }
}