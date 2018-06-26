import java.util.*;
import java.util.Scanner;
public class Minutes
{
  public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
        int min = sc.nextInt();
        int hr=min/60;
        min%=60;
        System.out.println(hr+" "+min);
     }
}	