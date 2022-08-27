package polymorphismsample;
public class IndianStudent extends IndianNational {
       String studentID;
       public IndianStudent (String aadhaar, String id) {
              super(aadhaar);
              studentID=id;
       }
       public void display() {
              System.out.println("\nAadhaar ID: " + aadhaar);
              System.out.println("Student ID: " + studentID);
       }
}