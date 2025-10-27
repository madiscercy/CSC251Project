import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_madison_scercy {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("PolicyInformation.txt");
        Scanner in = new Scanner(file);

        ArrayList<Policy> policies = new ArrayList<Policy>();

        while (true) {
            String policyNumber = nextNonEmpty(in);
            if (policyNumber == null) break;

            String providerName  = nextNonEmpty(in);
            String firstName     = nextNonEmpty(in);
            String lastName      = nextNonEmpty(in);
            int age              = Integer.parseInt(nextNonEmpty(in));
            String smokingStatus = nextNonEmpty(in);
            double height        = Double.parseDouble(nextNonEmpty(in));
            double weight        = Double.parseDouble(nextNonEmpty(in));

            Policy p = new Policy(policyNumber, providerName, firstName, lastName,
                                  age, smokingStatus, height, weight);
            policies.add(p);
        }
        in.close();

        int smokers = 0;
        int nonSmokers = 0;

        for (int i = 0; i < policies.size(); i++) {
            Policy p = policies.get(i);

            System.out.println("Policy Number: " + p.getPolicyNumber());
            System.out.println();
            System.out.println("Provider Name: " + p.getProviderName());
            System.out.println();
            System.out.println("Policyholder's First Name: " + p.getFirstName());
            System.out.println();
            System.out.println("Policyholder's Last Name: " + p.getLastName());
            System.out.println();
            System.out.println("Policyholder's Age: " + p.getAge());
            System.out.println();
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + p.getSmokingStatus());
            System.out.println();
            System.out.println("Policyholder's Height: " + p.getHeightInInches() + " inches");
            System.out.println();
            System.out.println("Policyholder's Weight: " + p.getWeightInPounds() + " pounds");
            System.out.println();
            System.out.printf("Policyholder's BMI: %.2f%n", p.getBMI());
            System.out.println();
            System.out.printf("Policy Price: $%.2f%n", p.policyPrice());
            System.out.println();
            System.out.println();

            if (p.getSmokingStatus() != null && p.getSmokingStatus().equalsIgnoreCase("smoker")) {
                smokers++;
            } else {
                nonSmokers++;
            }
        }

        System.out.println("The number of policies with a smoker is: " + smokers);
        System.out.println();
        System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
    }


    private static String nextNonEmpty(Scanner in) {
        while (in.hasNextLine()) {
            String s = in.nextLine().trim();
            if (!s.isEmpty()) {
                return s;
            }
        }
        return null;
    }
}
