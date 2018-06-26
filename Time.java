import java.util.*;
import java.util.Scanner;
public class Time
{
  public static void main(String a[])
     {
	Scanner sc=new Scanner(System.in);
	int hr1=sc.nextInt();
	int min1=sc.nextInt();
        int hr2=sc.nextInt();
        int min2=sc.nextInt();
        int hr=hr1-hr2;
        int min=min1-min2;
        if(hr<0){hr=hr*-1;}
        if(min<0){min=min*-1;}
        System.out.println(hr+" "+min);
      }
}	