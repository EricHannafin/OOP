package Week05;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23)
            this.hour = hour;
        else
            this.hour = 0;

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59)
            this.minute = minute;
        else
            this.minute = 0;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59)
            this.second = second;
        else
            this.second = 0;;
    }

    @Override
    public String toString() {
        String output = "";

        if (hour > 10)
            output += ":0" + getHour();
        else
            output += ":" + getHour();

        if (minute > 10)
            output += ":0" + getMinute();
        else
            output += ":" + getMinute();

        if (second > 10)
            output += ":0" + getSecond();
        else
            output += ":" + getSecond();

        return output;
//        return "Time{" +
//                "hour=" + hour +
//                ", minute=" + minute +
//                ", second=" + second +
//                '}';
    }
}
