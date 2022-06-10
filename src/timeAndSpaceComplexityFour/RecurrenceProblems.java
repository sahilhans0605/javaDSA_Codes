package timeAndSpaceComplexityFour;

public class RecurrenceProblems {
    public static void main(String[] args) {
//1*********************T(n)=T(n-1)+c...toh isme n reduce ho ho ke 0 hojaayega
// T(n-1)+c...ho jaayega...har baar T(n-1)...T(n-1) mein jaayega
//2*********T(n) = 2 T(n-1)+c............Ek T(n)...Two T(n-1) mein tootega...aur saath mein ek c....
//        phir agli baar dono T(n-1)...do T(n-2) each mein tootega...aur 2 c aayenge....mein c+2c+4c
//        which gives a GP...a(r^n-1)/(r-1)....toh 2^n...O(2^n)
//        T(n) = 2T(n/2)+nc....constant waali cheez se check krte h kitne operations perform hue h
//        ... har baar n-->n/2 mein jaata jaayega...to c waale ke saath dekhna hota h...first time toh nc--->then n-->n/2
//        hua n/2 c + n/2c....har step mein add krenge toh nc...hojaayega....nc(k)...
    }
}
