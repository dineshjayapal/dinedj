import java.util.*;
import java.util.Scanner;
public class Swap2
{
  public static void main(String args[])
     {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println( a+" "+b );
      }
}	