

import java.util.Scanner;

public class Helpdesk
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        QueuingSystem queuingSystem = QueuingSystem.getInstance();

        while(true)
        {
            System.out.println("\n[1] Display Queue Number \n[2] Increment Queue Number \n[3] Reset Queue Number \n[4]Shutdown");
            System.out.print("\nEnter choice: ");
            int choice = scan.nextInt();

            System.out.println("");

            if(choice == 1)
            {
                queuingSystem.getQueueNumber();
            }
            else if(choice == 2)
            {
                queuingSystem.incrementQueueNumber();
            }
            else if(choice == 3)
            {
                System.out.print("Enter Reset Number: ");
                int resetNumber = scan.nextInt();

                queuingSystem.resetQueueNumber(resetNumber);

                queuingSystem.getQueueNumber();
            }
            else
            {
                System.exit(0);
            }
        }
    }
}
