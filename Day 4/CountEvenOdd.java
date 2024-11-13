import java.util.Scanner;
class CountEvenOdd
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int n, evenCount = 0, oddCount = 0;
      System.out.println("Enter array size");
      n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter array elements");
      for(int i = 0; i < n; i++)
      {
       arr[i] = sc.nextInt();
       if(arr[i] % 2 == 0)
        evenCount++;
       else
        oddCount++;
      }
      System.out.println("Even count: " + evenCount + ", Odd count: " + oddCount);
}
}
