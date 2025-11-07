/*
 * Activity 3.1.1
 */
public class Partners
{
  public static void main(String[] args)
  {    
    String[] days= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    String[] partners = new String[7];
    System.out.println("initial value of first partner" + partners[0]);

    partners[1] = "alexa";
    partners[3] = "katie";    
    partners[5] = "maddie";

    System.out.println("practice partner: " + partners[1]);
    System.out.println("practice partner: " + partners[3]);
    System.out.println("practice partner: " + partners[5]);

  String[] friendPartners = partners;

  System.out.println("Friend's " +days[1] + " practice partner: " + friendPartners[1]);
  System.out.println("Friend's " +days[3] + " practice partner: " + friendPartners[3]);
  System.out.println("Friend's " +days[5] + " practice partner: " + friendPartners[5]);
  }

}