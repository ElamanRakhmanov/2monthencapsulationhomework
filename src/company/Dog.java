package company;

public class Dog {
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
    void setName(String dogName){
        this.name = dogName;
    }
    void setAge(int dogAge){
        this.age = dogAge;
    }
    void setColour(String dogColour){
        this.colour = dogColour;
    }
}
