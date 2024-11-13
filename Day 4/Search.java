import java.util.Scanner;
class Search
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int n, ser, found = 0;
      System.out.println("Enter array size");
      n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter array elements");
      for(int i = 0; i < n; i++)
       arr[i] = sc.nextInt();
      System.out.println("Enter element to search");
      ser = sc.nextInt();
      for(int i = 0; i < n; i++)
      {
       if(arr[i] == ser)
       {
        System.out.println(ser + " found at position " + (i + 1));
        found = 1;
        break;
       }
      }
      if(found == 0)
       System.out.println(ser + " not found in the array");
}
}
