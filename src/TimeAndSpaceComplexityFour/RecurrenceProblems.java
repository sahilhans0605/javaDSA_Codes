package TimeAndSpaceComplexityFour;

public class RecurrenceProblems {
    public static void main(String[] args) {
//1*********************T(n)=T(n-1)+c...toh isme n reduce ho ho ke 0 hojaayega
// T(n-1)+c...ho jaayega...har baar T(n-1)...T(n-1) mein jaayega
//2*********T(n) = 2 T(n-1)+c............Ek T(n)...Two T(n-1) mein tootega...aur saath mein ek c....
//        phir agli baar dono T(n-1)...do T(n-2) each mein tootega...aur 2 c aayenge....mein c+2c+4c
//        which gives a GP...a(r^n-1)/(r-1)....toh 2^n...O(2^n)
//        T(n) = 2T(n/2)+nc
    }
}
