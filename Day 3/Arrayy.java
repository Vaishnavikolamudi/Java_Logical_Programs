import java.util.Scanner;

class Arrayy 
{
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

        System.out.println("The elements in the array are:");
        for (int i = 0; i < a.length; i++) 
{  
            System.out.println(a[i]);
        }
        
        sc.close(); 
    }
}
