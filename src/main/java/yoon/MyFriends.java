package yoon;

class UnivFriend extends Friend {
    private String major;

    public UnivFriend(String na, String ma, String ph) {
        super(na, ph);
        major = ma;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("전공 : " + major);
    }
}

class CompFriend extends Friend {
    private String department;

    public CompFriend(String na, String de, String ph) {
        super(na, ph);
        department = de;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("부서 : " + department);
    }
}



public class MyFriends {
    public static void main(String [] args){
        UnivFriend[] ufrns = new UnivFriend[5];
        int ucnt = 0;

        CompFriend[] cfrns = new CompFriend[5];
        int ccnt = 0;

        ufrns[ucnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
        ufrns[ucnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");

        cfrns[ccnt++] = new CompFriend("YOON", "R&D 1", "02-123-999");
        cfrns[ccnt++] = new CompFriend("PARK", "R&D 2", "02-321-777");

        for(int i = 0; i < ucnt; i++){
            ufrns[i].showInfo();
            System.out.println();
        }

        for(int i = 0; i < ccnt; i++){
            cfrns[i].showInfo();
            System.out.println();
        }
    }
}
