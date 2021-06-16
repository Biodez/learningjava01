import java.util.Arrays;

public class LotteryTickets {
    public static void main(String[] args) {
        int[] ticket1 = {34, 43, 45, 65, 21, 54};
        int[] ticket2 = Arrays.copyOf(ticket1, 6);
        ticket2[2] = 54;

        System.out.print("Ticket 1 numbers: "); 
        printTicketNumbers(ticket1);  

        System.out.print("Ticket 2 numbers: "); 
        printTicketNumbers(ticket2);
    }

    public static void printTicketNumbers(int[] ticket){
        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " ");
        }
        System.out.println("\n");
    }
    
}

