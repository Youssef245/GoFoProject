package Gofo;

import java.util.ArrayList;

public class Playground {

    private String name;
    private String location;
    private String status="Pending";
    private double size;
    ArrayList <Integer> availableHours = new ArrayList<Integer>();
    private float pricePerHour;
    private int cancellationPeriod;
    private PlaygroundOwner owner;
    
    /** Normal Constructor */
    
    Playground (){};
    
    /** Method to set the name to new value
     * @param n The new value of name*/
    
    public void setName (String n)
    {
        name =n;
    }
    
    /** Method to set the location to new value
     * @param n The new value of location*/
    
    public void setLocation( String n)
    {
        location = n;            
    }
    
    /** Method to set the size to new value
     * @param n The new value of size*/
    
    public void setSize(double n)
    {
        size = n;
    }
    
    /** Method to set the available hours to new values
     * @param n List of new values of available hours*/
    
    public void setHours(ArrayList<Integer> n)
    {
        availableHours = n; 
    }
    
    /** Method to set the price per hour to new value
     * @param n The new value of price per hour*/
    
    public void setPrice(float n)
    {
        pricePerHour = n; 
    }
    
    /** Method to set the cancellation period to new value
     * @param n The new value of cancellation period*/
    
    public void setPeriod(int n)
    {
        cancellationPeriod = n; 
    }
    
    /** Method to set the status to new value
     * @param n The new value of status*/
    
    public void setStatus(String n)
    {
        status = n; 
    }
    
    /** Method to return the value of name
     * @return the value of name */
    
    public String getName()
    {
        return name;
    }
    
    /** Method to return the value of location
     * @return the value of location */
    
    public String getLocation()
    {
        return location;
    }
    
    /** Method to return the value of size
     * @return the value of size */
    
    public double getSize()
    {
        return size;
    }
    
    /** Method to return the values of available hours
     * @return List of the values of available hours */
    
    public ArrayList<Integer> getHours()
    {
        return availableHours;
    }
    
    /** Method to return the value of price per hour
     * @return the value of price per hour */
    
    public float getPrice()
    {
        return pricePerHour;
    }
    
    /** Method to return the value of cancellation period
     * @return the value of cancellation period */
    
    public int getPeriod()
    {
        return cancellationPeriod;
    }
    
    /** Method to return the value of status
     * @return the value of status */
    
    public String getStatus()
    {
        return status;
    }
    
    /** Method to set the Playground to his owner
     * @param a The new owner of playground */
    
    public void setOwner(PlaygroundOwner a)
    {
        owner=a;
    }
    
    /** Method to return the owner of playground
     * @return the owner of playground */
    
    public PlaygroundOwner getOwner ()
    {
        return owner;
    }
    
    
    
    
    
    
    
    
    
    
    
    




}


