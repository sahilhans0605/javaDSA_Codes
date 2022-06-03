package javaBasicsClassTwo;

import java.util.Scanner;

public class AnyBaseMultiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        int p = 1;
        int fValue = 0;
        while (n2 > 0) {
            int singleProduct = getProductWithASingleDigit(b, n1, n2 % 10);  //*********
            n2 /= 10;
            fValue = getSum(b, fValue, singleProduct * p);//***because when we add one digit gets back in multiplication
            p *= 10;
        }
        return fValue;
    }

    public static int getProductWithASingleDigit(int b, int n1, int d2) {
        int fValue = 0;
        int carry = 0;
        int p = 1;
        while (n1 > 0 || carry > 0) {
            int d1 = n1 % 10;
            n1 /= 10;
            int d = d1 * d2 + carry;
            carry = d / b;
            d = d % b;
            fValue += d * p;
            p *= 10;
        }
        return fValue;
    }


    public static int getSum(int b, int n1, int n2) {
        int fValue = 0;
        int carry = 0;
        int p = 1;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            int d = d1 + d2 + carry;
            carry = d / b;
            d = d % b;
            fValue += d * p;
            p = p * 10;
            n1 /= 10;
            n2 /= 10;
        }
        return fValue;
    }

}
