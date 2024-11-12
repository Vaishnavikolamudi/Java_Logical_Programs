import java.util.Scanner;
class SumFirstLastDigit
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int num, first, last, sum;
      System.out.println("Enter a number:");
      num = sc.nextInt();
      last = num % 10;
      while(num >= 10)
      {
       num /= 10;
       }
      first = num;
      sum = first + last;
      System.out.println(sum);
}
}
