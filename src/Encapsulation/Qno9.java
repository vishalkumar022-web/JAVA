package Encapsulation;

public class Qno9 {

    // Employee.java


    // Private fields - hidden from outside
    private String name;       // Employee ka naam store karega
    private int employeeId;    // Employee ki unique id store karega
    private double salary;     // Employee ka base salary store karega
    private double bonus;      // Employee ka bonus store karega

    // Constructor - jab naya Employee banega tab ye chalega
    public Qno9(String name, int employeeId, double salary) {
        this.name = name;             // Constructor se name set kar diya
        this.employeeId = employeeId; // Constructor se employeeId set kar diya
        this.salary = salary;         // Constructor se salary set kar diya
        this.bonus = 0;               // New employee ka bonus by default 0 rakha
    }

    // Getter for name
    public String getName() {
        return name;  // Stored name return karo
    }

    // Getter for employeeId
    public int getEmployeeId() {
        return employeeId; // Stored employeeId return karo
    }

    // Getter for salary
    public double getSalary() {
        return salary; // Current salary return karo
    }

    // Getter for bonus
    public double getBonus() {
        return bonus; // Current bonus return karo
    }


    public void setBonus(double bonus) {
        if (bonus < 0) {
            System.out.println("Bonus cannot be negative. Operation ignored.");
        }

        this.bonus = bonus;
        System.out.println("Bonus set to " + this.bonus);
    }

    // getTotalPay method - returns salary + bonus
    public double getTotalPay() {
        // Salary aur bonus ko add karke return kar do
        return this.salary + this.bonus;
    }

    public void giveRaise(double percentage) {

        if (percentage < 0) {
            System.out.println("Raise percentage cannot be negative. Operation ignored.");
        }
        else {

            double increase = salary+ (salary*percentage/100);
            System.out.println("Salary increased by " + percentage + "%, amount: " + increase);
        }

    }

    // getEmployeeDetails - returns formatted employee information
    public String getEmployeeDetails() {
        // Build a formatted string with employee information
        String details = "Employee Details:\n"
                + "Name: " + this.name + "\n"
                + "Employee ID: " + this.employeeId + "\n"
                + "Salary: " + this.salary + "\n"
                + "Bonus: " + this.bonus + "\n"
                + "Total Pay (salary + bonus): " + getTotalPay();
        return details; // Return the final string
    }
}

     class employee{
        public static void main(String[] args) {


            Qno9 emp = new Qno9("Vishal kumar ", 101, 500000.0);


            emp.setBonus(30000.0);

            emp.giveRaise(10);

            System.out.println(emp.getEmployeeDetails());
        }
    }

