class branddetails{
    String brand;

    branddetails(){
        System.out.println("This is a default constructor");
    }

    public String getBrand() {
        return brand;
    }

    void run(){
        System.out.println("Running............");
    }
}

public class brand {
    public static void main(String[] args) {
        branddetails b = new branddetails();
        b.brand = "Ford";
        //b.brand = "TESLA"
        System.out.println("Brand is: " + b.getBrand());
        b.run();
    }
}
