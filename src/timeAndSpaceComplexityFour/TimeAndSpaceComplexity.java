//o(1)~o(log n)<o(n)<o(n log n)<o(n^2)<o(n^3/4)<o(2^n)<o(n!)
//O(nn) > O(n!) > O(n3) > O(n2) > O(n.log(n)) > O(n.log(log(n))) > O(n) > O(sqrt(n)) > O(log(n)) > O(1)
//Main thing:::::for online judges(O(10^8) rule)
//        If n <= 12 the time complexity can be O(n!)

//        If n <= 25 the time complexity can be O(2^n). .
//
//        If n <= 100 the time complexity can be O(n^ 4)
//
//        If n<=500. the time complexity can be O(n^3 ) .
//
//        If n<=10 4 the time complexity can be O(n^2)...it is important...n^2 se jyaada ni

//        If n<=10 5 the time complexity can be O(n^2)...it is important...n se jyaada ni...10^5 ka square 10^8 se jyaada ho jaata h
//
//        If n<= 106 , the time complexity can be O(nlogn)....2 power nhi chalegi na
//
//        If n <= 108 the time complexity can be O(n).....1 power

//        If n > 108 the time complexity can be O (log n )or O(1).(10^8 ki kitni power 10^8 se kam rhegi)

package timeAndSpaceComplexityFour;
//TimeAndSpace complexity is differentiated by using Asymptotic notation
//Big O / Omega/ Theta
public class TimeAndSpaceComplexity {
    public static void main(String[] args) {
//**************BIG O (Worst case time complexity)...and we always refer to worst case only...(Upper bound)
//        Example for linear search in an array...Worst case time complexity is O(n)..
//        Worst case time complexity how much maximum time it can take?---->find the biggest degree and ignore the constant
//        Ok so let's discuss time complexity of some algorithm
//        1.f(n)= an^2+bn^4+c----->Worst case time complexity = n^4
//        2.f(n)= (an/4)+bn----->Worst case time complexity = n
//        3.f(n)= 100----->Worst case time complexity = 1(constant)
        //4.f(n)= nLogn+bn----->Worst case time complexity = nLogn


//OMEGA********Best case Time complexity(minimum time required)....(Lower bound)
//        1.f(n)= an^2+bn----->Best case time complexity = n
//        2.f(n)= nLogn+bn----->Best case time complexity = n
//        TIme nLogn>n>Logn

//************THETA.....Average time complexity.....(Tight bound)...theta(n/2)...ko bhi theta(n)hi maante h isse tight nhi
//        1.f(n)= an^2+b----->Average case time complexity = n^2
//        Basically theta...ki bhai itne operations toh pkka perform krne padenge... jese sum krein agr for loop se....toh theta(n)


//        Now examples:::::::::::::::::::

//        Insertion sort.....For loop ke andar for loop hota h....
//        upar waala loop (bahr waala loop pure array pe iterate krega)...lekin andar waala swap krke elements ko break kr jaayega
//  Worst case....O(n^2)
//  Best case......Omega(n)...when array is sorted
//  Theta(n^2)...isse kam tight nhi kr paayenge...kyoki maximum times n^2 jaayega

//    But we always need to focus on O(Big O)...it is the main

//    What does it mean when we say that an algorithm X is asymptotically more efficient than Y?
//************Answer===  X will always be a better choice for large inputs
//        https://www.interviewbit.com/courses/programming/topics/time-complexity
// The questions in above link are solved check them once
    }

}
