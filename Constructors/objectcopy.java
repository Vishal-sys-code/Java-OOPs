// import java.util.jar.Attributes.Name;

class Student{
    int rollNumber;
    String Name;
    Student(){
        System.out.println("This is a default constructor");
    }
    Student(int r, String n){
        this.rollNumber = r;
        this.Name = n;
    }
    Student (Student S){
        rollNumber = S.rollNumber;
        Name = S.Name;
    }
    void display(){
        System.out.println("Name: " + Name);
        System.out.println("Roll No.: " + rollNumber);
    }
}

public class objectcopy {
    public static void main(String[] args) {
        Student s = new Student(40, "Eva Yi Xie");
        Student s1 = new Student(s);
        s.display();
        System.out.println("\n");
        s1.display();
    }
}
