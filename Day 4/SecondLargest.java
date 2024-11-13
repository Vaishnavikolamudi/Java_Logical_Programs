import java.util.Scanner;
class SecondLargest
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int n;
      System.out.println("Enter array size");
      n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter array elements");
      for(int i = 0; i < n; i++)
       arr[i] = sc.nextInt();
      int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
      for(int i = 0; i < n; i++)
      {
       if(arr[i] > largest)
       {
        secondLargest = largest;
        largest = arr[i];
       }
       else if(arr[i] > secondLargest && arr[i] != largest)
        secondLargest = arr[i];
      }
      System.out.println("Second largest element: " + secondLargest);
}
}
