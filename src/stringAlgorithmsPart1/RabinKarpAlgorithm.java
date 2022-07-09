package stringAlgorithmsPart1;

public class RabinKarpAlgorithm {
    // d is the number of characters in the input alphabet
    public final static int d = 256;

    /* pat -> pattern
        txt -> text
        q -> A prime number
    */
    static void search(String pat, String txt, int q) {
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;

        // The value of h would be "pow(d, M-1)%q"
        for (i = 0; i < M - 1; i++)
            h = (h * d) % q;

        // Calculate the hash value of pattern and first
        // window of text
        for (i = 0; i < M; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        // Slide the pattern over text one by one
        for (i = 0; i <= N - M; i++) {

            // Check the hash values of current window of text
            // and pattern. If the hash values match then only
            // check for characters one by one
            if (p == t) {
                /* Check for characters one by one */
                for (j = 0; j < M; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }

                // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
                if (j == M)
                    System.out.println("Pattern found at index " + i);
            }

            // Calculate hash value for next window of text: Remove
            // leading digit, add trailing digit
            if (i < N - M) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + M)) % q;

                // We might get negative value of t, converting it
                // to positive
                if (t < 0)
                    t = (t + q);
            }
        }
    }

    public static void main(String[] args) {
//Rabin karp algorithm works on fundamental principal(hash table) and hash table is generated from hash function
//Giving text and pattern a numeric representation to match strings
//But suppose we give numeric values from A-Z as 1-26
//then sum value of (hash function) ABB will be equal to BAB....it is called a spurious hit
//And 'spurious' hit increases the time complexity of algorithm
//        So as to avoid this collisions we will be taking bit complex hash function for pattern matching
//        If we have high number of spurious hits then time complexity would be O(mXn)
//        But if we choose a good hash function then the complexity can be reduced to O(n-m+1)
//        AND THAT WAY FAR BETTER ALGORITHM IS RABIN KARP ALGORITHM:
//         RABIN KARP ALGORITHM EXPLANATION
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";

        // A prime number
        int q = 101;

        // Function Call
        search(pat, txt, q);

    }
}
