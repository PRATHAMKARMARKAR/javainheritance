
import java.util.*;
class Shape{
    void DisplayArea(){
        System.out.println("Displaying Area of Shape");
    }
}
class Triangle extends Shape{
    void DisplayArea(int base, int height){
        System.out.println("Area of Triangle: "+(0.5*base*height));
    }
}
class EquilateralTriangle extends Triangle{
    void DisplayArea(int side){
        System.out.println("Area of Equilateral Triangle: "+((Math.sqrt(3)/4)*side*side));
    }
}




public class Lecture2{
    public static void main(String[] args) {

    }
}
