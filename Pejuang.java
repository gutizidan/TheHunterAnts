import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pejuang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pejuang extends Actor
{
    /**
     * Act - do whatever the Pejuang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int animateImage = 0;
    int animateSpeed = 5;
    int health = 3;
    int count;
    int jeda = 3;
    
    public int speed = 1;
    
    public Pejuang(){
        setImage("JK_P_Gun__Idle_000.png");
        getImage().scale(100,100);
        //getImage().rotate(-90);
    }
    public void act()
    {
        // Add your action code here.
        count++;
        animateIddle();
        if(Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY()-speed);
            animateRun(0);
        }
        if(Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY()+speed);
            animateRun(0);
        }
        if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX()-1, this.getY());
            animateRun(1);
        }
        if(Greenfoot.isKeyDown("right")){
                this.setLocation(this.getX()+1, this.getY());
                if (hitPembatas() == true)
                    {
                        setLocation(getX()-1, getY());
                    }
                animateRun(0);
        }
        if(Greenfoot.isKeyDown("space")){
                if (Greenfoot.isKeyDown("left")){
                    animateShoot(1);
                }else{
                    animateShoot(0);
                }
                jeda++;
                if(jeda >= 10){
                Greenfoot.playSound("shot.wav");
                Bullet gs = new Bullet();
                getWorld().addObject(gs, getX(), getY()+20);
                jeda = 0;
                }
        }
        
    }
    private void animateIddle(){
        if(count%animateSpeed ==0){
            if(animateImage==9){
                animateImage=1;
            }
            setImage("JK_P_Gun__Idle_00"+animateImage+".png");
            animateImage++;
            getImage().scale(100,100);
            //getImage().rotate(-90);
        }
    }
    private void animateRun(int mirror){
        if(count%animateSpeed ==0){
            if(animateImage==9){
                animateImage=1;
            }
            setImage("JK_P_Gun__Run_00"+animateImage+".png");
            animateImage++;
            getImage().scale(100,100);
            if(mirror == 1){
                getImage().mirrorHorizontally();
            }else{
                
            }
            //getImage().rotate(-90);
        }
    }
    private void animateShoot(int mirror){
        if(count%animateSpeed ==0){
            if(animateImage==9){
                animateImage=1;
            }
            setImage("JK_P_Gun__Attack_00"+animateImage+".png");
            animateImage++;
            getImage().scale(100,100);
            if(mirror == 1){
                getImage().mirrorHorizontally();
            }else{
                
            }
            //getImage().rotate(-90);
        }
    }
    private boolean hitPembatas(){
        if(this.getX()==200){
            return true;
        }
        else
        {
            return false;
        }
    }
}
