package Gofo;

import java.util.Scanner;

public class Admin {

    private String name;
    private String phone;
    private String email;
    
    Scanner input = new Scanner(System.in);
    
    /** Normal Constructor */
    
    Admin(){};
    
    /** Method to set the name to new value
     * @param n The new value of name*/
    
    public void setName(String n)
    {
        name=n;
    }
    
    /** Method to set the phone to new value
     * @param n The new value of phone*/
    
    public void setPhone(String n)
    {
        phone=n;
    }
    
    /** Method to set the email to new value
     * @param n The new value of email*/
    
    public void setEmail(String n)
    {
        email=n;
    }
    
    /** Method to return the value of name
     * @return the value of name */
    
    public String getName()
    {
        return name;
    }
    
    /** Method to return the value of phone
     * @return the value of phone */
    
    public String getPhone()
    {
        return phone;
    }
    
    /** Method to return the value of email
     * @return the value of email */
    
    public String getEmail()
    {
        return email;
    }
    
    /** Method Allows admin to approve playground 
     * @param p Playground to be approved*/
    
    public void approvePlayground (Playground p)
    {
         String status;
         System.out.println("Enter (Approved/Not Approved)");
         status=input.nextLine();
         if(status.equalsIgnoreCase("Approved"))
             p.setStatus("Active");
         else if (status.equalsIgnoreCase("not Approved"))
             p.setStatus("Not Approved");
         else
             System.out.println("Enter a Valid Value");
        
    }
    

}


