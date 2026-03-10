// Given an array arr[] of integers and another integer target. 
// Determine if there exist two distinct indices such that the 
// sum of their elements is equal to the target.
// Without using extra space.
package Arrays;

import java.util.Arrays;

public class TwoSum {
    private static boolean twoSumCheck(int arr[], int target) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while(i < j) {
            if(arr[i] + arr[j] > target)
                j--;
            else if(arr[i] + arr[j] < target)
                i++;
            else if(arr[i] + arr[j] == target) 
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        if(twoSumCheck(arr, -2))
            System.out.println("Two sum pair exist.");
        else System.out.println("Two sum pair doesn't exist.");

    }
    
}
