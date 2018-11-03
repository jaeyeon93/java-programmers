import java.util.Scanner;

public class PascalTriangle {
    public static int [] pascal(int num) {
        if (num == 1) {
            int [] arr = {1};
        }

        if (num == 2) {
            int [] arr = {1, 1};
        }
        int [] arr = new int [num];
        arr[0] = 1;

        for (int i = 1; i <= num-2; i++) {
            arr[i] = pascal(num-1)[i-1] + pascal(num-1)[i];
        }
        arr[arr.length-1] = 1;
        return arr;
    }

    public static void printLayer(int [] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            printLayer(pascal(i));
            System.out.println();
        }
    }
}
