import java.util.Scanner;
class ReverseNumber
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int num, reverse = 0, digit;
      System.out.println("Enter a number:");
      num = sc.nextInt();
      while(num != 0)
      {
       digit = num % 10;
       reverse = reverse * 10 + digit;
       num /= 10;
       }
      System.out.println(reverse);
}
}
