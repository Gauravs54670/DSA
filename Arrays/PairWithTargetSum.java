import java.util.Scanner;

public class PairWithTargetSum {
    private static void findPairWithTargetSum(int[] arr, int target) {
        int i = 0,j = arr.length - 1;
        boolean flag = false;
        while(i < j) {
            int sum = arr[i] + arr[j];
            if(sum == target) {
                System.out.println("Pair of sum equals to target " + target + "is");
                System.out.println(arr[i] + " " + arr[j]);
                flag = true;
                break;
            }
            else if(sum > target) j--;
            else i++;
        }
        if(!flag) System.out.println("No pair found.");
    }
    public static void main(String[] args) {
        System.out.println("Enter numbers (only 5 numbers)");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        findPairWithTargetSum(arr, target);
    }
}
