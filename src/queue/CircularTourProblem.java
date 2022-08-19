package queue;

//Find the starting point such that one full circle gets completed
//1 unit distance = 1litre petrol
//tank capacity is unlimited
public class CircularTourProblem {

    static int circularTour(int petrol[], int[] distance) {
        int n = petrol.length;
        int curr = 0;
        int prevTotal = 0;//deficit
        int start = 0;
        for (int i = 0; i < n; i++) {
            curr += petrol[i] - distance[i];
            if (curr < 0) {
                prevTotal += curr;
                curr = 0;
                start = i + 1;
            }
        }
        if (curr + prevTotal >= 0) {
            return start;
        }
        return -1;
    }

    public static void main(String[] args) {
        int p[] = {6, 10, 2, 3, 20};
        int d[] = {5, 8, 4, 5, 6};
        int ans = circularTour(p, d);
        System.out.println(ans);

    }
}
