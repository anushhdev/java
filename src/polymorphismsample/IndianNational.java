package polymorphismsample;
public class IndianNational {
       String aadhaar;
       public IndianNational (String id) {
              aadhaar=id;
       }
       public void displayID () {
              System.out.println("\nAadhaar ID: " + aadhaar);
       }
}