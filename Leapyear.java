import java.util.*;
public class Leapyear
{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     if(a%4==0){
       System.out.println("Yes");
      }else if(a%4!=0){
         System.out.println("No");}
	else{
	   System.out.println("Invalid input");
}
}
}	