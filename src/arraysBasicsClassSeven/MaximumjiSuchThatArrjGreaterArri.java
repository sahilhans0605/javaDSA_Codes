package arraysBasicsClassSeven;

//Find the maximum j-i such that arr[j]>arr[i]**********asked in every company
public class MaximumjiSuchThatArrjGreaterArri {
    //    Brute force...two loops j=i+1...if(a[j]>a[i])ans=max(ans,j-i);
    public static void main(String[] args) {
        int a[] = {3, 4, 5, 1, 7, 2, 6, 5, 4, 1};
//        Right max array
//        left min arrray
        int rightMax[] = new int[a.length];
        int leftMin[] = new int[a.length];
        int n = a.length;
        rightMax[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], a[i]);
        }
        leftMin[0] = a[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], a[i]);

        }
        int i = 0, j = 0;
        int ans = 0;
        while (i < n && j < n) {
            if (leftMin[i] < rightMax[j]) {//arr[i]<arr[j]
                ans = Math.max(ans, j - i);
                j++;
            } else {
                i++;
            }

        }
        System.out.println(ans);
    }
}