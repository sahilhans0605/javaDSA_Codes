package recursionClassEight;
//1(full problem)
//2                                 1(sub problem...chhota tower)
//3                                 2


public class TowerOfHanoi {
    static void towerOfHanoi(int n, char from, char to, char aux) {
        //STEPS
//        A,B,C are tower number 1,2,3....and n is number of disks
//        n-1 ko A--->B pe le jao using c...ab n-1 sub problem bn gyi
//        number of steps = 2^n-1

        if (n == 0) {
            return;
        }

        //aux is helper

        towerOfHanoi(n - 1, from, aux, to);//from se aux pe rkho...to ki help se
        System.out.println("Move " + n + " from " + from + " to " + to);
        towerOfHanoi(n - 1, aux, to, from);//aux se to pe rkhdo from ki help se
    }

    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'C', 'B');
//        A is source
//        B is helper
//        C is destination
//        Number of steps = 2^n-1
//        O(2^n-1)~2^n...time complexity and space complexity ...number of  steps 2^n...

    }
}
