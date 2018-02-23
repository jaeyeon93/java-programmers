package yoon;

class BankAccount {
    int balence = 0;

    public int deposit(int amount){
        // 입금을 담당하는 메소드
        balence += amount;
        return balence;
    }

    public int withdraw(int amount){
        // 출금을 담당하는 메소드
        balence -= amount;
        return balence;
    }

    public int checkMyBalence(){
        System.out.println("잔액 : " + balence);
        return balence;
    }
}

public class DupRef {
    public static void main(String [] args){
        BankAccount ref1 = new BankAccount();
        BankAccount ref2 = ref1;
        // ref1이 참조하는 대상을 ref2도 참조

        ref1.deposit(3000);
        ref2.deposit(2000);
        ref1.withdraw(400);
        ref2.withdraw(300);
        ref1.checkMyBalence();
        ref2.checkMyBalence();
    }
}
