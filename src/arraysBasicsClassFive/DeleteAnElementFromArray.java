//Delete first key
//After key is found uske aage ke sabko left shift krdo
package arraysBasicsClassFive;


public class DeleteAnElementFromArray {

//    public static void delete(int a[], int key) {
//        int flag = -1;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == key) {
//                flag = i;
//            }
//
//        }
//        if (flag == -1) {
//            System.out.println("Key not found!");
//        } else {
//            for (int j = flag; j < a.length-1; j++) {
//                a[j] = a[j + 1];
//            }
//            for (int i = 0; i < a.length-1; i++) {
//                System.out.println(a[i]);
//            }
//        }
//    }

    public static void main(String[] args) {
        int a[] = {2, 1, 4, 6, 5};
        int key = 4;
//        delete(a, key);
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                continue;
            } else {
                a[j++] = a[i];
            }

        }
        for (int i = 0; i < j; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
