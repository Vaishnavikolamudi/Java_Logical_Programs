import java.util.Scanner;
class SumOfDigits
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int num, sum = 0, digit;
      System.out.println("Enter a number:");
      num = sc.nextInt();
      while(num != 0)
      {
       digit = num % 10;
       sum += digit;
       num /= 10;
       }
      System.out.println(sum);
}
}
