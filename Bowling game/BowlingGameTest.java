
/**
 * Write a description of class BowlingGameTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import junit.framework.TestCase;
public class BowlingGameTest extends TestCase
{
    private Game g;
    
    protected void setUp() throws Exception
    {
         g = new Game();
    }
    
    private void rollMany(int n, int pins)
    {
      for (int x = 0; x <n; x++)
       {
           g.roll(pins);
       }
    }
    
    public void testGutterGame() throws Exception
    {
      rollMany(20, 0);
      assertEquals(0, g.score());
       
    }
    
    public void testAllOnes() throws Exception{
       rollMany(20, 1);
       assertEquals(20, g.score());
        
    }
    
//     public void testOneSpare() throws Exception
//     {
//         g.roll(5);
//         g.roll(5);
//         g.roll(3);
//         rollMany(17, 0);
//         assertEquals(16, g.score());
//     }
}
