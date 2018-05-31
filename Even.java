public class Even
{
int num;
public void isEven(int num)
{
if(num%2==0)
{
System.out.println("True");
}else
{
System.out.println("False");
}
}
public static void main(String args[])
{ 
Even m1=new Even();
m1.isEven(8);
}
}