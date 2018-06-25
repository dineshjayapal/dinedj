import java.util.*;
import java.util.Scanner;
public class Armstrong
{
  public static void main(String args[])
   {     
    int c=0,a,temp;  
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    temp=n;  
    while((n>0)&&(n<=100000))  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c){  
    System.out.println("Yes");   
    }else{  
        System.out.println("No");}
   }
}	