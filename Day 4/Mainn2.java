class Addition
{
int a,b,c;
void add(int x, int y)
{
a=x;
b=y;
c=a+b;
System.out.println("The Addition value is:"+c);
}
}
class Mainn2
{
public static void main(String[] args)
{
int m=67, n=34;
Addition a1=new Addition();
a1.add(m,n);
}
}