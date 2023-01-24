package arraysBasicsClassSix;

public class TrappingRainWaterO1Space {
    public static void main(String[] args) {

        int a[] = {3, 4, 5, 1, 7, 2, 6, 5, 4, 1};
        int ans = 0;
        int left = 0;
        int leftMAx = 0;
        int right = a.length - 1;
        int rightmax = 0;
        while (left < right) {
            if (a[left] < a[right]) {//jo chhota h usse shuruat hui
                if (a[left] > leftMAx) {
                    leftMAx = a[left];
                } else {
                    ans += leftMAx - a[left];
                }
                left++;

            } else {
                if (a[right] > rightmax) {
                    rightmax = a[right];
                } else {
                    ans += rightmax - a[right];
                }
                right--;
            }
        }
        System.out.println(ans);
    }
}