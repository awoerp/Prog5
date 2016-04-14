/**This class creates profile objects that get attached to accounts when
 * created. It contains two equals methods and a specific to string method
 * @author SteveWoerpel & AndyWoerpel
 */
public class Profile 
{
   private String name;
   private String phone;
   
   /**
    * creates a profile object based on a name and phone number
    * @param n
    * @param p 
    */
   public Profile(String n, String p)
   {
      name = n;
      phone = p;
   }
   
   /**
    * compares two profiles based on name and phone
    * @param p profile object
    * @return true if both are equal, false if not
    */
   public boolean equals(Profile p)
   {
      return(name.equals(p.name) && phone.equals(p.phone));
   }
   
   /**
    * compares two profiles based on name and phone
    * @param n
    * @param p
    * @return 
    */
   public boolean equals(String n, String p)
   {

      return(n.equals(name) && p.equals(phone));
   }
   
   /**
    * returns profile information as a string
    * @return 
    */
   public String toString()
   {
      return("Name:                         " + name + "\n" +
             "Phone:                        " + phone + "\n");
   }
   
   public String getName()
   {
      return name;
   }
   
   public String getPhoneNumber()
   {
      return phone;
   }
   
}
