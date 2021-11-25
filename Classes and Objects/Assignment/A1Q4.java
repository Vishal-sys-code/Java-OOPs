package Assignment;

// import java.math.BigInteger;

class Student{
    int Roll;
    String Address;
    int phonenumber;

    Student(){
        System.out.println("-------This is a Default Constructor-------");
    }

    Student(int r, String p, int n){
        this.Roll = r;
        this.Address = p;
        this.phonenumber = n;
    }
}

public class A1Q4 {
    public static void main(String[] args) {
        Student Sam = new Student(40, "16, MA Boston", 1122334455);
        Student John = new Student(30, "26 Houston Street", 667788991); 

        System.out.println("First Student: SAM (at MIT)");
        System.out.println("Address: " + Sam.Address);
        System.out.println("Roll Number: " + Sam.Roll);
        System.out.println("Phone Number: " + Sam.phonenumber);
        System.out.println("\n");
        System.out.println("Second Student: JOHN (at HARVARD)");
        System.out.println("Address: " + John.Address);
        System.out.println("Roll Number: " + John.Roll);
        System.out.println("Phone Number: " + John.phonenumber);
    }
}
