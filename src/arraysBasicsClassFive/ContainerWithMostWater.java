package arraysBasicsClassFive;

public class ContainerWithMostWater {
    public static void main(String[] args) {
//----------------O(N^2)----------------Not a good idea
        int a[] = {1};
//        int maxArea = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j <a.length; j++) {
//                int min = Math.min(a[i], a[j]);
//                System.out.println(a[i] + " " + a[j]);
//                int area = min * (j - i);
//                maxArea = Math.max(maxArea, area);
//            }
//        }
//        System.out.println(maxArea);
//----------------O(N)---------------
//        Two pointers technique.................
        int maxArea = 0;
        int i = 0;
        int j = a.length - 1;
        while (i < j) {//not i<=j because one sheet can't contain water at least 2 sheets are required
            int height = Math.min(a[i], a[j]);
            System.out.println(a[i] + " " + a[j]);
            int area = height * (j - i);//j-i is distance
            maxArea = Math.max(maxArea, area);
            if (a[i] <= a[j]) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(maxArea);
    }
}
