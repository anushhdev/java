package polymorphismsample;
public class IndianEmployee extends IndianNational {
       String employeeID;
       public IndianEmployee(String aadhaar, String id) {
              super (aadhaar);
              this.aadhaar = aadhaar;
              this.employeeID = id;
       }
       public void display ()
       {
              System.out.println ("\nAadhaar ID :" + aadhaar);
              System.out.println ("\nEmployee ID :" + employeeID);
       }
}
