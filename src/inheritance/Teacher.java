package inheritance;

/**
 * inheritance ->   acquiring all properties from parent class to  child class
 * advantage-> code re-usability
 *
 */
public class Teacher { //parent class , base class , super class
    int id;
    String name;
    String address;

    public void show(){
        System.out.println("In Teacher class");
    }
}

class MathsTeacher extends Teacher { //child class  ,derived  class, sub class

    public void show(){
        System.out.println("In Math Teacher class");
    }
    public static void main(String[] args) {
        MathsTeacher mathsTeacher = new MathsTeacher();
        mathsTeacher.id = 1;
        mathsTeacher.name = "Sachin";
        mathsTeacher.address = "Nagpur";

        mathsTeacher.show();
//        System.out.println("Id=> " + mathsTeacher.id + " name=> " + mathsTeacher.name + " address=> " + mathsTeacher.address);
    }
}

class ChemistryTeacher extends MathsTeacher {

    public static void main(String[] args) {
        ChemistryTeacher obj = new ChemistryTeacher();
        obj.id = 9;
        obj.name = "Rahul";
        obj.address = "Kolhapur";
//        System.out.println("Id=> " + obj.id + " name=> " + obj.name + " address=> " + obj.address);

    }

}