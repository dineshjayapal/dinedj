import java.util.*;
import java.lang.String;
import java.util.Scanner;
public class MultipleOfN
{
  public static void main(String a[])
     {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	 { 
           int b=n*i;
	  System.out.println(b);
	  } 
      }
}	