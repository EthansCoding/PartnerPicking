/*Completed by Ethan, and Elia
  1/16/2024, in class partnerProject*/
import java.util.Arrays;  
  
public class PartnerProject
{
   String actName;
   int actPoints;
   
   //Got these from another person
   String[] partnerNames = {"Holland and Alex", "Colin H., Luca" , "Colin C. and Nico", "Ethan and Elia", "Sebastian and Jake", "Landen and Natalie", "Kaiden and Morgan", "Aaron and Harvey", "Logan and Owen", "Willow and Josie", "Lydia and Marianna", "Kemka and Quentin", "Ella and JC", "Aiden and Olie", "Cove and Aesop"};
   String[] availablePartners;
   
   
   boolean isActivity = false;
   
   //Starts up the program, does some silly little starting stuff
   public PartnerProject(String Name, int points)
   {
      this.actName = Name;
      this.actPoints = points;
   }
   
   //begins the activity
   public void beginActivity()
   {
      this.isActivity = true;
      this.availablePartners = this.partnerNames;
      System.out.println("We are ready to rumble");
   }
   
   //ends the activity
   public void endActivity()
   {
      this.isActivity = false;
      System.out.println("POWERING DOWN");
   }
   
   
   //chooses a partner group
   public String choosePartners()
   {
      if (this.isActivity == true)
      {
         int chooseInt = (int)(Math.random() * this.availablePartners.length);
         String toReturn = availablePartners[chooseInt];
         
         String[] newAvailablePartners = new String[this.availablePartners.length - 1];
         int j = 0;
         for (int i = 0; i < this.availablePartners.length; i++) {
            if (i != chooseInt) {
               newAvailablePartners[j++] = this.availablePartners[i];  
            }   
         }
         this.availablePartners = newAvailablePartners;
         return toReturn;
      }
      else
      {
         int chooseInt = (int)(Math.random() * this.partnerNames.length);
         String toReturn = this.partnerNames[chooseInt];
         return toReturn;
      }
   }
   
   //shows partners remaining
   public String partnersRemaining()
   {
      if (this.isActivity == true)
      {
         String statement = "The partners remaining are: ";
         for (String S: availablePartners)
         {
            if (S != null)
            {
               statement = (statement + S + ", ");
            }
         }
         return statement;
      }
      else
      {
         return "No activity has begun";
      }
   }
}