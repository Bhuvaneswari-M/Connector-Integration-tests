import java.util.ArrayList;
import java.util.Scanner;

/**
 * A simple Student Management System
 * Demonstrates basic Java concepts: classes, objects, lists, loops, and conditionals.
 */
class Student {
    private int rollNumber;
    private String name;
    private int age;
    private String course;

    public Student(int rollNumber, String name, int age, String course) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNumber +
               ", Name: " + name +
               ", Age: " + age +
               ", Course: " + course;
    }
}

public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = getChoice();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void showMenu() {
        System.out.println("\n===== Student Management System =====");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student by Roll Number");
        System.out.println("4. Delete Student by Roll Number");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Invalid choice
        }
    }

    private static void addStudent() {
        try {
            System.out.print("Enter Roll Number: ");
            int roll = Integer.parseInt(scanner.nextLine());

            // Check if roll number already exists
            for (Student s : students) {
                if (s.getRollNumber() == roll) {
                    System.out.println("Error: Roll number already exists!");
                    return;
                }
            }

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Course: ");
            String course = scanner.nextLine();

            students.add(new Student(roll, name, age, course));
            System.out.println("Student added successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter correct data.");
        }
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private static void searchStudent() {
        try {
            System.out.print("Enter Roll Number to search: ");
            int roll = Integer.parseInt(scanner.nextLine());

            for (Student s : students) {
                if (s.getRollNumber() == roll) {
                    System.out.println("Student Found: " + s);
                    return;
                }
            }
            System.out.println("Student not found.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid roll number.");
        }
    }

    private static void deleteStudent() {
        try {
            System.out.print("Enter Roll Number to delete: ");
            int roll = Integer.parseInt(scanner.nextLine());

            for (Student s : students) {
                if (s.getRollNumber() == roll) {
                    students.remove(s);
                    System.out.println("Student deleted successfully.");
                    return;
                }
            }
            System.out.println("Student not found.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid roll number.");
        }
    }
}
