import java.util.Scanner;
class Fibonacci
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int n, a = 0, b = 1, next;
      System.out.println("Enter n value");
      n = sc.nextInt();
      for(int i = 1; i <= n; i++)
      {
       System.out.print(a + " ");
       next = a + b;
       a = b;
       b = next;
      }
}
}
