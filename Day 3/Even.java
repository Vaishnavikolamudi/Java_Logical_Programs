import java.util.Scanner;

class Even {
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n value:");
        int n = sc.nextInt(); 
        int i = 2; 
        
        while(i <= n) 
{ 
            System.out.println(i);
            i += 2; 
        }
        
        sc.close(); 
    }
}
