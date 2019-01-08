import java.io.*;
import java.util.*;
  public class Balance{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The Brackets:");
      String str=sc.next();
      int c1=0,c2=0;
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)=='(')
            {
              c1++;
            }
          else 
            {
              c2++;
            }
         
         }
		 
		 //System.out.println(c1);
		 //System.out.println(c2);
		 
       if(c1==c2)
       {
        System.out.println("Yes");
       }
       else
       {
       System.out.println("No");
       }
    }
 }   
