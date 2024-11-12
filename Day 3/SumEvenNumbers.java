import java.util.Scanner;
class SumEvenNumbers
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int i = 2, n, sum = 0;
      System.out.println("Enter n value:");
      n = sc.nextInt();
      while(i <= n)
      {
       sum += i;
       i += 2;
       }
       System.out.println(sum);
}
}
