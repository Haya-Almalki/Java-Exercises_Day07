public class TestMyTime {

    public static void main(String[] args) {
        MyTime myTime=new MyTime(10,15,2);
        System.out.println(myTime);
        //test getter methods:
        System.out.println(myTime.getHour());
        System.out.println(myTime.getMinute());
        System.out.println(myTime.getSecond());

        //test setter methods:
        myTime.setSecond(10);
        myTime.setMinute(2);
        myTime.setHour(12);
        //test next time:
        System.out.println("check next Hour: "+myTime.nextHour());
        System.out.println("check next Minute: "+myTime.nextMinute());
        System.out.println("check next second: "+myTime.nextSecond());
        //test previous time:
        System.out.println("check previous hour: "+myTime.previousHour());
        System.out.println("check previous Minute: "+myTime.previousMinute());
        System.out.println("check previous second: "+myTime.previousSecond());

    }
}
