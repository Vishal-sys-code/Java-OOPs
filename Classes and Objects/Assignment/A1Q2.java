package Assignment;

class Area{
    int length, breadth;

    public void setdimenseion(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    public int getArea(){
        return (length*breadth);
    }
}

public class A1Q2 {
    public static void main(String[] args){
        Area a1 = new Area();
        a1.setdimenseion(5, 5);
        System.out.println("Area: " + a1.getArea());
    }
}
