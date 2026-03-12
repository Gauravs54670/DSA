

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    private static List<Integer> removeDuplicate(int arr[]) {
        List<Integer> list = new ArrayList<>();
        int i = 0,j = 1;
        if(arr.length == 1) {
            list.add(arr[i]);
            return list;
        }
        while(j < arr.length) {
            if(arr[j] != arr[i]){
                list.add(arr[j]);
                i = j;
                j++;
            }
            else j++;
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,5,8,8,9,9,16,16};
        System.out.println("Removed Duplicates list " + removeDuplicate(arr));
    }
}
