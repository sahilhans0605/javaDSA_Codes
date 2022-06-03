package javaBasicsClassTwo;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for using dynamic arrays we can use array list--->will come in future classes
        int[] ageList = new int[5];
        int[] ageListInitialize = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < ageList.length; i++) {
            ageList[i] = sc.nextInt();
        }
        for (int i = 0; i < ageList.length; i++) {
            System.out.println(ageList[i]);
        }
        System.out.println();
        System.out.println("FOR EACH LOOP");
        System.out.println();
//        FOR EACH LOOP
        for (int element : ageList) {
            System.out.println(element);
        }
//        2D ARRAYS
        int a[][] = new int[3][];
        int ab[][] = {{1, 2, 3}, {4, 5, 6}};

    }
}
