package yoon;

class Friend {
    protected String name;
    protected String phone;

    public Friend(String na, String ph){
        name = na;
        phone = ph;
    }

    public void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("전화 : " + phone);

    }
}

public class MyFriends2 {
    public static void main(String [] args){
        Friend[] frns = new Friend[10];
        int cnt = 0;

        frns[cnt++] = new UnivFriend("LEE","Computer", "010-333-555");
        frns[cnt++] = new UnivFriend("SEO","Electronics", "010-222-444");
        frns[cnt++] = new CompFriend("YOON", "R&D 1", "02-123-999");
        frns[cnt++] = new CompFriend("PARK", "R&D 2", "02-321-777");

        //모든 동창에 관한 정보 전체 출력
        for(int i = 0; i < cnt; i++){
            frns[i].showInfo(); // 오버라이딩한 메소드 호출
            System.out.println();
        }
    }
}
