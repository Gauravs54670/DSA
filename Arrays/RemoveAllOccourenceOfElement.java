// Given an array and a key,
// the task is to remove all occurrences of the specified key from the array
import java.util.Scanner;

public class RemoveAllOccourenceOfElement{
    private static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private static int removeAllOccourenceOfElement(int arr[], int k) {
        int i = 0,j = 0;
        while(j < arr.length) {
            if(arr[j] != k) {
                swap(arr, i, j);
                i++; j++;
            }
            else j++;
        }
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {3, 9, 2, 3, 1, 7, 2, 3, 5};
        System.out.println("Array is");
        for(int a: arr) 
            System.out.print(a+" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter key");
        int key = sc.nextInt();
        System.out.println("All occourence removed of element array");
        int range = removeAllOccourenceOfElement(arr, key);
        for(int i = 0; i<range; i++)
            System.out.print(arr[i] + " ");
        sc.close();
    }
}