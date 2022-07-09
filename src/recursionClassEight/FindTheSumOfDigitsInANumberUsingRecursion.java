package recursionClassEight;
//if n is the number time complexity is log n..

// because number of digits in a number is Logn(base 10)+1.....ignore coeff..for time complexity
// and for space complexity...dekho digits isme log n h toh time complexity toh log n ho gyi aur stack mein bhi log n steps honge then space complexity bhi log n ho gyi
//acha O(1) space  mein krna ho toh?--->For loop se kro...recursion se mt kro
public class FindTheSumOfDigitsInANumberUsingRecursion
{
    static int SumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + SumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int ans = SumOfDigits(1234);
        System.out.println(ans);
    }
}
