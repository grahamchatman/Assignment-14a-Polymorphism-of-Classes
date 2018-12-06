
package assignment14;

import java.util.Scanner;

public class Assignment14 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        String tag = "";
        String make = "";
        String model = "";
        String color = "";
        
        int ticketType = 0;
        
        Ticket[] tickets = new Ticket[3];
        
        System.out.printf("%s" , "Enter the tag: ");
        tag = input.nextLine();
                
        System.out.printf("%s" , "Enter the make: ");
        make = input.nextLine();
                
        System.out.printf("%s" , "Enter the model: ");
        model = input.nextLine();
                
        System.out.printf("%s" , "Enter the color: ");
        color = input.nextLine();
        
        TimeExpired ticket1 = new TimeExpired (tag, make, model, color);
        tickets[0] = ticket1;
        
        Handicap ticket2 = new Handicap (tag, make, model, color);
        tickets[1] = ticket2;
                
        FireLane ticket3 = new FireLane (tag, make, model, color);
        tickets[2] = ticket3;
                
        System.out.printf("%s%n%s%s%s%n" , "Here is a list of posible tickets. "
                , "1: Time Expired Ticket\t" , "2: Handicapped Ticket\t" , "3: Fire Lane Ticket" );
        
        for(int i = 0; i < tickets.length; i ++)
        {
            System.out.printf("%s%s" , tickets[i].printTicket(), "\t");
        }
        
        System.out.printf("%n%s%n" , "What type of ticket would you like to print? Enter a number from 1 - 3. " );
        ticketSelection();
        ticketType = input.nextInt();
      
        switch (ticketType)
        {
            case 1:
                System.out.println("Your ticket is...");
                System.out.print(tickets[0].printTicket());
                
                break;
             
            case 2:
                
                System.out.println("Your ticket is...");
                System.out.print(tickets[1].printTicket());
                break;
            
            case 3:
                
                System.out.println("Your ticket is...");
                System.out.print(tickets[2].printTicket());
                break;
        }
    }
    
    public static void ticketSelection()
    {
        System.out.printf("%s%n%s%n%s%n", " 1 : Time Expired Ticket"
                                        , " 2 : Handicapped Ticket"
                                        , " 3 : Fire Lane Ticket");
    }
    
}
