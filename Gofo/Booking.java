package Gofo;

import java.util.ArrayList;
import java.util.Scanner;

public class Booking {

    private double money;
    Scanner input = new Scanner(System.in);
    private String chosenName;
    private PlaygroundOwner pgowner = new PlaygroundOwner();
    private ArrayList<Integer> selectedHours=new ArrayList<Integer>();
    
    /** Normal Constructor */
    
    Booking (){};
    
    /** Method to filter Hours and playgrounds according to specific information from the player
     * @param Location location of playgrounds
     * @param hour starting hour of the booking
     * @param num number of hours to be booked
     * @param allplaygrounds List of all playgrounds in the system */
    
    public void FilterHours (String Location,int hour,int num,ArrayList<Playground> allplaygrounds)
    {
        int hour2=hour,counter=0;
        boolean Lflag=false;
        boolean Hflag=true;
        boolean found=false;
        selectedHours.add(hour);
        for(int i=0;i<num-1;i++)
        {
            hour2++;
            selectedHours.add(hour2);
        }
        System.out.println("The Avaliable Playgrounds : ");
        for (int i=0;i<allplaygrounds.size();i++)
        {
            if(allplaygrounds.get(i).getLocation().equalsIgnoreCase(Location))
            {
                Lflag=true;
                ArrayList <Integer> hours = new ArrayList<Integer>();
                hours=allplaygrounds.get(i).getHours();
                for(int z=0;z<selectedHours.size();z++)
                {
                    for (int j=0;j<hours.size();j++)
                    {
                        found=false;
                        if(selectedHours.get(z)==hours.get(j))
                        {
                            found=true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        Hflag=false;
                        break;
                    }
                }
                
                
            }
            if(Hflag&&Lflag)
            {
                System.out.print(allplaygrounds.get(i).getName());
                System.out.print("    "+allplaygrounds.get(i).getSize());
                System.out.println("    "+allplaygrounds.get(i).getPrice());
                counter++;
            }
        }
        if(counter!=0)
        {
            System.out.print("Enter The Name of The Playground : ");
            chosenName=input.nextLine();
            System.out.println("Booking Successfull");
        }
        else
            System.out.println("No Avaliable Playgrounds");
    }
    
    /** Methods to update the available hours after the booking
     * @param playgrounds List of all playgrounds in the system
     * @return new play grounds after update */
    
    public ArrayList<Playground> updateHours (ArrayList<Playground> playgrounds)
    {
        ArrayList <Playground> allplaygrounds = new ArrayList<Playground>();
        allplaygrounds=playgrounds;
        for (int i=0;i<allplaygrounds.size();i++)
        {
            if(allplaygrounds.get(i).getName().equalsIgnoreCase(chosenName))
            {
                pgowner=allplaygrounds.get(i).getOwner();
                for(int z=0;z<selectedHours.size();z++)
                {
                    for(int j=0;j<allplaygrounds.get(i).getHours().size();j++)
                        if(selectedHours.get(z)==allplaygrounds.get(i).getHours().get(j))
                        {
                            allplaygrounds.get(i).getHours().remove(j);
                            break;
                        }
                        
                }
            }
        }
        return allplaygrounds;
    }
    
    /** Method to calculate the total price of the booking
     * @param numofHours number of hours to be booked
     * @param allplaygrounds List of all playgrounds in the system*/
    
    public void priceCalculation (int numofHours,ArrayList<Playground> allplaygrounds)
    {
        double price=0;
        for (int i=0;i<allplaygrounds.size();i++)
        {
            if(allplaygrounds.get(i).getName().equalsIgnoreCase(chosenName))
            {
                price=allplaygrounds.get(i).getPrice();
                break;
            }
        }
        money=price*numofHours;
        
    }
    
    /** Method to do the Payment
     * @param pl The Player who will pay */
    
    public void Payment (Player pl)
    {
        String pass;
        System.out.print("Enter Your Password : ");
        pass=input.nextLine();
        if(pass.equalsIgnoreCase(pl.getPassword()))
                pl.getEWallet().transferMoney(money, pgowner.getEWallet());
        else
            System.out.println("Password Not Correct , Payment Not Done");
    }
    
}


