package arraysBasicsClassSeven;
//what if array is not sorted ....we can use hashmap and find target-nums[i] in the map.....
public class FindTwoNumbersInASortedArrayWithGivenSum {
    public static void main(String[] args) {
//        sorted array h isliye elements peeche nhi rhenge
        int a[] = {1, 2, 7, 8, 10, 12};
        int i = 0;
        int j = a.length - 1;
        int sum = 6;
        int currSum = 0;
        while (i < j) {
            currSum = a[i] + a[j];
            if (currSum < sum) {
                i++;
            } else if (currSum > sum) {
                j--;
            } else {
                System.out.println("Sum is present");
                return;
            }
        }
        System.out.println("Sum is not present");
    }
}
