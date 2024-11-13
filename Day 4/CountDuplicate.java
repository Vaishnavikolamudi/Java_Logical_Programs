import java.util.Scanner;
class CountDuplicate
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int n, duplicateCount = 0;
      System.out.println("Enter array size");
      n = sc.nextInt();
      int[] arr = new int[n];
      int[] freq = new int[n];
      System.out.println("Enter array elements");
      for(int i = 0; i < n; i++)
      {
       arr[i] = sc.nextInt();
       freq[i] = -1;
      }
      for(int i = 0; i < n; i++)
      {
       int count = 1;
       for(int j = i + 1; j < n; j++)
       {
        if(arr[i] == arr[j])
        {
         count++;
         freq[j] = 0;
        }
       }
       if(freq[i] != 0 && count > 1)
        duplicateCount++;
      }
      System.out.println("Total duplicate elements: " + duplicateCount);
}
}
