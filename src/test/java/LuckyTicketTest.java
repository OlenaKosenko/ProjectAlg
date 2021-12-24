import org.junit.Assert;
import org.junit.Test;

public class LuckyTicketTest {


    @Test
    public void testLuckyTicket() {
        int ticketNumber = 832661;
        boolean expectedResult = true;

        LuckyTicket luckyTicket = new LuckyTicket();
        boolean actualResult = luckyTicket.isTicketLucky(ticketNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLuckyTicket2() {
        int ticketNumber = 213985;
        boolean expectedResult = false;

        LuckyTicket luckyTicket = new LuckyTicket();
        boolean actualResult = luckyTicket.isTicketLucky(ticketNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLuckyTicket3() {
        int ticketNumber = 6701;
        boolean expectedResult = false;

        LuckyTicket luckyTicket = new LuckyTicket();
        boolean actualResult = luckyTicket.isTicketLucky(ticketNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLuckyTicket4() {
        int ticketNumber = 0;
        boolean expectedResult = false;

        LuckyTicket luckyTicket = new LuckyTicket();
        boolean actualResult = luckyTicket.isTicketLucky(ticketNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLuckyTicket5() {
        int ticketNumber = -22;
        boolean expectedResult = false;

        LuckyTicket luckyTicket = new LuckyTicket();
        boolean actualResult = luckyTicket.isTicketLucky(ticketNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLuckyTicket6() {
        int ticketNumber = 232;
        boolean expectedResult = false;

        LuckyTicket luckyTicket = new LuckyTicket();
        boolean actualResult = luckyTicket.isTicketLucky(ticketNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLuckyTicket7() {
        int ticketNumber = 2350;
        boolean expectedResult = true;

        LuckyTicket luckyTicket = new LuckyTicket();
        boolean actualResult = luckyTicket.isTicketLucky(ticketNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
