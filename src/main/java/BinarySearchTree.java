public class BinarySearchTree {
    public static void main(String[] args) {
    }

    public static void binarySearch(int [] arr, int n) {
        int left = 0;
        int right = arr.length-1;
        int mid;

        while (left <= right) {
            mid = (right + left)/2;

            if (arr[mid] == n) {
                break;
            }

            if (arr[mid] > n)
                right = mid-1;
            else
                left = mid+1;
        }
    }
}
