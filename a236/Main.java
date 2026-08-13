class Employee {
    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class PermanentEmployee extends Employee {
    double hra;
    double da;

    PermanentEmployee(int empId, String name, double basicSalary,
                      double hra, double da) {
        super(empId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    void displayDetails() {
        displayEmployee();
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);

        double grossSalary = basicSalary + hra + da;
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        PermanentEmployee emp =
            new PermanentEmployee(101, "Manogna", 70000, 5000, 3000);

        emp.displayDetails();
    }
}