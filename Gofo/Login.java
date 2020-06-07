package Gofo;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    private String id;
    private String pass;
    private int position;
    
    Scanner input = new Scanner(System.in);
    
    /** Normal Constructor */
    
    Login(){};
    
    /** Method to log in for the players
     * @param players list of all players in the game
     * @return index of the player who logged in inside the list*/
    
    public int LoginPlayers(ArrayList <Player> players){
        
        System.out.print("Enter your ID :");
        id=input.nextLine();
        System.out.print("Enter your Password : ");
        pass=input.nextLine();
            boolean flag=false;
            for(int i=0;i<players.size();i++)
            {
                if(id.equalsIgnoreCase(players.get(i).ID))
                    if(pass.equalsIgnoreCase(players.get(i).password))
                    {
                        flag=true;
                        position=i;
                    }
            }
            if(flag)
            {
                System.out.println("Login Succeed"); 
                 return position;
                
            }
            else 
                return -1;
    }
    
    /** Method to log in for the playground owners
     * @param playgroundOwners list of all playground owners in the game
     * @return index of the playground owner who logged in inside the list*/
    
    public int PlaygroundOwnerLogin(ArrayList <PlaygroundOwner> playgroundOwners)
    {
            boolean flag=false;
            System.out.print("Enter your ID :");
            id=input.nextLine();
            System.out.print("Enter your Password : ");
            pass=input.nextLine();
            for(int i=0;i<playgroundOwners.size();i++)
            {
                if(id.equalsIgnoreCase(playgroundOwners.get(i).ID))
                    if(pass.equalsIgnoreCase(playgroundOwners.get(i).password))
                    {
                        flag=true;
                        position=i;
                    }
            }
            if(flag)
            {
                System.out.println("Login Succeed"); 
                 return position;
                
            }
            else 
                return -1;
    }
}


