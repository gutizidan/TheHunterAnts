import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bullet(){
        getImage().scale(10,10);
    }
    public void act()
    {
        // Add your action code here.
        this.setLocation(getX()+10, getY());
        move(8);
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
        //Pejuang pejuang = new Pejuang();
        //mengenang jika menyentuh atas
        
    }
    }

