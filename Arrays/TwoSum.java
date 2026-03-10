package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    // Given an array arr[] of integers and another integer target. 
    // Determine if there exist two distinct indices such that the 
    // sum of their elements is equal to the target.
    // Without using extra space.
    private static boolean twoSumCheckWithoutExtraSpace(int arr[], int target) {
        int copy[] = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int i = 0, j = arr.length - 1;
        while(i < j) {
            if(copy[i] + copy[j] > target)
                j--;
            else if(copy[i] + copy[j] < target)
                i++;
            else if(copy[i] + copy[j] == target) 
                return true;
        }
        return false;
    }
    // Given an array arr[] of integers and another integer target. 
    // Determine if there exist two distinct indices such that the 
    // sum of their elements is equal to the target.
    // With using extra space.
    private static boolean twoSumCheckWithExtraSpace(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++) {
            int a = target - arr[i];
            if(!map.isEmpty() && map.containsKey(a))
                return true;                
            map.put(arr[i],i);
        }
        return false;
    }
    // Given an array arr[] of integers and another integer target. 
    // Return two pair if exist two distinct indices such that the 
    // sum of their elements is equal to the target.
    // Without using extra space.
    private static List<Integer> twoSumPairIndices(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++) {
            int a = target - arr[i];
            if(!map.isEmpty() && map.containsKey(a))
                return List.of(i,map.get(a));
            map.put(arr[i],i);
        }
        return List.of();
    }
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        if(twoSumCheckWithoutExtraSpace(arr, -2))
            System.out.println("Two sum pair exist.");
        else System.out.println("Two sum pair doesn't exist.");
        if(twoSumCheckWithExtraSpace(arr, -2))
            System.out.println("Two sum pair exist.");
        else System.out.println("Two sum pair doesn't exist.");
        System.out.println(twoSumPairIndices(arr, -2));
    }
    
}
