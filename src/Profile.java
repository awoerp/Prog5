/**
 *
 * @author SteveWoerpel
 */
public class Profile 
{
   private String name;
   private String phone;
   
   public Profile(String n, String p)
   {
      name = n;
      phone = p;
   }
   
   public boolean equals(Object obj)
   {
      if(obj instanceof Profile)
      {
         Profile temp = (Profile) obj;
         return(name.equals(temp.name) && phone.equals(temp.phone));
      }
      return false;
   }
   
   public String toString()
   {
      return name + ' ' + phone;
   }
}
