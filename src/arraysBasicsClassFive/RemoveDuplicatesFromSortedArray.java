package arraysBasicsClassFive;

public class RemoveDuplicatesFromSortedArray {
    private static int removeDuplicates(int[] nums) {
        int n = nums.length;

        /*
         * This index will move only when we modify the array in-place to include a new
         * non-duplicate element.
         */

        int j = 0;

        for (int i = 0; i < n; i++) {
            /*
             * If the current element is equal to the next element, then skip the current
             * element because it's a duplicate.
             */
            if (i < n - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[j++] = nums[i];
            }

        }

        return j;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newLength = removeDuplicates(arr);

        // Print updated array
        for (int i = 0; i < newLength; i++)
            System.out.print(arr[i] + " ");
    }
}

