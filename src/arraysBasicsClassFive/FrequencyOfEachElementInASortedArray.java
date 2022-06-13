package arraysBasicsClassFive;

public class FrequencyOfEachElementInASortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 9};
        int count = 1;
        for (int i = 1; i < arr.length; i++) {//when it is compulsary to go on last element start from i=1...
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println("Frequency of " + arr[i - 1] + " is " + count);
                count = 1;
            }
        }
        System.out.println("Frequency of "
                + arr[arr.length - 1]
                + " is " + count);
    }
}
