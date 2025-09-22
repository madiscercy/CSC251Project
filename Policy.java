
public class Policy {
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double heightInInches;
   private double weightInPounds;
   
   public Policy() {
      policyNumber = "1";
      providerName = "John Doe";
      firstName = "John";
      lastName = "Doe";
      age = 25;
      smokingStatus = "smoker";
      heightInInches= 55.5;
      weightInPounds = 155.5;
   }
   
   public Policy(String policyNum, String provName, String fName, String lName, int holderAge, String holderSmoke, double holderHeight, double holderWeight) {
      policyNumber = policyNum;
      providerName = provName;
      firstName = fName;
      lastName = lName;
      age = holderAge;
      smokingStatus = holderSmoke;
      heightInInches= holderHeight;
      weightInPounds = holderWeight;
   }
   
   public void setPolicyNumber (String policyNum) {
      policyNumber = policyNum;
   }
   public String getPolicyNumber () {
      return policyNumber;
      }
   public void setProviderName(String provName) {
      providerName = provName;
   }
   public String getProviderName() {
      return providerName;
   }

   public void setFirstName(String fName) {
      firstName = fName;
   }
   public String getFirstName() {
      return firstName;
   }

   public void setLastName(String lName) {
      lastName = lName;
   }
   public String getLastName() {
      return lastName;
   }

   public void setAge(int holderAge) {
      age = holderAge;
   }
   public int getAge() {
      return age;
   }

   public void setSmokingStatus(String holderSmoke) {
      smokingStatus = holderSmoke;
   }
   public String getSmokingStatus() {
      return smokingStatus;
   }

   public void setHeightInInches(double holderHeight) {
      heightInInches = holderHeight;
   }
   public double getHeightInInches() {
      return heightInInches;
   }

   public void setWeightInPounds(double holderWeight) {
      weightInPounds = holderWeight;
   }
   public double getWeightInPounds() {
      return weightInPounds;
   }

   public double getBMI() {
      double BMI = (weightInPounds * 703) / (heightInInches * heightInInches);
      return BMI;
   }
   public double policyPrice() {
      double baseFee = 600.00;
      double overFiftyFee = 0.00;
      double smokingFee = 0.00;
      double BMIFee = 0.00;
      double BMI = getBMI();
      
      if (age > 50) {
         overFiftyFee = 75.00;
      }
      if (smokingStatus.equals("smoker")) {
         smokingFee = 100.00;
      }
      
      if (BMI > 35) {
      BMIFee = (BMI - 35.00) * 20;
      }
      
      double policyPrice = baseFee + overFiftyFee + smokingFee + BMIFee; 
      return policyPrice;
   }
}