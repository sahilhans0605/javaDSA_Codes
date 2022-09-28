package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelectionProblem {

    static class Pair implements Comparable<Pair> {
        int s;
        int e;

        public Pair(int s, int e) {
            this.s = s;
            this.e = e;
        }

        @Override
        public int compareTo(Pair that) {
            return this.e - that.e;
        }
    }

    int activitySelection(int start[], int end[], int n) {
        ArrayList<Pair> activity = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            activity.add(new Pair(start[i], end[i]));
        }

        Collections.sort(activity, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.e > o2.e) return 1;
                else if (o1.e < o2.e) return -1;
                return 1;
            }
        });
        int ans = 1;
        int limit = activity.get(0).e;
        for (int i = 0; i < activity.size(); i++) {
            if (activity.get(i).s > limit) {//starting time is greater than the ending time
                limit = activity.get(i).e;
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
