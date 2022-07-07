package company;

public class Rectangle {
    private int side1;
    private int side2;
    private int side3;
    private int side4;

    int getSide1(){
        return side1;
    }
    int getSide2(){
        return side2;
    }
    int getSide3(){
        return side3;
    }
    int getSide4(){
        return side4;
    }

    void setSide1(int rectangleSide1){
        this.side1 = rectangleSide1;
    }
    void setSide2(int rectangleSide2){
        this.side2 = rectangleSide2;
    }
    void setSide3(int rectangleSide3){
            this.side3 = rectangleSide3;
    }
    void setSide4(int rectangleSide4){
            this.side4 = rectangleSide4;
    }

    double area;

    double area(){
        if(side1 < 0 || side2 <0){
        area = (side1 * side2) * -1;
        }else{
            area = (side1 * side2);
        }
        return area;
    }


}
