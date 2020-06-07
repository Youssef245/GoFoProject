package Gofo;

public class EWallet {
    private double balance=0;
    
    /** Normal Constructor */
    
    EWallet(){};
    
    /** Parameterized Constructor
     * @param b The new Balance to be set     */
    
    EWallet (double b)
    {
        balance=b;
    }
    
    /** This method assigns a given value to the balance
     * @param b the new balance */
    
    public void setBalance(double b)
    {
        balance=b;
    }
    
    /** This method returns the value of balance
     * @return value of balance*/
    
    public double getBalance()
    {
        return balance;
    }
    
    /** The method is to transfer money from one wallet to another
     * @param money The amount of money to be transfered
     * @param wallet The wallet that will receive the money */
    
    public void transferMoney (double money,EWallet wallet)
    {
        if(balance<money)
            System.out.println("You Don't Have Enough Money");
        else
        {
            balance-=money;
            wallet.balance+=money;
        }
        
    }
    
    
    

}


