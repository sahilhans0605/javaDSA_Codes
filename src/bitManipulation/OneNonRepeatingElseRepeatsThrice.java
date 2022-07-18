package bitManipulation;

public class OneNonRepeatingElseRepeatsThrice {

    static int elementComingOnce(int a[]) {
        int threeN = Integer.MAX_VALUE;
        int threeN1 = 0;
        int threeN2 = 0;
        for (int i = 0; i < a.length; i++) {
            int commonThreeN = threeN & a[i];
            int commonThreeN1 = threeN1 & a[i];
            int commonThreeN2 = threeN2 & a[i];

            threeN = (threeN & ~commonThreeN);//threeN mein off krdiya threeN waale ka result//because wo ab ek se increment hua h toh 3n+1 type ka ban gya....yha se off krke 3n+1 mein on krdiya
            threeN1 = threeN1 | commonThreeN;

            threeN1 = threeN1 & (~commonThreeN1);
            threeN2 = threeN2 | commonThreeN1;

            threeN2 = threeN2 & (~commonThreeN2);
            threeN = threeN | commonThreeN2;

        }
        return threeN1;//because threeN1 indicates that those bits were on in our numbers
    }

    public static void main(String[] args) {
        int a[] = {51, 57, 51, 57, 63, 38, 57, 63, 63, 51};
        System.out.print(elementComingOnce(a));
    }
}
