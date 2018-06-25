import java.util.*;
import java.util.Scanner;
public class ArmstrongN
{
  public static void main(String args[])
       {     
               Scanner s=new Scanner(System.in);
               int range=s.nextInt();
               int b=s.nextInt();
               int a,c,sum,count=0;
               while(b<=range)
                    {
                        sum=0;
                        c=b;
                        while(c>0)
                             {
                                a=c%10;
                                sum=sum+(a*a*a);
                                c=c/10;
                             }
                         if(sum==b)
                       {
                         System.out.println(b);
                         count=count+1;
                       }
                          b++;
                     }

        }
}	