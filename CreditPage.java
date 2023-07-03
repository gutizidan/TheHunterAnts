import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditPage extends World
{

    /**
     * Constructor for objects of class CreditPage.
     * 
     */
    public CreditPage()
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
        BannerCredit bannerCredit = new BannerCredit();
        addObject(bannerCredit,405,277);
        Back back = new Back();
        addObject(back,241,84);
    }
}
