package yoonBook;

public class Problem5_4 {
    public static void main(String [] args){
        int num = 1;
        int sum = 0;
        while(num < 1001){
            if(num % 2 == 0 && num % 7 == 0){
                sum += num;
            }
            num++;
        }
        System.out.println(sum);
    }
}
