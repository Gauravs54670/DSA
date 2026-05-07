public class Segregate0and1 {
    private static void segregate(int[] arr) {
        int i = 0,j = 0;
        while(j < arr.length) {
            if(arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j++;
            }
            else j++;
        }
        for(int a : arr)
            System.out.println(a);
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregate(arr);
    }
}
