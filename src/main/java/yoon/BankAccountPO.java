package yoon;

public class BankAccountPO {
    static int balence = 0; // 예금 잔액
    public static void main(String [] args){
        deposit(10000);
        // 입금
        checkMyBalence(); // 잔액조회
        withdraw(3000); //출금
        checkMyBalence(); // 잔액조회
    }

    public static int deposit(int amount){
        // 입금을 담당하는 메소드
        balence += amount;
        return balence;
    }

    public static int withdraw(int amount){
        // 출금을 담당하는 메소드
        balence -= amount;
        return balence;
    }

    public static int checkMyBalence(){
        //예금조회 담당하는 메소드
        System.out.println("잔액 : " + balence);
        return balence;
    }
}
