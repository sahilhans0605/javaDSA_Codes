package greedyAlgorithm;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        int deno[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int v = 49;
        int coins = 0;
        for (int i = deno.length - 1; i >= 0; i--) {
            while (deno[i] <= v) {
                v -= deno[i];
                coins++;
            }
        }
        System.out.println(coins);
    }
}
