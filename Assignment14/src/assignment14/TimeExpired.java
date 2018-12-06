
package assignment14;

public class TimeExpired extends Ticket
{
    private int fine;
    
    public TimeExpired(String tag , String make, String model , String color)
    {
        super(tag, make, model , color);
        this.fine = 50;
    }
    
    public int getFine()
    {
        return fine;
    }
    
    
    @Override
    public String printTicket()
    {
        return                               "\nTicket: Time Expired \n"         +
                                             "Tag: "              + getTag()   +
                                             "\nMake: "          + getMake()  +
                                             "\nModel: "         + getModel() +
                                             "\nColor: "         + getColor() +
                                             "\nYour fine is: $" + getFine() + "\n";
    }
}
