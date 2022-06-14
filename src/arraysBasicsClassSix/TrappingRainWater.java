package arraysBasicsClassSix;

public class TrappingRainWater {
    public static void main(String[] args) {
        int a[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int water = 0;
//        ek left side waala maximum array bnayenge....
        int left[] = new int[a.length];
        int right[] = new int[a.length];
        left[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            left[i] = Math.max(a[i], left[i - 1]);
        }
        right[a.length - 1] = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            right[i] = Math.max(a[i], right[i + 1]);
        }

        for (int i = 0; i < a.length; i++) {
            water += Math.min(left[i], right[i]) - a[i];
        }

        System.out.println(water);

    }
}
