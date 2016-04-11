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
   
   public boolean equals(String n,String p)
   {
      return(holder.equals(n,p));
   }
   
   public boolean equals(Account a)
   {
      Object thisType = this.getClass();
      Object aType = a.getClass();
      boolean c = false;
      if(aType.equals(thisType))
      {
         c = true;
      }

      boolean b = holder.equals(a.holder);
      return c && b;
   }
   
   public int getAccountNum()
   {
      return accNumber;
   }
}
