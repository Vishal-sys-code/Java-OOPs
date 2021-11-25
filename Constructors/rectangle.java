class rectangleDetails{
    int length, breadth;
    rectangleDetails(){
        System.out.println("This is a default constructor");
    }
    rectangleDetails(int l, int b){
        this.length = l;
        this.breadth = b;
    }
    public int getBreadth() {
        return breadth;
    }
    public int getLength() {
        return length;
    }
}

public class rectangle {
    public static void main(String[] args) {
        rectangleDetails R = new rectangleDetails();
        R.length = 5;
        R.breadth = 5;
        System.out.println("Breadth: " + R.getBreadth());
        System.out.println("Length: " + R.getLength());  
    }
}
