
class cylinderDetails{
    double radius, height;
    //HEIGHT OPERATION
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    //RADIUS OPERATION
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public double surfacearea(double height, double radius){
        return ((2*Math.PI*radius*height) + (2*Math.PI*radius*radius));
    }

    public double volume(double height, double radius){
        return (Math.PI*radius*radius*height);
    }
}

public class cylinder{
    public static void main(String[] args) {
        cylinderDetails c = new cylinderDetails();
        System.out.println("Surface Area: " + c.surfacearea(1.0, 1.0));
        System.out.println("Volume: " + c.volume(1.0, 1.0));
    }
}