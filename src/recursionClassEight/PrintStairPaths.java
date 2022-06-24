package recursionClassEight;
//Time Complexity :
//O(3^n)
//
//The time complexity of the above solution is exponential
//From each state, 3 recursive functions are called. So time complexity is O(3^n).
//Space complexity--->O(N)...string of length n
public class PrintStairPaths {
    static void printStairPaths(int n, String psf) {
        if(n<=0){
            if( n==0){
                System.out.println(psf);
            }
            return;
        }

        printStairPaths(n - 1, psf + 1);
        printStairPaths(n - 2, psf + 2);
        printStairPaths(n - 3, psf + 3);
    }

    public static void main(String[] args) {
        int n = 3;
        printStairPaths(n, "");
    }
}
