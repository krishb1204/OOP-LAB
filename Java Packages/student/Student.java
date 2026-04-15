package student;

public class Student {
    public int roll;
    public String name;
    public String classs;

    public Student(int roll, String name, String classs) {
        this.roll = roll;
        this.name = name;
        this.classs = classs;

        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Class: " + classs);
    }
}