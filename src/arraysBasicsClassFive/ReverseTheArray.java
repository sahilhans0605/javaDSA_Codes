package arraysBasicsClassFive;

public class ReverseTheArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int left = 0;
//        int right = a.length - 1;
//        while (left < right) {
//            int temp = a[left];
//            a[left] = a[right];
//            a[right] = temp;
//            left++;
//            right--;
//        }
//        OR**********************
        System.out.println("Reversed Array \n");
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


//         ----------------ARRAY LIST---------------------------
//        for(int i=0;i<arr.size()/2;i++){
//            int temp=arr.get(i);
//            arr.set(i, arr.get(arr.size()-i-1));
//            arr.set(arr.size()-i-1,temp);
//
//        }
//        for(int e:arr){
//            System.out.print(e+" ");
//        }
    }
}
