package bitManipulation;

public class SwappingTwoIntegerWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        System.out.println(a + "  " + b);
        System.out.println("After Swapping!");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + "  " + b);
    }
}
