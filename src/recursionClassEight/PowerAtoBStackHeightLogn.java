package recursionClassEight;

import java.util.Scanner;

public class PowerAtoBStackHeightLogn {
    //    x^n= x* x^n-1 OR x^n = x^n/2*x^n/2....
    static int powerAtoB(int a, int b) {
        if (b == 0) {//ye condition toh same hi rhegi..
            return 1;
        }
        if (b % 2 == 0) {
            return powerAtoB(a, b / 2) * powerAtoB(a, b / 2);

        } else {
            return powerAtoB(a, b / 2) * powerAtoB(a, b / 2) * a;//a or powerAtoB(a,b%2)
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int power = powerAtoB(a, b);
        System.out.println(power);
    }
}
