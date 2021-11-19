class EmployeeDetails{
    int employee_salary;
    String employee_name;

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_salary(int employee_salary) {
        this.employee_salary = employee_salary;
    }

    public int getEmployee_salary() {
        return employee_salary;
    }
}

public class Employee{
    public static void main(String[] args){
        EmployeeDetails e1 = new EmployeeDetails();
        e1.setEmployee_name("Vishal");
        e1.employee_salary = 40000;
        System.out.println("Name: " + e1.getEmployee_name());
        System.out.println("Salary: " + e1.getEmployee_salary());
    }
}