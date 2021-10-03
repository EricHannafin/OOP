package Week06.Labsheet10Exercise01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PermanentLecturer extends Lecturer {
    private String pensionEntitlements;
    private String status;

    public PermanentLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID,
                             String[] coursesTaught, GregorianCalendar dateOfAppointment,String pensionEntitlements,
                             String status){
        super(name,address,dateOfBirth,staffID,coursesTaught,dateOfAppointment);
        setPensionEntitlements(pensionEntitlements);
        setStatus(status);
    }

    public String getPensionEntitlements() {
        return pensionEntitlements;
    }

    public void setPensionEntitlements(String pensionEntitlements) {
        this.pensionEntitlements = pensionEntitlements;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status) {
        this.status = status; //e.g. part-time/whole-time professor/senior-lecturer/lecturer etc
    }

    public int getPointOnScale() {

        Calendar today = GregorianCalendar.getInstance();
        int yearsWorked =  today.get(Calendar.YEAR)-getDateOfAppointment().get(Calendar.YEAR);

        if(today.get(Calendar.MONTH)<getDateOfAppointment().get(Calendar.MONTH)
                || (today.get(Calendar.MONTH)==getDateOfAppointment().get(Calendar.MONTH)
                && today.get(Calendar.DATE)<getDateOfAppointment().get(Calendar.DATE)))
            yearsWorked--;

        if(yearsWorked>=20) //we will say there are only 20 points on the scale in total here
            return 20;
        else
            return yearsWorked;
    }

    public String toString(){
        return super.toString() + "\nLecturer Pension Entitlements: " + getPensionEntitlements();
    }
}
