import java.util.Scanner;
class Strong
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int num, temp, digit, sum = 0;
      System.out.println("Enter a number");
      num = sc.nextInt();
      temp = num;
      while(temp != 0)
      {
       digit = temp % 10;
       int fact = 1;
       for(int i = 1; i <= digit; i++)
        fact *= i;
       sum += fact;
       temp /= 10;
       }
      if(sum == num)
       System.out.println("Strong number");
      else
       System.out.println("Not a strong number");
}
}
