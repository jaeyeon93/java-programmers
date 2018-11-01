package topcoder;

public class AOPaper {
    public static String canBuild(int [] A) {
       for (int i = A.length-1; i > 0; i--) {
           A[i-1] += A[i]/2;
       }
       if (A[0] == 0)
          return "Impossible";
       return "Possible";
    }

    public static void main(String[] args) {
        int [] arr = {0, 3};
        int [] arr2 = {0,1,2};
        int [] arr3 = {0,0,0,0,15};
        int [] arr4 = {2,0,0,0,0,0,0,3,2,0,0,5,0,3,0,0,1,0,0,0,5};
        System.out.println(canBuild(arr));
        System.out.println(canBuild(arr2));
        System.out.println(canBuild(arr3));
        System.out.println(canBuild(arr4));
    }
}
