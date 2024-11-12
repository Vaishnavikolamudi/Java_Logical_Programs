import java.util.Scanner;
class ProductOfDigits
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int num, product = 1, digit;
      System.out.println("Enter a number:");
      num = sc.nextInt();
      while(num != 0)
      {
       digit = num % 10;
       product *= digit;
       num /= 10;
       }
      System.out.println(product);
}
}
