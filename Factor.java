import java.util.*;
import java.util.Scanner;
public class Factorial{
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=1;
      for(int i=n;i>0;i--)
       { 
        a=a*i; 
        }
       System.out.println(a);
     }
}      