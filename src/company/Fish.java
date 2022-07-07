package company;

public class Fish {
    private String name;
    private double weight;
    private String colour;
    String getName(){
        return name;
    }
    double getWeight(){
        return weight;
    }
    String getColour(){
        return colour;
    }
    void setName(String fishName){
        this.name = fishName;
    }
    void setWeight(int fishWeight){
        this.weight = fishWeight;
    }
    void setColour(String fishColour){
        this.colour = fishColour;
    }
}
