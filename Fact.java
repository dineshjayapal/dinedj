import java.util.*;
import java.util.Scanner;
public class Fact
{
  public static void main(String a[])
     {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long l=1;
        for ( int i=1;i<=n;i++)
        {l=l*i;}
        System.out.println(l);
      }
}	