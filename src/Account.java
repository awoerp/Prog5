/**
 *
 * @author SteveWoerpel chett
 */
public abstract class Account 
{
   private static int numAccount = 1000;
   protected final int PERCENTAGE = 100;
   protected final int MONTH_PER_YEAR = 12;
   protected Profile holder;
   protected int accNumber;
   protected double balance;
   protected Date openOn;
   
   public abstract void applyInterestAndFee();
   public abstract String toString();
   
   public Account(String name, String phone)
   {
      openOn = new Date();
      balance = 0;
      holder = new Profile(name, phone);
      accNumber = numAccount++;
   }
   
   public boolean equals(Account a)
   {
      return(holder.equals(a.holder) && openOn.equals(a.openOn) && 
             (balance == a.balance) && (accNumber == a.accNumber));
   }
   
   public int getAccountNum()
   {
      return accNumber;
   }
}
