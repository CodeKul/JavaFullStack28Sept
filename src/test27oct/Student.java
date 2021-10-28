package test27oct;

public class Student {
    int rollNumber;
    String  name;
    long contactNumber;
    int marks;


    public Student(int rollNumber, String name, long contactNumber, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.contactNumber = contactNumber;
        this.marks = marks;
    }

    public void display(){
        System.out.println("rollNo=>"+rollNumber);
    }
}

class StudentDemo{
    public static void main(String[] args) {
        Student obj = new Student(1,"rahul",324324,23);
        obj.display();
    }
}