package student;

import java.util.*;
import storage.StudentFileImpl;

public class Student {

    private static int counter = 1000;
    private int studentId;
    private String name;
    private int age;
    private String course;
    private double cgpa;
    private String contact;
    private String enrollmentDate;

    public Student(String name, int age, String course,
                   double cgpa, String contact, String enrollmentDate) {

        this.studentId = counter++;
        this.name = name;
        this.age = age;
        this.course = course;
        this.cgpa = cgpa;
        this.contact = contact;
        this.enrollmentDate = enrollmentDate;
    }

    public String toString() {
        return studentId + "," + name + "," + age + "," +
                course + "," + cgpa + "," + contact + "," + enrollmentDate;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentFileImpl file = new StudentFileImpl(); // ✅ now accessible

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Age (18-25): ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    if (age < 18 || age > 25) {
                        System.out.println("Invalid Age! Please enter correct age between 18 to 25 ");
                        break;
                    }

                    System.out.print("Course: ");
                    String course = sc.nextLine();

                    System.out.print("CGPA (0-10): ");
                    double cgpa = sc.nextDouble();
                    sc.nextLine();

                    if (cgpa < 0 || cgpa > 10) {
                        System.out.println("Invalid CGPA! Please enter correct CGPA between 0 to 10");
                        break;
                    }

                    System.out.print("Contact: ");
                    String contact = sc.nextLine();

                    System.out.print("Enrollment Date: ");
                    String date = sc.nextLine();

                    Student s = new Student(name, age, course, cgpa, contact, date);
                    file.addStudent(s);
                    break;

                case 2:
                    file.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();   // ✅ different variable
                    file.searchStudent(searchId);
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int deleteId = sc.nextInt();   // ✅ different variable
                    file.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    int UpdatedId = sc.nextInt();   // ✅ different variable
                    file.UpdateStudent(UpdatedId);
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
