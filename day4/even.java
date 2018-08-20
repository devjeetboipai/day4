import java.io.*;

class even
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
int i,n;
System.out.print("Enter the number upto which even numbers should be displayed : ");
n=Integer.parseInt(input.readLine());
System.out.println("Even numbers upto "+n+" are : ");
for(i=1;i<=n;i++)
{
if(i%2==0)
System.out.println(i);
}
}
}