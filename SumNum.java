import java.util.*;
import java.util.Scanner;
import java.lang.String;
public class SumNum { 
   public static void main(String args[]){
       int total=0;
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       for(int i=1;i<=k;i++)
        {
	  total=total+i;
         }
        System.out.println(total);
       }
}