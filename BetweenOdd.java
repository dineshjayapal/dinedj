import java.util.*;
import java.util.Scanner;
import java.lang.String;
    public class BetweenOdd{    
     public static void main(String args[]){      
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=sc.nextInt();
      for(int i=n;i<a;i++){
        if((i%2!=0)&&(i!=n)){
         System.out.println(i );
      }
     }
    }    
    }   