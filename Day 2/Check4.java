import java.util.Scanner;

class Check4
 {
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
 {
            System.out.println("The character is an alphabet.");
        }
 else if (ch >= '0' && ch <= '9')
 {
            System.out.println("The character is a digit.");
        }
 else 
{
            System.out.println("The character is a special character.");
        }

        scanner.close();
    }
}
