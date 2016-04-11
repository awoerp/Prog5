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
         if(accno == bank[i].getAccountNum())
            return i;
      }
      return NOT_FOUND;  
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
      if(contains(a))
         return false;
      num++;
      bank[num] = a;
      return true;
   }
   
   public boolean remove(Account a) //remove a from the list
   {
      int index = find(a);
      if(index == NOT_FOUND)
         return false;
      for(int i = index; i < bank.length; i++)
      {
          bank[i] = bank[i + 1];
      }
      num--;
      return true;
   }
   
   public boolean contains(Account a) //return true is a is in the list
   {
      return find(a) != NOT_FOUND;
   }
   
   public String toString() //concatenate all accounts to a string using ‘\n’ as the delimiter
   {
      
   }
   
   public int size() //return the number of accounts in the list 
   {
      return num;
   }

   
}