/* Name: Nicholas Keen
 * Course: CIS 201 - Computer Science I
 * Section: 003
 * Assignment: 3
 */
public class Games{
    //Declare a constant representing
    //the number of games each team must
    //win to reach the max number of games
    public static final int ALL_GAMES = 3;
        public static void main(String[] args){
   
            //initialize a variable representing probability
            double probability = 1.0;
        
            //sets up a for loop starting at ALL_GAMES
            //and decreasing while greater than zero.
            for(double i = ALL_GAMES; i > 0; i--){
                //changes each respective value of ALL_GAMES by (2*i - 1)/(2*i)
                for(double j = (2.0*i - 1.0)/(2.0*i); j > 0; j--)
                //multiplies all the values together to find the probability
                probability = probability * j;
        }
        //prints out the final statement with the probability
        System.out.println("The probability that " + (2*ALL_GAMES + 1) + " games will need to be\nplayed" +
        " by two evenly matched teams to determine\na winner is " + probability);
    }
}