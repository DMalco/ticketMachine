public class Ticket
{
    public static int NEXT_TICKET_NUMBER = 1;
    private String regNumber;
    private int number;

    public Ticket(String aRegNumber)
    {
        this.regNumber = aRegNumber;
        this.number = NEXT_TICKET_NUMBER;

        NEXT_TICKET_NUMBER++;

    }

    public String getRegNumber()
    {
        return this.regNumber;
    }

    public int getNumber()
    {
        return number;
    }
}
