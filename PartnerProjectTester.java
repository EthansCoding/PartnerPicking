public class PartnerProjectTester
{
   public static void main(String[] args)
   {
      PartnerProject proj = new PartnerProject("Math Test", 90);
      proj.beginActivity();
      System.out.println(proj.choosePartners());
      System.out.println(proj.partnersRemaining());
      proj.endActivity();
      System.out.println(proj.partnersRemaining());
   }
}