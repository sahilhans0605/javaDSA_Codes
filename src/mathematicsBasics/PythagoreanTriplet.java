package mathematicsBasics;

import java.util.Scanner;

//We don't know which one of the three given input is hypotenuse...we need to identify and tell will it be a pythagoreantriplet
//i.e will it form a right angled triangle
public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int hypo;
        int perp;
        int base;
        int hypotenuse = Math.max(a, Math.max(b, c));
        if (hypotenuse == a) {
            hypo = a;
            base = b;
            perp = c;

        } else if (hypotenuse == b) {
            hypo = b;
            base = a;
            perp = c;
        } else {
            hypo = c;
            base = a;
            perp = b;
        }
        if (hypo * hypo == base * base + perp * perp) {
            System.out.println("Yes it is a pythagorean triplet");
        }else{
            System.out.println("Nope");
        }
    }


}
