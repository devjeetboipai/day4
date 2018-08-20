import java.io.*;

class armstrong
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
int i,n;
System.out.print("Enter the number : ");
n=Integer.parseInt(input.readLine());
int length = String.valueOf(n).length();
int m,a=n;
double sum=0.00;
while(a!=0)
{
m=a%10;
sum=sum+(Math.pow(m,length));
a=a/10;
}
if(sum==n)
System.out.println(n+" is an Armstrong Number ");
else
System.out.println(n+" is not an Armstrong Number ");
}
}