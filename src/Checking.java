/**
 *
 * @author SteveWoerpel chetttttt
 */
public class Checking extends Account 
{
   private static final int FEE = 25;
   private static final double APY = .05;
   private static final double MIN_BAL = 1500;
   private boolean directDeposit; //no fees if this is true
   
   public Checking(String name, String phone, boolean dd)
   {
      super(name, phone);
      directDeposit = dd;
   }
   
   public void applyInterestAndFee()
   {
      
   }
   
   public String toString()
   {
      return(holder.toString() +
             "Account number: " + Integer.toString(accNumber) + "\n" +
             "Account Type:   Checking" + "\n" +
             "Date Opened:    " + openOn.toString());
   }
   
   
}
