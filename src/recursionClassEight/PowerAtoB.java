package recursionClassEight;

import java.util.Scanner;

public class PowerAtoB
{
//    a^b---Time complexity O(b)//also this says stack height = n*************
//    why O(b)....a*a^b-1....like this
// stack ki height mein main function ko ignore krna h
//    n~n+1....if n->infinity....

    static int PowerAToB(int a, int b) {
        if (b == 0) {
            return 1;
        }

        return a * PowerAToB(a, b - 1);//loop b times chalega jab tk b 0 nhi hota
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int power = PowerAToB(a, b);
        System.out.println(power);
    }
}
