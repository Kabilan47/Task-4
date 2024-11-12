import java.util.HashMap;

public class StudentGrades {
    // HashMap to store student names and grades
    private HashMap<String, Integer> studentGrades;

    // Constructor
    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student with grade
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Added student: " + name + " with grade: " + grade);
    }

    // Method to remove a student by name
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Removed student: " + name);
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println("Grade for " + name + ": " + studentGrades.get(name));
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of StudentGrades
        StudentGrades studentGrades = new StudentGrades();

        // Adding students
        studentGrades.addStudent("Ambush", 85);
        studentGrades.addStudent("Bobii", 90);
        studentGrades.addStudent("Charlie", 78);

        // Displaying grades
        studentGrades.displayGrade("Alice");
        studentGrades.displayGrade("Bob");

        // Removing a student
        studentGrades.removeStudent("Charlie");

        // Attempting to display a removed student's grade
        studentGrades.displayGrade("Charlie");
    }
}
