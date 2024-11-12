// Custom checked exception for invalid voter age
class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException() {
        super("Invalid age for voter");
    }
}

// Voter class
class Voter {
    private int voterId;
    private String name;
    private int age;

    // Parameterized constructor
    public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
        this.voterId = voterId;
        this.name = name;

        // Validate age
        if (age < 18) {
            throw new InvalidVoterAgeException();
        }
        this.age = age;
    }

    // Getters for displaying voter details
    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Voterportal {
    public static void main(String[] args) {
        try {
            // Attempt to create a Voter with age less than 18 to trigger exception
            Voter voter = new Voter(1, "Alice", 16);
            System.out.println("Voter created successfully!");
        } catch (InvalidVoterAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
