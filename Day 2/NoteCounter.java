import java.util.Scanner;

class NoteCounter 
{
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        int[] notes = {1000, 500, 100, 50, 20, 10, 5, 1};
        int[] count = new int[notes.length];

        for (int i = 0; i < notes.length; i++) 
{
            count[i] = amount / notes[i];
            amount = amount % notes[i];
        }

        System.out.println("Total number of notes: ");
        for (int i = 0; i < notes.length; i++)
 {
            if (count[i] > 0) 
{
                System.out.println(notes[i] + " : " + count[i]);
            }
        }

        scanner.close();
    }
}
