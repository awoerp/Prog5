/**
 *
 * @author SteveWoerpel
 */
public class MoneyMarket extends Account
{
   private static final int FEE = 12;
   private static final double APY = .65;
   private static final double MIN_BAL = 2500;   
   private static final int WITHDRAW_LIMIT = 6;
   private int withdrawals;
   
   public MoneyMarket(String name, String phone)
   {
      super(name, phone);
      withdrawals = 0;
   }
   
   public void applyInterestAndFee()
   {
      
   }
   
   public String toString()
   {
      return("Account number:      " + Integer.toString(accNumber) + "\n" +
              holder.toString() +
             "Account Type:   Money Market" + "\n" +
             "Date Opened:" + openOn.toString());
   }
   
}
