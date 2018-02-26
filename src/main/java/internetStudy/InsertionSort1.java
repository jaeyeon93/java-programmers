import java.util.Scanner;

public class InsertionSort1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = scanner.nextInt();
        }
        inseration(n, arr);
        scanner.close();
    }

    static void inseration(int n, int[] arr) {
        for(int k=0;k<arr.length-1;k++){
            for(int i=0;i<arr.length-1;i++){
                int key = arr[k+1];
                if(i==k+1)
                    break;
                if(arr[i]>key){
                    arr[k+1]=arr[i];
                    arr[i]=key;
                }
            }

            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }


}
