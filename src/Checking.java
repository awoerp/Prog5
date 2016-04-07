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
   
   public Checking(String name, String phone)
   {
      super(name, phone);
      directDeposit = false;
   }
   
   public void applyInterestAndFee()
   {
      
   }
   
   public String toString()
   {
      return null;
   }
   
   
}
