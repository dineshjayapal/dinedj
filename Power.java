import java.util.*;
import java.lang.String;
public class Power
{
  public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  int result=1;
  int n=s.nextInt();
  int p=s.nextInt();
   if(n>=0&&p==0)
     {
        result=1;
     }
    else if(n==0&&p>=1)
      { 
         result=0;
      }
    else
     {
         for(int i=1;i<=p;i++)
	 {
            result=result*n;
 	 }	    
     }System.out.println(result);
}
}