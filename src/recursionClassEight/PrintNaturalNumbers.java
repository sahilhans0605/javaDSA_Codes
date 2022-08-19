package recursionClassEight;

public class PrintNaturalNumbers {

    static public void printNaturalNumbers(int N) {
        if (N == 0) {
            return;
        }
//        all these calls are saved in stacks

//        for every parameter in function...n here new memory space is allocated in stack every time the function is called
//        n is created again and again(7 steps hence 7 times)..memory space
//        1.Base condition true...n==0...return to previous(below) layer
//        2.printNumb(3)---->prints 1 and n=0 (call) No more statements written below n-1...hence return again
//        3.printNumb(2)---->prints 2 and n=1 (call)
//        4.printNumb(3)---->prints 3 and n=2 (call)
//        5.printNumb(4)---->prints 4 and n=3 (call)
//        6.printNumb(5)---->prints 5 and n=4 (call)
//        7.Main n=5 (call)

//        System.out.println(N);//if we put it here 5 4 3 2 1 output..because it first prints after that it calls another function
        printNaturalNumbers(N - 1);//if the method calling again comes at end
        // ...it is called tail recursion
//        If a recursive function calling itself
//        and that recursive call is the first statement in the function then it’s known as Head Recursion.
        System.out.println(N);

    }

    public static void main(String[] args) {
        int N = 5;
        printNaturalNumbers(N);
    }
}
