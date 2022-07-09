package recursionClassEight;
//Top left corner to bottom right corner
//(0,0)--->(n-1,m-1)
// example for 2X2 matrix only two paths are possible

//
// Step 1 find base case...So if N==1 or M==1..means only one row or one column...this means only one path is possible
//so we found the base case...N==1 || M==1...return 1 path possible
//[ down or right |  |  ]
//[  |   | ]
//[  |   | ]
//means agr 2X2 ka matrix h to ya left jao ya right jao...fir jis bhi jagah pe gye vha se bhi 2 hi path possible h
//mtlb general ans ans(1)path+ans(2) path
//Time complexity O(2^n)
//because every function is breaking in left+down....2 and 2

public class NumberOfPathsInAnNXMMatrix {
    static int numberOfPaths(int n, int m) {
        if (n == 1 || m == 1) {//here N==2 wil not be correct because...N(rows) agr 2 hogyi toh columns kitne bhi ho skte h....
//            but for N==1....only one line to travel
            return 1;
        }
        int rightSideAns = numberOfPaths(n, m - 1);//right side mein ek column cross krliya isliye m-1
        int downSideAns = numberOfPaths(n - 1, m);//left side mein ek row cross krli isliye ab jo bacha hua ans h usme se 1 row hta do
        return rightSideAns + downSideAns;
    }

    public static void main(String[] args)
    {
        System.out.println(numberOfPaths(4,3));
    }
}
