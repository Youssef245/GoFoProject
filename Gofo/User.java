package Gofo;

import java.util.ArrayList;
import java.util.Scanner;

abstract class User {

    Scanner input = new Scanner(System.in);
    protected String ID;
    protected String password;
    protected String name;
    protected String email;
    protected String phone;
    protected String location;
    protected EWallet wallet=new EWallet();
    protected String role;
    protected ArrayList<String> emailInbox = new ArrayList<String>();
    
    
    /** Method to set the ID to new value
     * @param n The new value of ID*/
    
    public void setID (String n)
    {
        ID=n;
    }
    
    /** Method to set the password to new value
     * @param n The new value of password*/
    
    public void setPassword (String n)
    {
        password=n;
    }
    
    /** Method to set the name to new value
     * @param n The new value of name*/
    
    public void setName (String n)
    {
        name=n;
    }
    
    /** Method to set the email to new value
     * @param n The new value of email*/
    
    public void setEmail (String n)
    {
        email=n;
    }
    
    /** Method to set the phone to new value
     * @param n The new value of phone*/
    
    public void setPhone (String n)
    {
        phone=n;
    }
    
    /** Method to set the location to new value
     * @param n The new value of location*/
    
    public void setLocation (String n)
    {
        location=n;
    }
    
    /** Method to set the balance of the wallet to new value
     * @param n The new value of password*/
    
    public void setEWallet (double n)
    {
        wallet.setBalance(n);
    }
    
    /** Method to return the value of ID
     * @return the value of ID */
    
    public String getID ()
    {
        return ID;
    }
    
    /** Method to return the value of password
     * @return the value of password */
    
    public String getPassword ()
    {
        return password;
    }
    
    /** Method to return the value of name
     * @return the value of name */
    
    public String getName ()
    {
        return name;
    }
    
    /** Method to return the value of email
     * @return the value of email */
    
    public String getEmail ()
    {
        return email;
    }
    
    /** Method to return the value of phone
     * @return the value of phone */
    
    public String getPhone ()
    {
        return phone;
    }
    
    /** Method to return the value of location
     * @return the value of location */
    
    public String getLocation ()
    {
        return location;
    }
    
    /** Method to return the value of balance of the wallet
     * @return the value of balance of the wallet */
    
    public double getBalance()
    {
        return wallet.getBalance();
    }
    
    /** Method to return the wallet
     * @return the wallet */
    
    public EWallet getEWallet()
    {
        return wallet;
    }
    
    
}


