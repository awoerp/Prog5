/**
 *
 * @author SteveWoerpel
 */
public class Savings extends Account
{
   private static final int FEE = 5;
   private static final double APY = .25;
   private static final double MIN_BAL = 300;
   private boolean special; // the interest rate is .35 if this is true
   
   public Savings(String name, String phone, boolean ssa)
   {
      super(name, phone);
      special = ssa;
   }
   
   public void applyInterestAndFee()
   {
      
   }
   
   public String toString()
   {
      String specialAccount;
      if(special)
         specialAccount = "Yes";
      else 
         specialAccount = "No";
      
      return("Account number:      " + Integer.toString(accNumber) + "\n" +
              holder.toString() +
             "Account Type:   Savings" + "\n" +
             "Date Opened:    " + openOn.toString() + "\n" +
             "Special Account:      " + specialAccount + "\n");
   }
   
   
}

