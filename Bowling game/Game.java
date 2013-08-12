
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    private int rolls[] = new int[21];
    private int currentRoll = 0;
    public void roll(int pins){
        rolls[currentRoll++] = pins;
    }
    
    public int score(){
        int score = 0;
        int x = 0;
        for (int frame = 0; frame< 10; frame++)
        {
            if (rolls[x] + rolls[x+1] == 10) //its a spare
            {
                score += 10 + rolls[x +2];
                x +=2;
            }
            else
            {
                score += rolls[x] + rolls [x+1];
                x += 2;
            }
        }
        return score;
    }
}
