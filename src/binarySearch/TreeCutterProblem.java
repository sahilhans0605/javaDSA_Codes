package binarySearch;

public class TreeCutterProblem {
//    TC ===> O(log(heightOfMaxTree)*lengthOfArray)
//We are using binary search over height here..not on array
//    We have not sorted array because it also takes extra time complexity of O(nlogn)...
//    toh humne chalaaki se tree ki height pe binary search lgaya
    static int woodCutterProblem(int a[], long k) {
        int l = 0;
        int r = 0;
        for (int e : a) {
            l = Math.min(r, e);//at least mtlb utna chahiye toh hum poochenge ki maximum kitna length ka cut lgale vo hume dega min
            r = Math.max(r, e);//max r nikaal liya array ka max element
        }
        int ans = -1;
//        toh hum maximum length ka cut lga rhe h...agrat least utna na mile toh chhota cut lgao
        while (l <= r) {
            int mid = (l + r) / 2;//mid length ka cut lgake dekha
            if (isEnough(a, k, mid)) {
                ans = mid;
                l = mid + 1;//at least bola h toh jyaada se jyaada kr skte h
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isEnough(int[] a, long k, int cut) {

        int total = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > cut) {
                total += (a[i] - cut);
            }
        }
        return total >= k;//at least bola h na  toh k se bdi ya k jitni
    }

    public static void main(String[] args) {
        int a[] = {3, 1, 4, 7, 2, 5, 2, 9};
        int k = 7;
        System.out.println(woodCutterProblem(a, k));
    }
}