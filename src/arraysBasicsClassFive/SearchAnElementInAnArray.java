package arraysBasicsClassFive;
//time complexity O(n)
public class SearchAnElementInAnArray {
    public static void main(String[] args) {
//        int[] a = new int[5];
        int a[] = {2, 1, 7, 6, 5};
        int key = 7;
        int flag = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                flag = i;
                break;
            }

        }
        if (flag == -1) {
            System.out.println("Key not found!");
        } else {
            System.out.println("Key is present at " + flag);

        }
    }
}
