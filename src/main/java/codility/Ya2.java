package codility;

public class Ya2 {
    public static int solution(int [] A) {
        if (A.length==2)
            return 1;

        int count = 0;
        for (int i = 0; i < A.length-2; i++) {
            if (A[i] == A[i+1] && A[i+2] > A[i]) {
                System.out.println(i +"일때, 계곡");
                count++;
            }

            if (A[i] < A[i+1] && A[i+1] > A[i+2]) {
                System.out.println(i+1+"일때, 언덕");
                count++;
            }
        }
        if (A[A.length-1] > A[A.length-2]) {
            System.out.println("마지막은 언덕");
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = {2,2,3,4,3,3,2,2,1,1,2,5};
        int result = solution(arr);
        System.out.println("result : " + result);
    }
}
