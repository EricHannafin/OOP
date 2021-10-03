package Week05;

public class Class {
    private String name;
    private  String location;
    private String enrollment;
    private Time startTime;
    private Time finishTime;

    public Class(String name, String location, String enrollment, Time startTime, Time finishTime) {
        setName(name);
        setLocation(location);
        setEnrollment(enrollment);
        setStartTime(startTime);
        setFinishTime(finishTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public Time getStartTime() {
        return new Time(startTime.getHour(), startTime.getMinute(), startTime.getSecond());
    }

    public void setStartTime(Time startTime) {
        this.startTime = new Time(startTime.getHour(), startTime.getMinute(), startTime.getSecond());
    }

    public Time getFinishTime() {
        return new Time(finishTime.getHour(), finishTime.getMinute(), finishTime.getSecond());
    }

    public void setFinishTime(Time finishTime) {
        this.finishTime = new Time(finishTime.getHour(), finishTime.getMinute(), finishTime.getSecond());
    }

    @Override
    public String toString() {
//        return "Class{" +
//                "name='" + name + '\'' +
//                ", location='" + location + '\'' +
//                ", enrollment='" + enrollment + '\'' +
//                ", startTime=" + startTime +
//                ", finishTime=" + finishTime +
//                '}';
        return  "Name: " + getName() + "\nLocation: " + getLocation() +
                "\nEnrollment: " + getEnrollment() + "\nStart Time: " + getStartTime()
                + "\nFinish Time" + getFinishTime();
    }
}
