import java.util.*;
public class Pair {
    public static void printPair(int arr[]){
        int i,j,curr,swap=0;
        for(i = 0; i<arr.length; i++){
            curr = arr[i];
            for(j = i+1; j<arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] +")");
                swap++;
            }
            
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println(swap);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        printPair(arr);
    }
}
