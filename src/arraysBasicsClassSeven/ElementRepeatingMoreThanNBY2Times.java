package arraysBasicsClassSeven;

public class ElementRepeatingMoreThanNBY2Times {
    public static void main(String[] args) {
        int a[] = {2, 2, 1, 1, 1, 2, 2};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[j] == a[i]) {
//                    System.out.println(a[j] + "  " + a[i]);
                    count++;
                }
            }
            if (count > a.length / 2) {
                System.out.print(a[i]);
                return;
            } else {
                count = 0;
            }
        }
    }
}
