import java.util.*;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i, f=0,swap;
        int [] arr = new int[n];
        int l = arr.length-1;
        for(i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        while(f<l){
            swap =  arr[l];
            arr[l] = arr[f];
            arr[f] = swap;
            f++;
            l--;
        }

        for(i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}