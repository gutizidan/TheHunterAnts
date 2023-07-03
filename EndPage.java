import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndPage extends World
{

    /**
     * Constructor for objects of class EndPage.
     * 
     */
    public EndPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TextEnd textEnd = new TextEnd();
        addObject(textEnd,399,135);
        Exit exit = new Exit();
        addObject(exit,405,357);
        
        showText("Score Kamu : " + MyWorld.score.getValue(), 400, 250);
    }
}
