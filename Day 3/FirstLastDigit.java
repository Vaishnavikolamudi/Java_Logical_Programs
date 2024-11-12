import java.util.Scanner;
class FirstLastDigit
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int num, first, last;
      System.out.println("Enter a number:");
      num = sc.nextInt();
      last = num % 10;
      while(num >= 10)
      {
       num /= 10;
       }
      first = num;
      System.out.println("First digit: " + first + ", Last digit: " + last);
}
}
