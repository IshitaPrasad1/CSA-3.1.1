/*
 * Activity 3.1.1
 */
public class GoalKeeper
{
  public static void main(String[] args)
  {    
    //int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    
    // CODE TO ADD
    int[] goals = {1};

    System.out.println(goals);

    //response #2: Find the maximum number of goals scored in a single game
    int maxGoals = goals[0];  
        for (int i = 1; i < goals.length; i++) {
            if (goals[i] > maxGoals) {
                maxGoals = goals[i];
            }
        }
    System.out.println("Maximum goals in a game: " + maxGoals);

    //response #3: Update the number of goals scored in Game 3 to 1
    goals[2] = 1;  // Set Game 3 goals to 1
    System.out.println("Updated goals for Game 3: " + goals[2]);

  }
}