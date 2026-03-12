// Move zero's to the end of an array
public class MoveZeroToTheEnd {
    private static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private static void moveZeroToEnd(int arr[]) {
        int i = 0,j = 0;
        while(j < arr.length) {
            if(arr[j] != 0) {
                swap(arr, i, j);
                i++; j++;
            }
            else j++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,0,5,0,0,9,9,7,8,6,4,7,0,0};
        System.out.println("Array is: ");
        for(int a: arr)
            System.out.print(a + " ");
        System.out.println();
        moveZeroToEnd(arr);
        for(int a: arr)
            System.out.print(a + " ");
    }
}
