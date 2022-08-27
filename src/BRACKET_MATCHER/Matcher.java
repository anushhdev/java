package BRACKET_MATCHER;
import java.io.*;
import java.util.*;
class Matcher {
       public void match()
       {
              Stack stk=new Stack();
              Scanner dc=new Scanner(System.in);
              String expr=sc.nextLine();
              for(int i=0;i<expr.length();i++)
              {
                     char c=expr.charAt(i);
                     if(c=='}'||c=='('||c=='[')
                     stk.push(c);
                     else
                     if(c=='}'||c==')'||c=='[')
                     stk.pop();
              }
              if(stk.empty())
              System.out.println("the given expression is perfectly balanced");
              else
              System.out.println("the given expression is not perfectly balanced");
       }
}
