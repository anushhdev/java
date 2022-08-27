package marklist;
public class Student {
       int rollno;
       String name;
       int mark1, mark2, mark3;
       String result;
       public Student(){}
       
       public Student(int r, String n, int m1, int m2, int m3){
       /* Assign the parameters to data members */
       rollno=r;
       name=n;
       mark1=m1;
       mark2=m2;
       mark3=m3;
}
       public void calculate_result() {
              if(mark1>=40&&mark2>=40&&mark3>=40)
                   result="PASS";
              else
                   result="FAIL";
              /* if mark1, mark2 and mark3 are 40 and above, result=”Pass”
              Otherwise result=”Fail” */
       }
       public void display(){
              System.out.println("Roll No:"+rollno+"  Name:"+name+"  Mark1:"+mark1+"  Mark2:"+mark2+"  Mark3:"+mark3+"  Result:"+result);
              /* display rollno, name, mark1, mark2, mark3
              and result, in one line */
       }
}