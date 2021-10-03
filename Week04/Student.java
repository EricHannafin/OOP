package Week04;

import java.util.Arrays;

public class Student implements Comparable<Student> {

    private String name;
    private int id;
    private static String college = "Institute of Technology Tralee";
    private String department;
    private String[] modules;
    private static int count = 0;

    public Student(String name, String department, String modules[]){
        setName(name);
        setId();
        setDepartment(department);
        setModules(modules);


    }

    private void setId() {
        count++;
        this.id = count;
    }

    public static void setCollege(String College) {
        Student.college = college;
    }

    public void setModules(String[] modules) {
        this.modules = modules;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static String getCollege() {
        return college;
    }

    public String getDepartment() {
        return department;
    }

    public String[] getModules() {
        return modules;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\n  name='" + getName() +
                "\n, id=" + getId() +
                "\n, department='" + getDepartment() +
                "\n, modules=" + Arrays.toString(getModules()) +
                "\n, college " + getCollege();
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
