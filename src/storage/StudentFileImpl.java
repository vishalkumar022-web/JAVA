package storage;

import java.io.*;
import student.Student;
interface StudentFileRules {

    void addStudent(Student s);
    void viewStudents();
    void searchStudent(int id);
    void deleteStudent(int id);
    void UpdateStudent(int id);
}

// =====================================================

public class StudentFileImpl implements StudentFileRules {

    File file;

    public StudentFileImpl() {
        file = new File("data.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ---------- ADD ----------
    @Override
    public void addStudent(Student s) {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(s.toString() + "\n");
            System.out.println("Student Added Successfully!");
        } catch (Exception e) {
            System.out.println("Error adding student");
        }
    }

    // ---------- VIEW ----------
    @Override
    public void viewStudents() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("\nID,Name,Age,Course,CGPA,Contact,Date");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("No data found");
        }
    }

    // ---------- SEARCH ----------
    @Override
    public void searchStudent(int id) {

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                for (int i = 0; i < data.length; i++) {

                    if (data[i].equals(String.valueOf(id))) {
                        System.out.println("Student Found Successfully:");
                        System.out.println(line);
                        found = true;
                        break;
                    }
                }
            }

            if (!found)
                System.out.println("Student Not Found");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ---------- DELETE ----------
    @Override
    public void deleteStudent(int id) {

        File temp = new File("temp.txt");
        boolean deleted = false;

        try (BufferedReader br = new BufferedReader(new FileReader(file));
             FileWriter fw = new FileWriter(temp)) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                boolean skip = false;

                for (int i = 0; i < data.length; i++) {
                    if (data[i].equals(String.valueOf(id))) {
                        deleted = true;
                        skip = true;
                        break;
                    }
                }

                if (skip)
                    continue;

                fw.write(line + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        file.delete();
        temp.renameTo(file);

        if (deleted)
            System.out.println("Student Deleted Successfully");
        else
            System.out.println("Student Not Found");
    }

    // ---------- UPDATE ----------
    @Override
    public void UpdateStudent(int id) {

        boolean found = false;
        String newData = "";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                boolean skip = false;

                for (int i = 0; i < data.length; i++) {
                    if (data[i].equals(String.valueOf(id))) {
                        found = true;
                        skip = true;
                        break;
                    }
                }

                if (!skip)
                    newData += line + "\n";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(file)) {
            fw.write(newData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (found)
            System.out.println("Student Updated (Old Record Removed)");
        else
            System.out.println("Student Not Found");
    }
}
