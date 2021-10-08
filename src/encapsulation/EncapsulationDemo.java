package encapsulation;

public class EncapsulationDemo {

    //instance variable //global variable
     private int id;
     private String name;
     private String address;


     public void setId(int id){
         if(id>0) {
             this.id = id;
         }else {
             System.out.println("Set the value above 0");
         }
     }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

/**
 * Encapsulation  => Wrapping up data and code into single unit is called encapsulation.
 *
 * advantage=> 1. we are keeping a field as private and giving
 *                access them via public getter and setter,so we can restrict the set or get values
 *             2. we can create class read only or write only
 */