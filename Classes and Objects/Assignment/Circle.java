package Assignment;
class CircleDetails{
    Double radius;
    Double pi = 3.141;

    public double area(){
        return ((pi)*(radius)*(radius));
    }

    public double perimeter(){
        return (2*(pi)*(radius));
    }

}

public class Circle {
    public static void main(String[] args){
        CircleDetails c = new CircleDetails();
        c.radius = 2.0;
        System.out.println("Area: " + c.area());
        System.out.println("Perimeter: "+c.perimeter());
    }
}
