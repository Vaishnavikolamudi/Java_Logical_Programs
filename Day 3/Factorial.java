import java.util.Scanner;
class Factorial
{
     public static void main(String[] args)
     {
      Scanner sc=new Scanner(System.in);
      int i=1, n, sum=1;
      System.out.println("Enter a number");
      n=sc.nextInt();
      while(i<=n)
      {
       sum=sum*i;
       i++;
       }
       System.out.println("The Factorial of a given number is:"+sum);
}
}