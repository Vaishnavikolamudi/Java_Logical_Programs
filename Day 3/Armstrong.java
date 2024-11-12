import java.util.Scanner;
class Armstrong
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int num, temp, digit, sum = 0;
      System.out.println("Enter a number:");
      num = sc.nextInt();
      temp = num;
      while(temp != 0)
      {
       digit = temp % 10;
       sum += digit * digit * digit;
       temp /= 10;
       }
      if(sum == num)
       System.out.println("Armstrong number");
      else
       System.out.println("Not an Armstrong number");
}
}
