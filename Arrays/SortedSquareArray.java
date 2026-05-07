import java.util.Arrays;

public class SortedSquareArray {
    private static void printSquareSortedArray(int[] arr) {
        int n = arr.length;
        int i = 0,j = n-1,k = n-1;
        int[] result = new int[n];
        boolean[] flag = new boolean[n];
        Arrays.fill(flag, false);
        while(i < j) {
            if(!flag[i]) {
                arr[i] = arr[i] * arr[i];
                flag[i] = true;
            }
            if(!flag[j]) {
                arr[j] = arr[j] * arr[j];
                flag[j] = true;
            }
            if(arr[j] > arr[i]) {
                result[k] = arr[j];
                j--; k--;
            }
            if(arr[i] > arr[j]) {
                result[k] = arr[i];
                i++; k--;
            }
        }
        result[k] = arr[i];
        for(int a: result)
            System.out.print(a + " ");
    }
    public static void main(String[] args) {
        int[] arr = {-5,-3,-2,-1};
        printSquareSortedArray(arr);
    }
}
