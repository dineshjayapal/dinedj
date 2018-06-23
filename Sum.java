import java.util.*;
import java.util.Scanner;
import java.lang.String;
public class Sum { 
   public static void main(String args[]){
       int total=0;
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++)
        {
	  total=total+i;
         }
        System.out.println(total);
       }
}