import java.util.StringTokenizer;
class Token
{
public static void main(String[] args)
{
String st1="Hii Hello, Welcome to Java Programming";
StringTokenizer t=new StringTokenizer(st1);
System.out.println("The Number of Tokens available in the given string is:"+t.countTokens());
while(t.hasMoreTokens())
{
System.out.println(t.nextToken());
}
}
}