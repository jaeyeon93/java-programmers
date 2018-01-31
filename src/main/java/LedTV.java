public class LedTV implements TV {
    public void on(){
        System.out.println("켜다");
    }
    public void off(){
        System.out.println("끄다");
    }
    public void volume(int value){
        System.out.println(value + "로 볼륨조정하다.");
    }
    public void channel(int number){
        System.out.println(number + "로 채널조정하다.");
    }
}