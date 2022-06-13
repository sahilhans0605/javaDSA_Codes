package matrix2DArrays;

//Brute force two for loop O(N*m)
public class SearchElementInRowAndColumnsWiseSorted {
    //    Better way O(N+M)************************************
    public static boolean searchInSortedMatrix(int a[][], int key) {
        int row = 0;
        int col = a.length - 1;
        while (row < a.length && col >= 0) {
            if (a[row][col] == key) {
                return true;
            } else if (key > a[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 4, 5, 7}, {2, 5, 6, 9}, {6, 10, 11, 13}, {8, 12, 15, 18}};
        boolean found = searchInSortedMatrix(a, 14);
        if (found) {
            System.out.println("Key present!");
        } else {
            System.out.println("Key not present!");
        }
    }
}
