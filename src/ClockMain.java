
class Clock {

    private int hours;
    private int seconds;
    private int minutes;
    private int day;

    Clock(int hours, int minutes, int seconds){
        if(hours > 23 || minutes > 60 || seconds > 60){
            System.out.println("Enter a numbers valid");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours(){
        return hours;
    }

    public int getMinutes(){
        return  minutes;
    }

    public int getSeconds(){
        return  seconds;
    }

    public int getDay(){
        return day;
    }

    public void setHours(int value){

        boolean repeat = true;
        hours += value;

        while(repeat){

            if(hours >= 24){
                hours = hours - 24 ;
                day++;
            }else {
                repeat = false;
            }
        }
    }

    public void setMinutes(int value){

        boolean repeat = true;
        minutes += value;
        while(repeat){

            if(minutes >= 60){
                minutes = minutes - 60;
                hours++;
            }else {
                repeat = false;
            }
        }

        repeat = true;
        while(repeat){

            if(hours >= 24){
                hours = hours - 24 ;
                day++;
            }else {
                repeat = false;
            }
        }
    }

    public void setSeconds(int value){
        boolean repeat = true;
        seconds += value;
        while(repeat){

            if(seconds >= 60){
                seconds = seconds - 60;
                minutes++;
            }else {
                repeat = false;
            }
        }

        repeat = true;
        while(repeat){

            if(minutes >= 60){
                minutes = minutes - 60;
                hours++;
            }else {
                repeat = false;
            }
        }

        repeat = true;
        while(repeat){

            if(hours >= 24){
                hours = hours - 24 ;
                day++;
            }else {
                repeat = false;
            }
        }
    }

    public void  adjustmentClock(int hours, int minutes, int seconds){

        if(hours > 23 || minutes > 60 || seconds > 60){
            System.out.println("Enter a numbers valid");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int totalSeconds(){
        int totalHoursInSeconds = hours * 3600;
        int totalMinutesInSeconds = minutes * 60;
        return  totalHoursInSeconds + totalMinutesInSeconds + seconds;
    }

    public int differenceInSeconds(Clock other){
        return  Math.abs(this.totalSeconds() - other.totalSeconds());
    }

    public  void showClock(){
        System.out.println(day+":"+hours + ":"+minutes+":"+ seconds);
    }

    public void syncClock(Clock newClock){
        hours = newClock.getHours();
        minutes = newClock.getMinutes();
        seconds = newClock.getSeconds();
        day = newClock.getDay();
    }
}

public class ClockMain {

    public static void main(String[] args){

        Clock c1 = new Clock(14,58,32);
        c1.setMinutes(2);
        c1.showClock();

        Clock c2 = new Clock(23,59,59);
        c2.setSeconds(1);
        c2.showClock();

        c1.syncClock(c2);
        c1.showClock();

        c1.adjustmentClock(10,59,2);

        c2.syncClock(c1);
        c2.showClock();
    }
}
