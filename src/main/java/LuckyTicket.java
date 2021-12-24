import java.util.ArrayList;
import java.util.List;

public class LuckyTicket {

    public boolean isTicketLucky(int ticketNumber) {
        List<Integer> numbers = new ArrayList<>();

        do {
           numbers.add(ticketNumber % 10);
           ticketNumber /= 10;
        } while (ticketNumber > 0);

        int listSize = numbers.size();

        if (listSize % 2 != 0) {
            return false;
        }

        int firstHalfSum = 0;
        int secondHalfSum = 0;

        for (int i = 0; i < listSize; i++) {
           if (i < listSize / 2) {
               firstHalfSum += numbers.get(i);
           } else {
               secondHalfSum += numbers.get(i);
           }
        }

        return firstHalfSum == secondHalfSum;
    }
}
