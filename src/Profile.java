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
   
   public boolean equals(Profile p)
   {
      return(name.equals(p.name) && phone.equals(p.phone));
   }
   
   public boolean equals(String n, String p)
   {

      return(n.equals(name) && p.equals(phone));
   }
   
   public String toString()
   {
      return("Name:           " + name + "\n" +
             "Phone:          " + phone + "\n");
   }
}
