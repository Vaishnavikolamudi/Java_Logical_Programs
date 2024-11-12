import java.util.Scanner;
class SumPerfect
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int n, num, sum, i;
      System.out.println("Enter n value:");
      n = sc.nextInt();
      for(num = 1; num <= n; num++)
      {
       sum = 0;
       for(i = 1; i <= num / 2; i++)
        if(num % i == 0)
         sum += i;
       if(sum == num)
        System.out.println(num);
      }
}
}
