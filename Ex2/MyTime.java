import java.text.DecimalFormat;

public class MyTime {

    private int hour=0;
    private int minute=0;
    private int second=0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour,minute,second);
    }
    public void setTime(int hour, int minute, int second) {


            if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59)
                    && (second >= 0 && second <= 59)) {
                this.hour = hour;
                this.minute = minute;
                this.second = second;
            }
            else{
                throw new IllegalArgumentException("Invalid hour, minute, or second!");
                 }
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute=minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second=second;
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("00");
        return df.format(hour) +
                ":" + df.format(minute) +
                ":" + df.format(second);
    }
    public MyTime nextSecond(){
        if (this.second==59){
            this.setSecond(0);
            nextMinute();
        }
        else
            this.setSecond(this.second+1);
        return this;

    }

    public MyTime nextHour(){
        if (this.hour==23){
            this.setHour(0);
        }
        else
            this.setHour(this.hour+1);
        return this;
    }
    public MyTime nextMinute(){
        if (this.minute==59){
            this.setMinute(0);
            nextHour();
        }
        else
            this.setMinute(this.minute+1);
        return this;
    }
    public MyTime previousSecond(){
        if(this.second==0){
            this.setSecond(59);
            previousSecond();
        }
        else {
            this.setSecond(this.second-1);
        }
        return this;
    }

    public MyTime previousHour(){

        if(this.hour==0){
            this.setHour(23);
        }
        else {
            this.setHour(this.hour-1);
        }
        return this;
    }
    public MyTime previousMinute(){
        if(this.minute==0){
            this.setMinute(59);
            previousHour();
        }
        else {
            this.setMinute(this.minute-1);
        }
        return this;
    }
}
