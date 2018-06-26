import java.util.*;
import java.util.Scanner;
public class StringNum
{
  public static void main(String args[])
     {
	Scanner sc=new Scanner(System.in);
        String string = sc.next();
        boolean numeric = true;
        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        if(numeric)
            System.out.println("yes");
        else
            System.out.println("no");
      }
}	