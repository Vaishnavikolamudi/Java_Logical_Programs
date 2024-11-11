import java.util.Scanner;

class Check5
 {
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z')
 {
            System.out.println("The character is an uppercase alphabet.");
        } 
else if (ch >= 'a' && ch <= 'z')
 {
            System.out.println("The character is a lowercase alphabet.");
        } 
else
 {
            System.out.println("The character is not an alphabet.");
        }

        scanner.close();
    }
}
