package recursionClassEight;

public class CheckIfAnArrayIsSorted {

    static boolean sortedCheck(int a[], int i) {
        if (i == a.length - 1) {//last element tk aagya h mtlb ab return krdo
            return true;
        }

        if (a[i] >= a[i + 1]) {//question has asked strictly increasing means duplicacy is also not allowed..
//            if duplicate elements are allowed we can do a[i]  >a[i+1]
            return false;
        }
        return sortedCheck(a, i + 1);

    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 6, 6};
        System.out.println(sortedCheck(a, 0));
    }
}
