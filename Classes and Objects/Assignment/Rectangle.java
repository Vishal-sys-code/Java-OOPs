package Assignment;
class RectangleDetails{
    int side1,side2;

    public int area(){
        return side1*side2;
    }

    public int perimeter(){
        return (2*(side1+side2));
    }

}

public class Rectangle {
    public static void main(String[] args){
        RectangleDetails r = new RectangleDetails();
        r.side1 = 5;
        r.side2 = 5;
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
