package Gofo;

import java.util.ArrayList;
import java.util.Scanner;

public class PlaygroundOwner extends User {
    
    Scanner input = new Scanner(System.in);

    {role="PlaygroundOwner";}
    
    /** Normal Constructor*/
    
    PlaygroundOwner (){};
    
    /** Method to update playground by the owner
     * @param allplaygrounds List of all playgrounds in the system
     * @return the new List of playgrounds after the update */
    
    public ArrayList <Playground> updatePlayground (ArrayList <Playground> allplaygrounds)
    {
        ArrayList<Playground> playgrounds = new ArrayList<Playground>();
        playgrounds=allplaygrounds;
        String pgName;
        System.out.print("Enter Playground Name : ");
        pgName=input.nextLine();
        boolean flag=false;
        String update;
        double update2;
        int update3;
        float update4;
        int position=0;
        for (int i=0;i<playgrounds.size();i++)
        {
            if (playgrounds.get(i).getName().equalsIgnoreCase(pgName))
                {
                    if (playgrounds.get(i).getOwner().getName().equalsIgnoreCase(name))
                    {
                        flag=true;
                        position=i;
                    }
                }
        }
        if(!flag)
            System.out.println("name not found");
        else
        {
            System.out.println("Choose what you want to update : ");
            System.out.println("1- Name"+System.lineSeparator()+"2- Location"+System.lineSeparator()+"3- Size"+System.lineSeparator()
            +"4-Avaliable Hours"+System.lineSeparator()+"5- Price per Hour"+System.lineSeparator()+"6- Cancellation Period");
            int choice = Integer.parseInt(input.nextLine());
            if(choice==1)
            {
                System.out.print("Enter New Name : ");
                update=input.nextLine();
                playgrounds.get(position).setName(update);    
            }
            else if(choice==2)
            {
                System.out.print("Enter New Location : ");
                update=input.nextLine();
                playgrounds.get(position).setLocation(update);    
            }
            else if(choice==3)
            {
                System.out.print("Enter New Size : ");
                update2=Double.parseDouble(input.nextLine());
                playgrounds.get(position).setSize(update2);    
            }
            else if(choice==5)
            {
                System.out.print("Enter New Price : ");
                update4=Float.parseFloat(input.nextLine());
                playgrounds.get(position).setPrice(update4);
            }
            else if(choice==6)
            {
                System.out.print("Enter New Cancellation Period : ");
                update3=Integer.parseInt(input.nextLine());
                playgrounds.get(position).setSize(update3);    
            }
            
                
        }
        return playgrounds;
    }
    
    
    /** Method to show the menu when the login succeeds*/
    
    public void showMenu()
     {
         System.out.println("Choose From The Option : ");
         System.out.println("1 - Add a Playground");
         System.out.println("2 - Check Wallet");
         System.out.println("3 - Update Playground");
         System.out.println("4 - Exit");
     }
    
}


