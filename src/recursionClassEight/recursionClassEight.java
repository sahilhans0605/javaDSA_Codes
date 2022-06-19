//steps for recursion
//1.Find the base case(that will stop the recursion loop)
//2.Find relation between problem and subproblem
//3.generalise this relation
//Is there a sub problem
//Do these sub problem have a sub structure
//Recursive leap of faith.....f(5)=5+fun(4)
//recursion takes memory and a lil bit more time but it is easier to solve question via recursion
package recursionClassEight;

public class recursionClassEight {
    static void dummyFunction() {
        int i = 0;
        System.out.println(i++);
        dummyFunction();//this function will be called again and again, and one time will come when stack will be overflowed
        // and java will not allow more memory usage
        // i value will not be incremented as we have
        // not applied any stop condition to it
    }

    public static void main(String[] args) {
        dummyFunction();//if function calls itself it is called recursion
    }
}
