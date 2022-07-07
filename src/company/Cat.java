package company;

public class Cat {
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
    void setName(String catName){
        this.name = catName;
    }
    void setAge(int catAge){
        this.age = catAge;
    }
    void setColour(String catColour){
        this.colour = catColour;
    }

}
