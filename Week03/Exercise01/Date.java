package Week03.Exercise01;

public class Date {
    private  int day;
    private  int month;
    private int year;  //attributes

    public Date(){     // No argument constructor
          setDay(4);
          setMonth(5);
          setYear(2000);
    }

    public Date(int day, int month, int year){     // 3 argument constructor
          this.day = day;
          this.month = month;
          this.year = year;
    }

    public int getDay(){  //accessor Method
        return day;
    }

    public int getMonth(){  //accessor Method
        return month;
    }

    public int getYear(){  //accessor Method
        return year;
    }

    public void setDay(int day) { //mutator method
        // put your validation here
        this.day = day;
    }

    public void setMonth(int month) {  //mutator method
        this.month = month;
    }

    public void setYear(int year) {  //mutator method
        this.year = year;
    }

    public String toString() {   //overrides the toString() from Object
        return  getDay() + "-" + getMonth() + "-" + getYear();
    }
}
