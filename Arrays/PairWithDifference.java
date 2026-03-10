// Given an array, arr[] and an integer x, 
// return true if there exists a pair of elements in the array whose absolute difference is x,
//  otherwise, return false.
package Arrays;

import java.util.Arrays;

public class PairWithDifference {
    private static boolean findPair(int arr[], int target) {
        Arrays.sort(arr);
        int i = 0, j = 1;
        while(j < arr.length) {
            if(i == j) {
                j++;
                continue;
            }
            int difference = arr[j] - arr[i];
            if(difference == target) return true;
            else if(difference < target) j++;
            else if(difference > target) i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,7,1,10};
        System.out.println(findPair(arr, 8));
    }
    
}
