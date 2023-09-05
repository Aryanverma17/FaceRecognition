Class A
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter number of terms");
int term=sc.nextInt();
int a=0, b=1, sum;
for(int i=1;i<=term;i++)
{
System.out.print(a);
sum=a+b;
a=b;
b=sum;
}
}
}