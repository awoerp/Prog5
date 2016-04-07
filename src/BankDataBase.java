/**
 *
 * @author SteveWoerpel
 */
public class BankDataBase 
{
   private static final int GROW_SIZE = 2; //initial size and grow size
   private static final int NOT_FOUND = -1;
   private Account [] bank;
   private int num; 
   
   public BankDataBase()
   {
      num = 0;
   }
   
   private int find(Account a) //find the given Account; overloading
   {
      for(int i = 0; i < num; i++)
      {
         if(bank[i].equals(a))
            return i;
      }
      return NOT_FOUND;
   }
   
   private int find(int accno) //find the given account number; overloading
   {
      for(int i = 0; i < num; i++)
      {
         if(accno == bank[i].accNumber)
          
      }
      
   }
   
   private void grow() //grow the list by GROW_SIZE
   {
      if(num == bank.length)
      {
         Account [] temp = new Account[bank.length + GROW_SIZE];
         for(int i = 0; i < bank.length; i++)
         {
            temp[i].equals(bank[i]);
         }
         bank = temp;
      }
   }
           
   public boolean add(Account a) //add a to the list
   {
      num++;
      bank[num] = a;
      
   }
   
   public boolean remove(Account a) //remove a from the list
   {
      
   }
   
   public boolean contains(Account a) //return true is a is in the list
   {
      
   }
   
   public String toString() //concatenate all accounts to a string using ‘\n’ as the delimiter
   {
      
   }
   
   public int size() //return the number of accounts in the list 
   {
      return num;
   }

   
}
