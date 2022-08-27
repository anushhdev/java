package couplesensitivebracketchecker;
import java.util.*;
import javax.swing.JOptionPane;
public class CoupleSensitiveBracketChecker {
// create a character stack
Stack<Character> stk = new Stack<Character>();
public void match(){
String expr = JOptionPane.showInputDialog(
"Enter arithmetic expression");
// take one char at a time
for (int i = 0; i < expr.length(); i++){
char c = expr.charAt(i);
// check all three open bracket types
if (c == '{' || c == '(' || c == '[' ){
stk.push(new Character(c));
}
else // if closing bracket
if (c == '}' || c == ')' || c == ']' ){
stk.pop();
}
}
// if stk is empty, given expr is perfectly balanced
if(stk.empty())
System.out.println(“The given expression is perfectly balanced");
else
System.out.println("The given expression is NOT perfectly balanced");
}
public boolean properClosing(char c){
/* insert code here to check whether the parameter c is
a proper closing bracket to stack top or not */
}
public static void main(String[] args) {
CoupleSensitiveBracketChecker c = new
CoupleSensitiveBracketChecker();
c.match();
}
}