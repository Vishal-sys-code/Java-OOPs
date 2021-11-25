class sphereDetails{
    double radius;
    sphereDetails(){
        System.out.println("This is a default constructor");
    }
    sphereDetails(double r){
        this.radius = r;
    }
    public double getRadius() {
        return radius;
    }
}

public class sphere {
    public static void main(String[] args) {
        sphereDetails s = new sphereDetails();
        s.radius = 69.0;
        System.out.println("Radius: " + s.getRadius());
    }
}
