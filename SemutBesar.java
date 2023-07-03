import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SemutBesar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SemutBesar extends Actor
{
    /**
     * Act - do whatever the SemutBesar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int triggerStage = 10;
    int animateImage = 1;
    int animateSpeed = 1;
    int health = 5;
    int count;
    public SemutBesar(){
        setImage("semut1 - Copy.png");
        getImage().scale(160,160);
        getImage().rotate(-90);
    }
    public void act()
    {
        // Add your action code here.
        count++;
        animate();
        hitBullet();
        //this.setLocation(this.getX()-Greenfoot.getRandomNumber(2), this.getY());
        move(-1);
       
    }
    public void animate(){
        if(count%animateSpeed ==0){
            if(animateImage==62){
                animateImage=1;
            }
            setImage("semut"+animateImage+".png");
            animateImage++;
            getImage().scale(160,160);
            getImage().rotate(-90);
        }
    }
    public void hitBullet(){
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if (bullet != null){
            health--;
            getWorld().removeObject(bullet);
        }
        if (health == 0){
            MyWorld.score.add(4);
            deleteObject();
        }
    }
    public void deleteObject(){
        getWorld().removeObject(this);
    }
}