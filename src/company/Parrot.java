package company;

public class Parrot {
    private String name;
    private int age;
    private String colour;
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getColour(){
        return colour;
    }
    void setName(String parrotName){
        this.name = parrotName;
    }
    void setAge(int parrotAge){
        this.age = parrotAge;
    }
    void setColour(String parrotColour){
        this.colour = parrotColour;
    }
}
