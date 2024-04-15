package Assignment3;

public class Employee {
    private int id;
    private String name;
    private String position;

    //constructor
    public Employee(int id, String name, String position){
        this.id = id;
        this.name = name;
        this.position = position;
    }

    //accessor
    public String getName(){
        return name;
    }

    //mutator
    public void setPosition(String position){
        this.position = position;
    }

    //to string
    public String toString(){
        return "Employee ID: "+id+"\nEmployee Name: "+name+"\nEmployee Position: "+position+"\n";
    }
}
