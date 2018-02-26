public class BusExam {
    public static void main(String [] args){
        Car c = new Bus();
        c.run();
        //c.pang(); error

        //Bus bus = c;
        Bus bus = (Bus)c;
        bus.pang();
    }
}
