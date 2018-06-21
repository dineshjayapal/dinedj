import java.util.*;
import java.util.Scanner;
public class OddEven
{
   public static void main(String args[])
      {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if((n>=1)&&(n<=100000)&&(n%2==0))
	 {
	   System.out.println("Even");
	 }else 
           {if(n<=0)
	   {
	     System.out.println("invalid");
	   }else
	     {
		System.out.println("Odd");
	     }
	  }
      }
}