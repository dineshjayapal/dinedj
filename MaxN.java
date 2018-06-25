import java.util.*;
import java.util.Scanner;
public class MaxN
{
  public static void main(String args[])
     {  int max;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
        for(int i=0;i<n;i++){
         a[i]=sc.nextInt();}
         max=a[0];
         for(int i=0;i<n;i++){
          if(max<a[i]){
           max=a[i];}
        }System.out.println(max);
      }
}	