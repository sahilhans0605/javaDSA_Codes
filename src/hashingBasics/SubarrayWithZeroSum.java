package hashingBasics;
//Diff between set s1 = new hashSet() and HashSet s2 = new hashSet()
//when we use set we don't have any conusion that we are using hashset or linkedhashset...so we can operate easily set to set
//1.interconversion between 2 objects that are using same interface
//2.abstraction layer--->uses functionality of set only
//use wise koi farak nhi padta set se bnao ya hashset se
import java.util.HashSet;

public class SubarrayWithZeroSum {

    static boolean subarrayWithZeroSum(int a[]) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        set.add(0);//because agr(10,-10) hua ya fir 0 hua array mein
        for (int e : a) {
            sum += e;
            if (set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = {10, -10};
        System.out.print(subarrayWithZeroSum(a));
    }
}
