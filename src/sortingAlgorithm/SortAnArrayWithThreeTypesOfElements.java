package sortingAlgorithm;

public class SortAnArrayWithThreeTypesOfElements {

//    DutchNationalFlag sorting algorithm:

//    0--->low(red)/low--->mid(white)/mid--->high(unknown)/high--->end(blue)
//    If(arr[mid]==0)
//    we will swap arr[low] and arr[mid]low++,mid++
//else if(arr[mid]=1)mid++;
//    else if arr[mid]=2...we will swap arr[mid] and arr[high] high--

//    LOW IS DENOTING WHERE OUR 0 IS STARTING
//    MID IS DENOTING WHERE OUR UNKNOWN IS STARTING
//    HIGH IS DENOTING WHERE OUR 2 IS STARTING

//    and jese hi unknown region finish ho jaayegi array will be sorted
//TIME COMPLEXITY O(N)
    //STEPS we will be starting low and mid pointers from start of our array and high pointer from end of our array
    public static void main(String[] args) {
        int a[] = {1, 1, 2, 0, 0, 1, 2, 2, 1, 0};
        int low = 0;
        int mid = 0;
        int high = a.length - 1;
        while (mid <= high) {
            if (a[mid] == 1) {
                mid++;
            } else if (a[mid] == 0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            } else {
                int temp = a[high];
                a[high] = a[mid];
                a[mid] = temp;
                high--;
                mid++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
