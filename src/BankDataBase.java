/**This class is the bag that holds the different types of accounts. 
 * It uses a growable bag with common methods such as add, remove, find,
 * contains, grow, and several methods that return information as strings.
 * @author SteveWoerpel & Andy Woerpel
 */
public class BankDataBase 
{
   private static final int GROW_SIZE = 2; //initial size and grow size
   private static final int NOT_FOUND = -1;
   private Account [] bank;
   private int num;
   
   /**
    * creates a new object and initilizes the array and number of items
    * in the array
    */
   public BankDataBase()
   {
      bank = new Account[GROW_SIZE];
      num = 0;
   }
   
   /**
    * searches the array for a specific account.
    * @param a
    * @return index of account
    */
   private int find(Account a) //find the given Account; overloading
   {
      for(int i = 0; i < num; i++)
      {
         if(bank[i].equals(a))
            return i;
      }
      return NOT_FOUND;
   }

   /**
    * finds an account index based on an account number
    * @param accno
    * @return index of account
    */
   private int find(int accno) //find the given account number; overloading
   {
      for(int i = 0; i < num; i++)
      {
         if(accno == bank[i].getAccountNum())
            return i;
      }
      return NOT_FOUND;
   }
   
   /**
    * finds all accounts based on just name and phone, then uses equals
    * method to find correct method.
    * @param name
    * @param phone
    * @return account object
    */
   public Account find(String name, String phone)
   {
      for(int i = 0; i < num; i++)
      {
         if(bank[i].equals(name, phone))
            return bank[i];
      }
      return null;
   }
   
   /**
    * finds an account based on the name, phone number, and account type
    * @param name
    * @param phone
    * @param type
    * @return account object
    */
   public Account find(String name, String phone, E_accountType type)
   {
      for(int i = 0; i < num; i++)
      {
         if(bank[i].equals(name, phone, type))
            return bank[i];
      }
      return null;
   }
   
   /**
    * increases size of bag if size is maxed out
    */
   private void grow() //grow the list by GROW_SIZE
   {
      if(num == bank.length)
      {
         Account [] temp = new Account[bank.length + GROW_SIZE];
         for(int i = 0; i < bank.length; i++)
         {
            temp[i] = (bank[i]);
         }
         bank = temp;
      }
   }
   
   /**
    * adds an account to the bag
    * @param a
    * @return true if it was successful, false if not
    */
   public boolean add(Account a) //add a to the list
   {
      if(contains(a))
         return false;
      if(num == bank.length)
         grow();
      bank[num] = a;
      num++;
      return true;
   }
   
   /**
    * removes an account from the bag
    * @param a
    * @return true if successful, false if not.
    */
   public boolean remove(Account a) //remove a from the list
   {
      int index = find(a);
      if(index == NOT_FOUND)
         return false;
      bank[index] = null;
      for(int i = index; i < bank.length - 1; i++)
      {
         bank[i] = bank[i + 1];
      }
      num--;
      return true;
   }
   
   /**
    * checks to see if an account is in the bag
    * @param a
    * @return true if it is, false if not
    */
   public boolean contains(Account a) //return true is a is in the list
   {
      if(a == null)
         return false;
      return (find(a) != NOT_FOUND);
   }
   
   /**
    * returns all accounts in bag as one big string.
    * @return string
    */
   public String toString() //concatenate all accounts to a string using ‘\n’ as the delimiter
   {
      String combo = "";
      for(int i = 0; i < num; i++)
      {
         combo += bank[i].toString() + "\n\n";
      }
      return combo;
   }
   
   /**
    * returns the size of the bag
    * @return 
    */
   public int size() //return the number of accounts in the list 
   {
      return num;
   }
  
   /**
    * returns the date of the most recent account added to the bag
    * @return 
    */
   public String printDateMostRecent()
   {
      return(bank[num - 1].openOn.toString());
   }
   
   /**
    * returns the account number of the most recent account added to the
    * bag
    * @return 
    */
   public int recentAccNum()
   {
      return(bank[num - 1].getAccountNum());
   }
   
   /**
    * returns the most recent object added to the bag.
    * @return 
    */
   public Account peek()
   {
      return(bank[num - 1]);
   }
}