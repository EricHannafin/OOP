package Week04;

import javax.sound.midi.Soundbank;

public class testStudent {

    public static void main(String[] args) {


        Student student1 = new Student("Tim", "Computing", new String[]{"Maths", "Java", "Web Dev"});
        Student student2 = new Student("Sean", "Arts", new String[]{"Drawing", "Talking", "Walking"});

        Student allStudents[] = {student1};

        System.out.println("Calling static method getCount() to determine the " +
                "number of students in the college \n\n Toal students in College:" + student1.getCount());

        for(int i=0; i<Student.getCount(); i++){
            System.out.println("Student " + (i+i) + "\n\n" + allStudents[i]);



        }



       // System.out.println("Displaying the state of the " + Student.getCount() + "Student objects at this point\n\n\n" +
       //         student1);
    }
}
