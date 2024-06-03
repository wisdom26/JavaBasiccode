import java.util.Scanner;

class InvalidAgeException extends Exception {
    private int age;

    public InvalidAgeException(int age) {
        super("Invalid age: " + age);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class AgeValidation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your age:");

            int age = scanner.nextInt();

            try {
                validateAge(age);
                System.out.println("Age is valid.");
            } catch (InvalidAgeException e) {
                System.out.println("Caught an exception: " + e.getMessage());
                System.out.println("Invalid age provided: " + e.getAge());
            }
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException(age);
        }
    }
}

