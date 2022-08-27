package marklist;
import java.util.Scanner;
public class MarkList {
public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("How many students? ");
       int max=sc.nextInt();
       // create and initialize
       Student[] student=new Student[max];
       for(int i=0; i<max; i++)
       student[i]= new Student();
       // read values
       for(int i=0; i<max; i++){
              System.out.print("Enter Roll No: ");
              student[i].rollno=sc.nextInt();
              // discard new line character
              sc.nextLine();
              /* similarly read values for name, mark1, mark2, mark3 */
              System.out.print("Enter Name: ");
              student[i].name=sc.nextLine();
              System.out.print("Enter Mark1: ");
              student[i].mark1=sc.nextInt();
              System.out.print("Enter Mark2: ");
              student[i].mark2=sc.nextInt();
              System.out.print("Enter Mark3: ");
              student[i].mark3=sc.nextInt();
       }
       // calculate result and display
       for(int i=0; i<max; i++){
              /* call methods: calculate_result() and display() */
              student[i].calculate_result();
              student[i].display();
       }
}
}