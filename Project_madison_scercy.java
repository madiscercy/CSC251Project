import java.util.Scanner;

public class Project_madison_scercy {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the Policy Number: ");
        String policyNumber = keyboard.nextLine();

        System.out.print("Please enter the Provider Name: ");
        String providerName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder's First Name: ");
        String firstName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder's Last Name: ");
        String lastName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder's Age: ");
        int age = Integer.parseInt(keyboard.nextLine());

        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        String smokingStatus = keyboard.nextLine();

        System.out.print("Please enter the Policyholder's Height (in inches): ");
        double height = Double.parseDouble(keyboard.nextLine());

        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        double weight = Double.parseDouble(keyboard.nextLine());


        Policy policy = new Policy(policyNumber, providerName, firstName, lastName,
                                   age, smokingStatus, height, weight);


        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getLastName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getHeightInInches() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getWeightInPounds() + " pounds");
        System.out.printf("Policyholder's BMI: %.2f%n", policy.getBMI());
        System.out.printf("Policy Price: $%.2f%n", policy.policyPrice());
    }
}
