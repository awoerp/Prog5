/**This class is the abstract super class of the three account types,
 * checking, money market, and savings. It keeps track of the account
 * numbers also.
 *
 * @author SteveWoerpel  & Andy Woerpel
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
   
   /**
    * This constructor is used when super is called on a sub class
    * it takes a name and phone number to create a profile object
    * @param name
    * @param phone 
    */
   public Account(String name, String phone)
   {
      openOn = new Date();
      balance = 0;
      holder = new Profile(name, phone);
      accNumber = numAccount++;
   }

   /**
    * This method compares two profiles based on name and phone number
    * @param n
    * @param p
    * @return true if are equal, false if not
    */
   public boolean equals(String n,String p)
   {
      return(holder.equals(n,p));
   }
   
   /**
    * This method compares two accounts based on their type of subclass
    * used to initiate.
    * @param a general account
    * @return true if equal, false if not. 
    */
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
   
   /**
    * This method compares two accounts based on their name, phone number,
    * and account type.
    * @param n
    * @param p
    * @param type type of account, enum
    * @return true if equal, false if not
    */
   public boolean equals(String n,String p, E_accountType type)
   {
      Object accountClassType = this.getClass();
      Object dumbyAccount = new Checking(n,p, false);
      boolean accountTypesMatch = false;
      if(type == E_accountType.CHECKING && accountClassType.equals(dumbyAccount.getClass()))
         accountTypesMatch = true;
      dumbyAccount = new Savings(n,p, false);
      if(type == E_accountType.SAVINGS && accountClassType.equals(dumbyAccount.getClass()))
         accountTypesMatch = true;
      dumbyAccount = new MoneyMarket(n,p);
      if(type == E_accountType.MONEY_MARKET && accountClassType.equals(dumbyAccount.getClass()))
         accountTypesMatch = true;
      decreaseNumberOfAccounts();
      decreaseNumberOfAccounts();
      decreaseNumberOfAccounts();
      if(type == null)
         accountTypesMatch = true;
      return accountTypesMatch && holder.equals(new Profile(n,p));
   }
   
   /**
    * 
    * @return the account number of a given account
    */
   public int getAccountNum()
   {
      return accNumber;
   }
   
   /**
    * decrements the number of accounts
    */
   private void decreaseNumberOfAccounts()
   {
      numAccount--;
   }
}
