import java.util.*;
import java.util.Scanner;
import java.lang.String;
public class Angrams
{ 
   public static void main(String args[])
     {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        char[] arr1=s1.toCharArray();
	char[] arr2=s2.toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	String str1=new String(arr1);
	String str2=new String(arr2);
	if(str1.equals(str2))
	  {
	    System.out.println(s1+" and "+s2+" are Anagram:true");
   	  }else{
		System.out.println(s1+" and "+s2+" are Anagram:false");
	       }
      }
}