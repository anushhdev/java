package polymorphismsample;
public class PolymorphismSample {
       public static void main (String[]args)
       {
              IndianNational rex = new IndianNational ("A1000");
              IndianStudent peter = new IndianStudent ("A2000", "S1000");
              IndianEmployee sam = new IndianEmployee ("A3000", "E1000");
              rex.displayID ();
              peter.display ();
              sam.display ();
       }
}