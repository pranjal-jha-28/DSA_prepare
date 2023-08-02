import java.util.*;

public class SubArray {
    public static int nextSubArray(int[] arr){
        int cs = 0,i;
        int min = Integer.MIN_VALUE;
        for(i=0; i<arr.length; i++){
            cs = cs + arr[i];
            min = Math.max(min,cs);
            if(cs<0){
                cs = 0 ;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        nextSubArray(arr);
    }

}
    