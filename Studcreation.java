// Custom exception for age validation
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(int age) {
        super("Age " + age + " is not within the valid range of 15 to 21.");
    }
}

// Custom exception for name validation
class NameNotValidException extends Exception {
    public NameNotValidException(String name) {
        super("Name '" + name + "' is not valid. It should not contain numbers or special symbols.");
    }
}

// Student class
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.course = course;

        // Validate age
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException(age);
        }
        this.age = age;

        // Validate name
        if (!name.matches("[a-zA-Z]+")) { // Name should only contain alphabets
            throw new NameNotValidException(name);
        }
        this.name = name;
    }

    // Getters for displaying student details
    public int getRollNo() {
        return rollNo;
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
}

public class Studcreation {
    public static void main(String[] args) {
        try {
            Student student = new Student(1, "Ramesh123", 20, "Computer Science");  // This should throw an exception
            System.out.println("Student created successfully!");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            // Example to trigger AgeNotWithinRangeException
            Student student2 = new Student(2, "Ramesh", 14, "Mathematics");  // Invalid age
            System.out.println("Student2 created successfully!");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


