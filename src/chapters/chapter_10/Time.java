package chapters.chapter_10;

public class Time {

    private long hour;
    private long minute;
    private long second;

    public Time(){
        long theTime = System.currentTimeMillis();
        this.setTime(theTime);

    }
    public Time(long newTime){
        this.setTime(newTime);
    }
    public Time(long newHour, long newMinute, long newSecond){
        this.hour = newHour;
        this.minute = newMinute;
        this.second = newSecond;
    }

    public void setTime(long theTimeElapsed){
        hour = (((theTimeElapsed / 1000) / 60) / 60) % 24;

        minute = ((theTimeElapsed / 1000) / 60) % 60;

        second = (theTimeElapsed / 1000) % 60;

    }
    public long getHour(){
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }
}
