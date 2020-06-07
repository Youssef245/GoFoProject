package Gofo;

import java.util.ArrayList;
import java.util.Scanner;

public class Player extends User{

     {role="Player";}
     private ArrayList <User> team = new ArrayList<User>();
     Scanner input = new Scanner(System.in);
     
     /** Normal Constructor */
     
     Player (){};
     
     /** Method to create a team from other players
      * @param users  List of all players in the program */
     
     public void createTeam(ArrayList<Player> users)
     {
         int num;
         String id;
         System.out.println("How Many Members you want ?");
         num=Integer.parseInt(input.nextLine());
         System.out.println("Enter Their IDs : ");
         for(int i=0;i<num;i++)
         {
             id=input.nextLine();
             for(int z=0;z<users.size();z++)
             {
                 if(id.equalsIgnoreCase(users.get(z).getID()))
                 {
                     sendEmails(users,id);
                     team.add(users.get(z));
                 }
             }
         }
     }
     
     /**  Method to send an email to another player
      * @param users  List of all players in the program 
      * @param id The id of the user who will receive the email */
     
     public void sendEmails (ArrayList<Player> users,String id)
     {
         System.out.println("Enter what you want to send : ");
         String emaill;
         emaill=input.nextLine();
         for(int z=0;z<users.size();z++)
         {
             if(id.equalsIgnoreCase(users.get(z).getID()))
                 emailInbox.add(emaill);
         }
     }
     
     /** Method to show all the emails in the inbox */
     
     public void showInbox ()
     {
         for(int i =0 ;i<emailInbox.size();i++)
         {
             System.out.println(emailInbox.get(i));
             System.out.println("-----------------------------");
         }
     }
     
     /** Method to show the menu when the login succeeds*/
     
     public void showMenu()
     {
         System.out.println("Choose From The Option : ");
         System.out.println("1 - Book a Playground");
         System.out.println("2 - Create Team");
         System.out.println("3 - Send Email");
         System.out.println("4 - Show Mailbox");
         System.out.println("5 - Check Wallet");
         System.out.println("6 - Exit");
     }
}


