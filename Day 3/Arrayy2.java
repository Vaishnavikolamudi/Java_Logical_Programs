import java.util.Scanner;

class Arrayy2 {
    public static void main(String[] args)
 {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        
        int[] a = new int[n]; 

        System.out.println("Enter elements into the array:");
        for (int i = 0; i < a.length; i++)
 {  
            a[i] = sc.nextInt();
        }

        int sum = 0; 
        System.out.println("The elements in the array are:");
        for (int i = 0; i < a.length; i++) 
{  
            System.out.println(a[i]);
            sum += a[i]; 
        }
        
        System.out.println("The sum of the array elements is: " + sum);
        
        sc.close(); 
    }
}
