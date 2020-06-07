package Gofo;
import java.util.Scanner;

public class SignUp {
    
    Scanner input = new Scanner(System.in);
    
    /**Normal Constructor */
    
    SignUp(){};
    
    /** Boolean Method to check the validity of an email entered by the user
     * @param email the entered email
     * @return whether the email is good or not */
    
    private boolean checkEmail (String email)
    {
        if(email.contains(" ")||!email.contains("@")||!email.contains(".com"))
            return false;
        else
            return true;
            
    }
    
    /**Boolean Method to check the validity of a phone number entered by the user
     * @param phone number the entered email
     * @return whether the phone number is good or not */
    
    private boolean checkPhone (String phone)
    {
        boolean flag=false;
        for (int i=0;i<phone.length();i++)
        {
            if(Character.isLetter(phone.charAt(i)))
            {
                flag=true;
            }
        }
        if(flag)
            return false;
        else
            return true;
    }
    
    /** Method to sign up a new player 
     * @return  the new player */
    
    public Player SignPlayer ()
        {
            
                Player p1 = new Player();
                System.out.print("Enter your Name :  ");
                p1.setName(input.nextLine());
                System.out.print("Enter your ID :  ");
                p1.setID(input.nextLine());
                System.out.print("Enter your Password :  ");
                p1.setPassword(input.nextLine());
                System.out.print("Enter your Location :  ");
                p1.setLocation(input.nextLine());
                while (true)
                {
                    System.out.print("Enter your Email :  ");
                    String mail=input.nextLine();
                    if(checkEmail(mail))
                    {
                        p1.setEmail(mail);
                        break;
                    }
                    else
                        System.out.println("Invalid Input, Try Again");
                }
                while (true)
                {
                    System.out.print("Enter your Phone :  ");
                    String phoneNum=input.nextLine();
                    if(checkPhone(phoneNum))
                    {
                        p1.setPhone(phoneNum);
                        break;
                    }
                    else
                        System.out.println("Invalid Input, Try Again");
                }
                System.out.print("Enter your Balance :  ");
                p1.setEWallet(Double.parseDouble(input.nextLine()));
                System.out.print("Enter The Verification Code:  ");
                String Verification=input.nextLine();
                System.out.println("Registered Successfully");
                return p1;
      }
    
    /** Method to sign up a new playground owner
     * @return  the new playground owner */
    
    public PlaygroundOwner signOwner ()
    {
            
                PlaygroundOwner p1 = new PlaygroundOwner();
                System.out.print("Enter your Name :  ");
                p1.setName(input.nextLine());
                System.out.print("Enter your ID :  ");
                p1.setID(input.nextLine());
                System.out.print("Enter your Password :  ");
                p1.setPassword(input.nextLine());
                System.out.print("Enter your Location :  ");
                p1.setLocation(input.nextLine());
                while (true)
                {
                    System.out.print("Enter your Email :  ");
                    String mail=input.nextLine();
                    if(checkEmail(mail))
                    {
                        p1.setEmail(mail);
                        break;
                    }
                    else
                        System.out.println("Invalid Input, Try Again");
                }
                while (true)
                {
                    System.out.print("Enter your Phone :  ");
                    String phoneNum=input.nextLine();
                    if(checkPhone(phoneNum))
                    {
                        p1.setPhone(phoneNum);
                        break;
                    }
                    else
                        System.out.println("Invalid Input, Try Again");
                }
                System.out.print("Enter your Balance :  ");
                p1.setEWallet(Double.parseDouble(input.nextLine()));
                System.out.print("Enter The Verification Code:  ");
                String Verification=input.nextLine();
                System.out.println("Registered Successfully");
                return p1;
            
        
    }        
        
        
    
}


