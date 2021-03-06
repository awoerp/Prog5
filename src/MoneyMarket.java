/** This class is a child class of account. It has different information
 * that is specific to a money market account. It has its own too string 
 * method and constructor.
 * @author SteveWoerpel & Andy Woerpel
 */
public class MoneyMarket extends Account
{
   private static final int FEE = 12;
   private static final double APY = .65;
   private static final double MIN_BAL = 2500;   
   private static final int WITHDRAW_LIMIT = 6;
   private int withdrawals;
   
    /**
    * This creates an object based on a name, phone number, and also sets
    * the number of withdrawals to zero.
    * @param name String
    * @param phone String
    */
   public MoneyMarket(String name, String phone)
   {
      super(name, phone);
      withdrawals = 0;
   }
   
   /**
    * Creates a new MoneyMarket account that doesnt increase the account
    * number.
    * @param name String
    * @param phone String
    * @param special boolean
    */
   public MoneyMarket(String name, String phone, boolean special)
   {
      super(name, phone);
      withdrawals = 0;
      super.decreaseNumberOfAccounts();
   }
   
   /**
    * unused in program 5
    */
   public void applyInterestAndFee()
   {
      
   }
   
    /**
    * returns the account information as a string
    * @return String
    */
   public String toString()
   {
      return("Account number:      " + Integer.toString(accNumber) + "\n" 
              + holder.toString() +
             "Account Type:            Money Market" + "\n" +
             "Date Opened:            " + openOn.toString());
   }
   
}
