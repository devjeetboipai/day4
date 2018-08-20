import java.io.*;

class reverse
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
int i,n;
System.out.print("Enter the number to reverse : ");
n=Integer.parseInt(input.readLine());
int m,a=n,sum=0;
while(a!=0)
{
m=a%10;
sum=(sum*10)+m;
a=a/10;
}
System.out.println(sum+" is the reversed number ");
}
}