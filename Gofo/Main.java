package Gofo;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<Player>();
        ArrayList<PlaygroundOwner> playgroundOwners = new ArrayList<PlaygroundOwner>();
        ArrayList <Playground> allplaygrounds = new ArrayList<Playground>();
        Player p1 = new Player();
        PlaygroundOwner pg1 = new PlaygroundOwner();
        Admin a1 = new Admin();
        Login log = new Login();
        SignUp sign= new SignUp();
        Scanner input = new Scanner(System.in);
        String id,pass,answer,role="";
        int position=0,choice=0;
        int logAnswer=0,backAnswer=0;
outer : 
    while (true)
    {
        System.out.println("Do you want to Login or Sign Up?");
        answer=input.nextLine();
        if(answer.equalsIgnoreCase("Login"))
        {
            System.out.print("Enter your role : ");
            role=input.nextLine();
            if(role.equalsIgnoreCase("Player"))
            {
                position=log.LoginPlayers(players);
                if(position==-1)
                {
                    System.out.println("Login not Successful");
                    role="";
                }
                else
                {
                    System.out.println("Login Successful");
                    p1=players.get(position);
                }
            }
            else if (role.equalsIgnoreCase("PlaygroundOwner"))
            {
                position=log.PlaygroundOwnerLogin(playgroundOwners);
                if(position==-1)
                {
                    System.out.println("Login not Successful");
                    role="";
                }
                else
                {
                    System.out.println("Login Successful");
                    pg1=playgroundOwners.get(position);
                }
            }
            else
                System.out.println("Invalid Input");
        }
        else if (answer.equalsIgnoreCase("Sign Up"))
        {
            System.out.print("Enter your Role (PlaygroundOwner/Player) :  ");
            role=input.nextLine();
            if(role.equalsIgnoreCase("Player"))
            {
                p1=sign.SignPlayer();
                players.add(p1);
            }
            else if (role.equalsIgnoreCase("PlaygroundOwner"))
            {
                pg1=sign.signOwner();
                playgroundOwners.add(pg1);
            }
            else
                System.out.println("Invalid Input");
        }
        else {
            System.out.println("Invalid Input");
            role="";
        }
        
        if(role.equalsIgnoreCase("Player"))
        {
        inner : 
            while(true)
            {
            p1.showMenu();
            choice=Integer.parseInt(input.nextLine());
            if(choice==1)
            {
                String location;
                int hour,num;
                Booking b1 = new Booking ();
                System.out.print("Enter The Location : ");
                location=input.nextLine();
                System.out.print("Enter The Starting Hour (24 h system) : ");
                hour=Integer.parseInt(input.nextLine());
                System.out.print("Enter The Num of Hours : ");
                num=Integer.parseInt(input.nextLine());
                b1.FilterHours(location, hour, num, allplaygrounds);
                allplaygrounds=b1.updateHours(allplaygrounds);
                b1.priceCalculation(num, allplaygrounds);
                b1.Payment(p1);
            }
            else if(choice==2)
            {
                p1.createTeam(players);
            }
            else if(choice==3)
            {
                System.out.println("Enter The ID of the player you want to send the Email to :");
                id=input.nextLine();
                p1.sendEmails(players, id);
            }
            else if (choice==4)
            {
                p1.showInbox();
            }
            else if (choice==5)
            {
                System.out.print("Your Balance is : ");
                System.out.println(p1.getEWallet().getBalance());
            }
            else if (choice==6)
            {
                return;
            }
            else
            {
                System.out.println("Invalid Input");
            }
            System.out.println("Press 1 for Log Out or any key to continue");
            logAnswer=Integer.parseInt(input.nextLine());
            if(logAnswer==1)
                break inner;
                
        }
        }
        else if (role.equalsIgnoreCase("PlaygroundOwner"))
        {
        inner : 
            while(true)
            {
            pg1.showMenu();
            choice=Integer.parseInt(input.nextLine());
            if(choice==1)
            {
                int num=0;
                Playground pground = new Playground ();
                System.out.print("Enter The Name : ");
                pground.setName(input.nextLine());
                System.out.print("Enter The Location : ");
                pground.setLocation(input.nextLine());
                System.out.print("Enter The Size : ");
                pground.setSize(Double.parseDouble(input.nextLine()));
                System.out.print("Enter The Price Per Hour : ");
                pground.setPrice(Float.parseFloat(input.nextLine()));
                System.out.print("Enter The Cancellation Period : ");
                pground.setPeriod(Integer.parseInt(input.nextLine()));
                pground.setOwner(pg1);
                System.out.print("Enter The Num of Avaliable Hours : ");
                num=Integer.parseInt(input.nextLine());
                ArrayList <Integer> hours= new ArrayList <Integer>();
                System.out.println("Enter The Hours : ");
                for(int i=0;i<num;i++)
                {
                    hours.add(Integer.parseInt(input.nextLine()));
                }
                pground.setHours(hours);
                allplaygrounds.add(pground);
                
            }
            else if (choice==2)
            {
                System.out.print("Your Balance is : ");
                System.out.println(pg1.getEWallet().getBalance());
            }
            else if (choice==3)
            {
                allplaygrounds=pg1.updatePlayground(allplaygrounds);
            }
            else if (choice==4)
                return;
            else
                System.out.println("Invalid Input");
            System.out.println("Press 1 for Log Out or any key to continue");
            logAnswer=Integer.parseInt(input.nextLine());
            if(logAnswer==1)
                break inner;
        }
        }
        
    }
    }

}


