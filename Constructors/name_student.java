class studentDetails{
    String name;
    studentDetails(){
        System.out.println("This is a default constructor");
    }
    studentDetails(String n){
        this.name = n;
    }
    public String getName() {
        return name;
    }
}

public class name_student {
    public static void main(String[] args) {
        studentDetails s = new studentDetails("Vishal");
        studentDetails s1 = new studentDetails(" ");
        if(s.name == " " || s1.name == " "){
            System.out.println("Unknown");
        }
        else{
            System.out.println("Name: " + s.getName());
            System.out.println("Name: " + s1.getName());
        }
    }
}
