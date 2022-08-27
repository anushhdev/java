/* Name    : Anush
   Class   : 2nd CS 'B'
   Roll No : 205114218
   WEEK    : 9
   Exercise: 1  */
   package wordcounter;
   import java.util.*;
   import java.io.*;
   public class WordCounter {
          public static void main (String[] args) throws IOException {
                 String filepath="D:\\VScode\\JAVA\\Endsem\\src\\wordcounter\\Anush.txt";
                 BufferedReader br = new BufferedReader (new FileReader(filepath));
                 String s,s1="";
                 while ((s=br.readLine())!= null)
                 {
                        s=s.toLowerCase();
                        s1= s1 + s;
                 }
                 br.close();
   
                 Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
                 StringTokenizer st = new StringTokenizer(s1);
                 while (st.hasMoreTokens())
                 {
                        String nxt=st.nextToken();
                        if(ht.containsKey(nxt))
                        {
                               Integer nxtToken=ht.get(nxt);
                               nxtToken++;
                               ht.put(nxt,nxtToken);
                        }
                        else
                        ht.put(nxt,1);
                 }
                 for(String key:ht.keySet())
                        System.out.println("Word:"+key+" Count:"+ht.get(key));
          }
   }