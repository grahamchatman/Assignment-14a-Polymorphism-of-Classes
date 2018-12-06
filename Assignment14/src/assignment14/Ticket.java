
package assignment14;

public abstract class Ticket 
{
    private String tag;
    private String make;
    private String model;
    private String color;
    
    public Ticket(String tag , String make , String model , String color)
    {
        this.tag = tag;
        this.make = make;
        this.model = model;
        this.color = color;
    }
    
    
    public abstract String printTicket();
    
    public void setTag(String tag)
    {
        this.tag = tag;
    }
    
    public String getTag()
    {
        return tag;
    }
    
    public void setMake(String make)
    {
        this.make = make;
    }
    
    public String getMake()
    {
        return make;
    }
    
    public void setModel(String model)
    {
        this.model = model;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public String getColor()
    {
        return color;
    }
}
