import java.util.Scanner;

class ElectricityBill {
    public static void main(String[] args) {
        
        double units, bill, surcharge, totalBill;

        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter electricity units: ");
        units = sc.nextDouble();

        
        if (units <= 50) 
{
            bill = units * 0.50;
        } 
else if (units <= 150)
 {
            bill = (50 * 0.50) + ((units - 50) * 0.75);
        }
 else if (units <= 250) 
{
            bill = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20);
        } 
else
 {
            bill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
        }

       
        surcharge = 0.20 * bill;
        totalBill = bill + surcharge;

        System.out.println("Total electricity bill: " + totalBill);

        sc.close();
    }
}
