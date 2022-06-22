package arraysBasicsClassSeven;

//also called majority element
public class ElementRepeatingMoreThanNBY2Times {
    public static void main(String[] args) {
        int a[] = {1, 2, 1, 2, 1, 2, 1};
//        O(N^2)---->brute force
//        int count = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i; j < a.length; j++) {
//                if (a[j] == a[i]) {
////                    System.out.println(a[j] + "  " + a[i]);
//                    count++;
//                }
//            }
//            if (count > a.length / 2) {
//                System.out.print(a[i]);
//                return;
//            } else {
//                count = 0;
//            }
//        }
        System.out.println(majorityElement(a));

    }
//By moore's voting algorithm in O(N)********ONLY FOR N/2 wala ques*******Sahi h ye saare ans sahi aarhe h

    static int majorityElement(int a[]) {
        int currElement = -1;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (count == 0) {
                currElement = a[i];
                count = 1;
            } else {
                if (a[i] == currElement) {
                    count++;
                } else {
                    count--;
                }

            }
        }
        int finalCount = 0;
        for (int e : a) {
            if (e == currElement) {
                finalCount++;
            }
        }
        if (finalCount > a.length / 2) {
            return currElement;
        } else {
            return -1;
        }
    }
}
