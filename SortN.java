import java.util.*;
import java.util.Scanner;
public class SortN
{
  public static void main(String args[])
     {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
        if((n>0)&&(n<100000)){
        int[] a=new int[n];
        for(int i=0;i<n;i++){
         a[i]=sc.nextInt();
	}Arrays.sort(a);
        System.out.println(Arrays.toString(a));}else{
        System.out.println("Invalid input");}
      }
}	