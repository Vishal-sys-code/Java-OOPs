package Assignment;

class Employee{
    int year,salary;
    String name, address;

    Employee(){
        System.out.println("This is a Default Constructor");
    }

    Employee(int y, int s, String n, String ad){
        this.year = y;
        this.salary = s;
        this.name = n;
        this.address = ad;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getYear() {
        return year;
    }
}

public class A1Q5 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1994, 40000, "Eva Yi Xie", "64C- WallsStreet");
        Employee e2 = new Employee(2000, 50000, "William Lin", "68D- WallsStreet");
        Employee e3 = new Employee(1999, 60000, "Shruin Lui", "26B- WallsStreet");

        System.out.println("Year of Joining \tSalary \tName \t\t Address");
        System.out.println(e1.getYear() + "\t\t\t" + e1.getSalary() + "\t" + e1.getName() + "\t" + e1.getAddress());
        System.out.println(e2.getYear() + "\t\t\t" + e2.getSalary() + "\t" + e2.getName() + "\t" + e2.getAddress());
        System.out.println(e3.getYear() + "\t\t\t" + e3.getSalary() + "\t" + e3.getName() + "\t" + e3.getAddress());
    }
}
