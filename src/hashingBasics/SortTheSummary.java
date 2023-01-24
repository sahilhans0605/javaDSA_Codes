package hashingBasics;

import java.util.*;

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class SortTheSummary {
    public static void main(String[] args) {
        int a[] = {3, 3, 1, 2, 1};
//
//        List<Pair> al = new ArrayList<>();
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < a.length; i++) {
//            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
//        }
//
//        for (Map.Entry<Integer, Integer> k : map.entrySet()) {
//            al.add(new Pair(k.getKey(), k.getValue()));
//        }
//
//        Collections.sort(al,(n1,n2)->{
//            if(n1.second==n2.second){
//                return n1.first-n2.first;//increasing order if frequency are same
//            }
//           return n2.second-n1.second;//decreasing order of frequency
//        });
//
//        for(int i=0;i<al.size();i++){
//            Pair p= al.get(i);
//            System.out.println(p.first+" "+p.second);
//            System.out.print(Arrays.asList(p.first,p.second));
//        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        Pair[] arr = new Pair[map.size()];

        int l = 0;
        for (Map.Entry<Integer, Integer> k : map.entrySet()) {
            arr[l] = new Pair(k.getKey(), k.getValue());
            l++;
        }

        Arrays.sort(arr,(n1,n2)->{
            if(n1.second==n2.second){
                return n1.first-n2.first;//increasing order if frequency are same
            }
           return n2.second-n1.second;//decreasing order of frequency
        });

        int[][] twoD = new int[map.size()][map.size()];
        for (int j = 0; j < arr.length; j++) {
            Pair p = arr[j];
            int[] newArray = new int[2];
            newArray[0] = p.first;
            newArray[1] = p.second;
            twoD[j] = newArray;
        }

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[0].length; j++) {
                System.out.print(twoD[i][j]);
            }
            System.out.println();
        }
    }
}
