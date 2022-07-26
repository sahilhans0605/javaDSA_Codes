package hashingBasics;

public class Contract {
    public static void main(String[] args) {
//        1.if we call s1.hashCode() again and again then it will return same rollNumber again and again
//        PS: if we donot make any method in Custom class(student) then the object reference will be returned instead of roll number
//        2. if s1.equals(s2)=true..then hashcode of s1 will be equal to s2
//        3. rule important--->
        // if s1.equals(s2) returns false...then it is possible that their hashcode are equal, and it is called collision
    }
}
