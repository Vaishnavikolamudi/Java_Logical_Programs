
import java.util.Scanner;

class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if ((num % 5 == 0) && (num % 11 == 0)) 
            System.out.println(num + " is divisible by both 5 and 11.");
        else 
            System.out.println(num + " is not divisible by both 5 and 11.");
        
        scanner.close();
    }
}


