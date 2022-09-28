package greedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsackProblem {

    class Item {
        int value;
        int weight;

        public Item(int weight, int value) {
            this.value = value;
            this.weight = weight;
        }
    }

    class itemComparator implements Comparator<Item> {
        public int compare(Item a, Item b) {
            double r1 = (double) a.value / (double) a.weight;
            double r2 = (double) b.value / (double) b.weight;
            if (r1 < r2) return 1;
            else if (r1 > r2) return -1;//because we want to sort in descending order
            else return 0;
        }
    }

    double fractionalKnapsack(int W, int n, Item arr[]) {//array is of item type...we want to compare value/weight...so we made a s=comparator which will be comparing value/weight
        Arrays.sort(arr, new itemComparator());
        double currWeight = 0.0;
        double finalValue = 0.0;

        for (int i = 0; i < n; i++) {//array pe iterate krrhe hai...array reverse sort ho chuka hai
            if (arr[i].weight + currWeight <= W) {
                currWeight += arr[i].weight;
                finalValue += arr[i].value;
            } else {
                double remaining = W - currWeight;
                finalValue += (double) arr[i].value / (double) arr[i].weight * remaining;
                break;//important
            }
        }
        return finalValue;
    }

    public static void main(String[] args) {

    }
}
