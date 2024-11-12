import java.util.Scanner;
class Strong2
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int n, num, temp, digit, sum;
      System.out.println("Enter n value");
      n = sc.nextInt();
      for(num = 1; num <= n; num++)
      {
       sum = 0;
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
        System.out.println(num);
      }
}
}
