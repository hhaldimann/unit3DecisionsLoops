
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @gcschmit
 * @version 19 July 2014
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
         *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4 
         *  0 - - X - - 
         *  1 - - X - - 
         *  2 X X X - - 
         *  3 - X X - - 
         *  4 - X - - -   
         *  
         */
        
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 0 && col == 2) ||
                        (row == 1 && col == 2) ||
                        (row == 2 && col == 0) ||
                        (row == 2 && col == 1) ||
                        (row == 2 && col == 2) ||
                        (row == 3 && col == 1)||
                        (row == 3 && col == 2)||
                        (row == 4 && col == 1))
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }

    @Test
    public void testFinalState()
    throws InterruptedException
    {
        /* expected pattern after 3 generations
         *  (X: alive; -: dead)
         *    0 1 2 3 4 
         *  0 - - - - - 
         *  1 - - X X - 
         *  2 - - - - - 
         *  3 - X X X - 
         *  4 - - - - - 
         *  
         */
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();
        for(int i =1; i<4; i++)
        {
            game.createNextGeneration();
            Thread.sleep(800);
            

        }
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row,col);
                
                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(    (row == 1 && col == 2) ||
                        (row == 1 && col == 3) ||
                        (row == 3 && col == 1) ||
                        (row == 3 && col == 2) ||
                        (row == 3 && col == 3))
                    {
                    
                     assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                 }
            }
        }   

    }   
}
