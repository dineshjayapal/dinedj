public class Positive
{
  public static void main(String a[])
     {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if((n>=1)&&(n<=100000))
	 {
	   System.out.println("Positive");
	 }else
	    {
	      if(n<0)
		{
		  System.out.println("Negative");
		}else{
		       System.out.println("Zero");
                      }
	     }
      }
}	