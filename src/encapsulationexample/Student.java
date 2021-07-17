package encapsulationexample;
//hiding internal state(data members) and requiring all interaction to be performed through an object methods(getter and setter) is called data encapsulation
//process of wrapping code and data together in a single unit is encapsulation
//making all data memebers in a class private we can create fully encapsulated class
//we can use setter and getter methods to set and get data in it
//it is a way to data hiding means other class will not able to acces the data through private members

public class Student {

    //private data member
    private String name;
    private  int id;
    //getter method for name
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
   //setter method for name
    public void setName(String name){
        this.name=name;

    }

    public void setId(int id){
        this.id=id;

    }

}
